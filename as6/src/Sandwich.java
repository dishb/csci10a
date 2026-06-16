
/**
 * Prints a sandwich order using while loops and user input.
 *
 * @author Dishant Bhandula
 * @version 6/16/26
 */
import java.util.Scanner;

public class Sandwich
{
    public static void main(String[] args)
    {
        int customer = 0;

        while (customer < 5) {
            System.out.println("Next customer!");
            burger();
            customer = customer + 1;
            System.out.println();
        }
    }

    public static void burger()
    {
        Scanner keyboard = new Scanner(System.in);
        int line;
        int lettuce;
        int tomatoes;

        // Print the Hamburger Palace sign.
        System.out.println(" ******************************");
        line = 0;
        while (line < 5) {
            System.out.println("*                            *");
            line = line + 1;
        }
        System.out.println("* Dr. Kow's Hamburger Palace *");
        line = 0;
        while (line < 5) {
            System.out.println("*                            *");
            line = line + 1;
        }
        System.out.println(" ******************************");
        System.out.println();

        // Ask how much of the toppings the user wants (reject negative numbers).
        do {
            System.out.println("How many layers of lettuce do you want?");
            lettuce = keyboard.nextInt();
        } while (lettuce < 0);

        do {
            System.out.println("How many layers of tomatoes do you want?");
            tomatoes = keyboard.nextInt();
        } while (tomatoes < 0);

        // Print out the result to the screen.
        System.out.println("Here's your sandwich:");
        System.out.println();
        System.out.println("(_________)");

        line = 0;
        while (line < lettuce) {
            System.out.println(" ~~~~~~~~~");
            line = line + 1;
        }

        line = 0;
        while (line < tomatoes) {
            System.out.println(" [  ] [  ]");
            line = line + 1;
        }

        System.out.println();
        System.out.println("*********");
        System.out.println("(_________)");

        keyboard.close();
    }
}
