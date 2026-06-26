
import java.util.Scanner;

/**
 * WordOfFortune is a word guessing game.
 * Player 1 inputs a secret word and Player 2 guesses until they get it right.
 * After each guess, the program provides feedback on correct letters and hints.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class WordOfFortune
{
    /**
     * Main method that runs the WordOfFortune guessing game.
     * Player 1 enters a secret word, then Player 2 makes guesses until correct.
     * The program provides feedback on letter matches and hints after multiple guesses.
     *
     * @param args command line arguments (not used)
     */
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Player 1, enter a secret word, from 3-10 letters");
        String secret = scan.nextLine();
        System.out.print("\f");
        
        String guess = "";
        int count = 0;
        
        do
        {
            System.out.println("Player 2, enter a guess, it should have " + secret.length() + " letters");
            guess = scan.nextLine();
            count++;
            
            if (guess.length() != secret.length())
            {
                System.out.println("Wrong number of letters!");
            }
            else
            {
                printCorrectLetters(secret, guess);
                
                if (count >= 3 && secret.charAt(0) != guess.charAt(0))
                {
                    System.out.println("The first letter is " + secret.charAt(0));
                }
            }
        } while (!secret.equals(guess));
        
        System.out.println("You got it in " + count + " guesses!");
    }
    
    /**
     * Prints the correct letters from the guess in their correct positions,
     * and prints hyphens (-) for letters that don't match the secret word.
     *
     * @param secret the secret word to compare against
     * @param guess the player's guess to check
     */
    public static void printCorrectLetters(String secret, String guess)
    {
        for (int i = 0; i < guess.length(); i++)
        {
            if (secret.charAt(i) == guess.charAt(i))
            {
                System.out.print(guess.charAt(i));
            }
            else
            {
                System.out.print("-");
            }
        }
        System.out.println();
    }
}

/*
Output:

Player 1, enter a secret word, from 3-10 letters
camel

Player 2, enter a guess, it should have 5 letters
bricks
Wrong number of letters!
Player 2, enter a guess, it should have 5 letters
brick
-----
Player 2, enter a guess, it should have 5 letters
bread
-----
The first letter is c
Player 2, enter a guess, it should have 5 letters
craps
c----
Player 2, enter a guess, it should have 5 letters
camps
cam--
Player 2, enter a guess, it should have 5 letters
camel
camel
You got it in 6 guesses!

*/
