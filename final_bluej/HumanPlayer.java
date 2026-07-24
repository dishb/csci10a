import java.util.Scanner;

/**
 * A human Scrabble player who types words at the console.
 *
 * @author Dishant Bhandula
 * @version 7/23/26
 */
public class HumanPlayer extends Player {
    public HumanPlayer(String name) {
        super(name);
    }

    @Override
    public String chooseWord(Scanner keyboard, Dictionary dictionary) {
        printRack();
        System.out.println();
        System.out.print("  Your move (word / PASS / QUIT): ");
        String input = keyboard.next().trim().toUpperCase();

        if (input.equals("PASS") || input.equals("P")) {
            return null;
        }
        if (input.equals("QUIT") || input.equals("Q")) {
            return "QUIT";
        }
        return input;
    }
}
