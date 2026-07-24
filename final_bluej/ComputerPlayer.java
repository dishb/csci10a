import java.util.Scanner;

/**
 * A simple computer Scrabble player.
 * Looks through the dictionary for a word it can make from its rack.
 *
 * @author Dishant Bhandula
 * @version 7/23/26
 */
public class ComputerPlayer extends Player {
    public ComputerPlayer(String name) {
        super(name);
    }

    @Override
    public String chooseWord(Scanner keyboard, Dictionary dictionary) {
        printRack();
        System.out.println();
        System.out.println("  " + getName() + " is thinking...");

        String bestWord = null;
        int bestScore = -1;

        // Determine the best word to play that can maximize the score.
        for (int i = 0; i < dictionary.size(); i++) {
            String word = dictionary.getWord(i);

            // Skip words that are too short or too long for the rack.
            if (word.length() < 2 || word.length() > getRack().size()) {
                continue;
            }

            if (canForm(word)) {
                int score = scoreOfWord(word);
                if (score > bestScore) {
                    bestScore = score;
                    bestWord = word;
                }
            }
        }

        if (bestWord == null) {
            return null;
        }

        return bestWord;
    }

    /**
     * Adds up the tile values for a word using the current rack.
     * Does not remove tiles from the rack.
     */
    private int scoreOfWord(String word) {
        word = word.toUpperCase();
        int points = 0;
        boolean[] used = new boolean[getRack().size()];

        for (int i = 0; i < word.length(); i++) {
            char needed = word.charAt(i);
            int match = -1;

            // Prefer a regular matching letter.
            for (int r = 0; r < getRack().size(); r++) {
                if (!used[r] && !getRack().get(r).isBlank()
                        && getRack().get(r).getLetter() == needed) {
                    match = r;
                    break;
                }
            }

            // Otherwise use a blank.
            if (match == -1) {
                for (int r = 0; r < getRack().size(); r++) {
                    if (!used[r] && getRack().get(r).isBlank()) {
                        match = r;
                        break;
                    }
                }
            }

            // If a match is found, add the points to the total.
            if (match != -1) {
                used[match] = true;
                points += getRack().get(match).getValue();
            }
        }

        return points;
    }
}
