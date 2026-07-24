import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Console-based Scrabble game for CSCI10A final project.
 *
 * Players take turns forming dictionary words from their racks.
 * The first player to reach 50 points wins.
 *
 * @author Dishant Bhandula
 * @version 7/23/26
 */
public class ScrabbleGame {
    private static final int RACK_SIZE = 7;
    private static final int MAX_PASSES = 4;
    private static final int WIN_SCORE = 50;

    private TileBag bag;
    private Dictionary dictionary;
    private Player[] players;
    private Scanner keyboard;
    private String endReason;

    public ScrabbleGame() {
        bag = new TileBag();
        dictionary = new Dictionary();
        keyboard = new Scanner(System.in);
        endReason = "";
    }

    public static void main(String[] args) throws FileNotFoundException {
        ScrabbleGame game = new ScrabbleGame();
        game.start();
    }

    public void start() throws FileNotFoundException {
        printWelcome();

        System.out.print("  Enter your name: ");
        String humanName = keyboard.next().trim();
        if (humanName.length() == 0) {
            humanName = "Player";
        }

        players = new Player[2];
        players[0] = new HumanPlayer(humanName);
        players[1] = new ComputerPlayer("Computer");

        System.out.println();
        System.out.println("  Loading tiles and dictionary...");
        bag.fillFromFile("tiles.txt");
        dictionary.loadFromFile("words.txt");
        System.out.println("  Ready! " + bag.size() + " tiles in the bag.");
        System.out.println("  First to " + WIN_SCORE + " points wins.");
        System.out.println("  Remember: only " + MAX_PASSES
                + " passes are allowed in total!");
        System.out.println();

        for (int i = 0; i < players.length; i++) {
            players[i].fillRack(bag, RACK_SIZE);
        }

        play();
        declareWinner();
        keyboard.close();
    }

    private void play() {
        int totalPasses = 0;
        boolean quit = false;
        boolean someoneWon = false;
        int turn = 0;

        // Main game loop.
        while (!quit && !someoneWon && totalPasses < MAX_PASSES) {
            Player current = players[turn % players.length];

            printDivider();
            printScores();
            System.out.println();
            System.out.println("  >>> " + current.getName() + "'s turn <<<");
            System.out.println("  Tiles left in bag: " + bag.size());
            System.out.println("  Passes used:       " + totalPasses
                    + " / " + MAX_PASSES);
            System.out.println();

            // One turn for a player.
            boolean turnFinished = false;
            while (!turnFinished && !quit) {
                String word = current.chooseWord(keyboard, dictionary);

                if (word != null && word.equals("QUIT")) {
                    quit = true;
                    turnFinished = true;
                    endReason = "Game ended early.";
                } else if (word == null) {
                    totalPasses++;
                    System.out.println();
                    System.out.println("  " + current.getName() + " passes. ("
                            + totalPasses + " / " + MAX_PASSES + " total)");
                    if (totalPasses >= MAX_PASSES) {
                        System.out.println();
                        System.out.println("  " + MAX_PASSES
                                + " passes used up — game over!");
                    }
                    System.out.println();
                    turnFinished = true;
                } else if (!dictionary.contains(word)) {
                    System.out.println();
                    System.out.println("  \"" + word + "\" is not in the dictionary.");
                    System.out.println();
                    if (current instanceof HumanPlayer) {
                        System.out.println("  Try again!");
                        System.out.println();
                    } else {
                        totalPasses++;
                        turnFinished = true;
                    }
                } else if (!current.canForm(word)) {
                    System.out.println();
                    System.out.println("  You don't have the letters for \"" + word + "\".");
                    System.out.println();
                    if (current instanceof HumanPlayer) {
                        System.out.println("  Try again!");
                        System.out.println();
                    } else {
                        totalPasses++;
                        turnFinished = true;
                    }
                } else {
                    int points = current.playWord(word);
                    System.out.println();
                    System.out.println("  *** " + current.getName() + " plays \"" + word
                            + "\" for " + points + " points! ***");
                    System.out.println("  " + current.getName() + " now has "
                            + current.getScore() + " / " + WIN_SCORE + " points.");
                    System.out.println();
                    current.fillRack(bag, RACK_SIZE);
                    turnFinished = true;

                    if (current.getScore() >= WIN_SCORE) {
                        someoneWon = true;
                        endReason = current.getName() + " reached " + WIN_SCORE + " points!";
                    }
                }
            }

            if (bag.isEmpty() && allRacksEmpty()) {
                endReason = "No tiles left to play.";
                break;
            }

            if (totalPasses >= MAX_PASSES) {
                endReason = MAX_PASSES + " passes used in total — no more passes left.";
            }

            turn++;
        }

        if (endReason.length() == 0) {
            endReason = "Game over.";
        }
    }

