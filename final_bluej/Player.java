import java.util.ArrayList;
import java.util.Scanner;

/**
 * Base class for a Scrabble player.
 * Subclasses decide how a word is chosen each turn.
 *
 * @author Dishant Bhandula
 * @version 7/23/26
 */
public class Player {
    private String name;
    private int score;
    private ArrayList<Tile> rack;

    public Player(String name) {
        this.name = name;
        this.score = 0;
        this.rack = new ArrayList<Tile>();
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public ArrayList<Tile> getRack() {
        return rack;
    }

    public void addScore(int points) {
        score += points;
    }

    public void addTile(Tile tile) {
        if (tile != null) {
            rack.add(tile);
        }
    }

    public void fillRack(TileBag bag, int rackSize) {
        while (rack.size() < rackSize && !bag.isEmpty()) {
            addTile(bag.draw());
        }
    }

    public void printRack() {
        System.out.print("  " + name + "'s rack:  ");
        for (int i = 0; i < rack.size(); i++) {
            System.out.print("[ " + rack.get(i) + " ] ");
        }
        System.out.println();
    }

    /**
     * Checks whether the player's rack has the letters needed for word.
     * Blank tiles may stand in for missing letters.
     */
    public boolean canForm(String word) {
        word = word.toUpperCase();
        boolean[] used = new boolean[rack.size()];

        for (int i = 0; i < word.length(); i++) {
            char needed = word.charAt(i);
            int match = -1;

            // First try a regular matching letter.
            for (int j = 0; j < rack.size(); j++) {
                if (!used[j] && !rack.get(j).isBlank()
                        && rack.get(j).getLetter() == needed) {
                    match = j;
                    break;
                }
            }

            // If none found, try a blank tile.
            if (match == -1) {
                for (int j = 0; j < rack.size(); j++) {
                    if (!used[j] && rack.get(j).isBlank()) {
                        match = j;
                        break;
                    }
                }
            }

            if (match == -1) {
                return false;
            }
            used[match] = true;
        }

        return true;
    }

    /**
     * Removes tiles used by word from the rack and returns their point total.
     */
    public int playWord(String word) {
        word = word.toUpperCase();
        boolean[] used = new boolean[rack.size()];
        int points = 0;

        for (int i = 0; i < word.length(); i++) {
            char needed = word.charAt(i);
            int match = -1;

            for (int j = 0; j < rack.size(); j++) {
                if (!used[j] && !rack.get(j).isBlank()
                        && rack.get(j).getLetter() == needed) {
                    match = j;
                    break;
                }
            }

            if (match == -1) {
                for (int j = 0; j < rack.size(); j++) {
                    if (!used[j] && rack.get(j).isBlank()) {
                        match = j;
                        break;
                    }
                }
            }

            if (match == -1) {
                return -1;
            }

            used[match] = true;
            points += rack.get(match).getValue();
        }

        // Remove used tiles from highest index to lowest.
        for (int i = used.length - 1; i >= 0; i--) {
            if (used[i]) {
                rack.remove(i);
            }
        }

        addScore(points);
        return points;
    }

    /**
     * Asks this player for a word (or pass/quit).
     * Returns null to pass, "QUIT" to end the game, or a proposed word.
     * Subclasses override this method.
     */
    public String chooseWord(Scanner keyboard, Dictionary dictionary) {
        return null;
    }

    public String toString() {
        return name + " (" + score + " pts)";
    }
}