    private void declareWinner() {
        printDivider();
        System.out.println("              GAME OVER");
        printDivider();
        System.out.println();
        System.out.println("  " + endReason);
        System.out.println();
        printScores();
        System.out.println();

        // After too many passes, the player with fewer points loses.
        if (players[0].getScore() > players[1].getScore()) {
            System.out.println("  *** " + players[0].getName() + " wins! ***");
            if (endReason.indexOf("passes") >= 0) {
                System.out.println("  " + players[1].getName()
                        + " loses (could not make a word in time).");
            }
        } else if (players[1].getScore() > players[0].getScore()) {
            System.out.println("  *** " + players[1].getName() + " wins! ***");
            if (endReason.indexOf("passes") >= 0) {
                System.out.println("  " + players[0].getName()
                        + " loses (could not make a word in time).");
            }
        } else {
            System.out.println("  It's a tie!");
        }
        System.out.println();
        printDivider();
    }

    private void printScores() {
        System.out.println("  SCOREBOARD  (first to " + WIN_SCORE + ")");
        System.out.println("  --------------------------------------");
        for (int i = 0; i < players.length; i++) {
            Player p = players[i];
            int score = p.getScore();

            System.out.print("  ");
            printPadded(p.getName(), 12);
            printPadded(score + "", 2);
            System.out.print(" pts  ");
            printProgressBar(score);
            System.out.println();
        }
        System.out.println("  --------------------------------------");
    }

    /**
     * Prints text, then spaces, so columns line up (fixed width).
     */
    private void printPadded(String text, int width) {
        System.out.print(text);
        int spaces = width - text.length();
        for (int s = 0; s < spaces; s++) {
            System.out.print(" ");
        }
    }

    /**
     * Prints a simple text bar showing progress toward WIN_SCORE.
     */
    private void printProgressBar(int score) {
        int filled = score * 10 / WIN_SCORE;
        if (filled > 10) {
            filled = 10;
        }
        System.out.print("[");
        for (int i = 0; i < 10; i++) {
            if (i < filled) {
                System.out.print("#");
            } else {
                System.out.print("-");
            }
        }
        System.out.print("]");
    }

    private void printDivider() {
        System.out.println("========================================");
    }

    /**
     * Checks if all players' racks are empty.
     * Used to determine if the game should end when the bag is empty.
     */
    private boolean allRacksEmpty() {
        for (int i = 0; i < players.length; i++) {
            if (!players[i].getRack().isEmpty()) {
                return false;
            }
        }
        return true;
    }

    private void printWelcome() {
        printDivider();
        System.out.println("         CONSOLE SCRABBLE");
        printDivider();
        System.out.println();
        System.out.println("  Form words from your 7-letter rack.");
        System.out.println("  First player to " + WIN_SCORE + " points wins!");
        System.out.println();
        System.out.println("  Pass rule:");
        System.out.println("    Players may pass if they cannot make a word.");
        System.out.println("    Only " + MAX_PASSES + " passes are allowed in total");
        System.out.println("    (for the whole game, not in a row).");
        System.out.println("    After " + MAX_PASSES + " passes, the game ends");
        System.out.println("    and the player with fewer points loses.");
        System.out.println();
        System.out.println("  Commands:");
        System.out.println("    WORD   - play a word from your rack");
        System.out.println("    PASS   - skip your turn");
        System.out.println("    QUIT   - end the game");
        System.out.println();
        System.out.println("  Tip: blank tiles (#) can be any letter.");
        System.out.println();
        printDivider();
        System.out.println();
    }
}
