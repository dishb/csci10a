
/**
 * A simple guess the number game.
 *
 * @author Dishant Bhandula
 * @version 6/16/26
 */

import java.util.Scanner;

public class Guess {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
		int secret = (int)Math.round(100 * Math.random());
        int tries = 0;
		int userGuess; //stores the user's most recent guess
		do {
            System.out.println("Please enter an integer guess.");
            userGuess = s.nextInt();
            tries++;
            if (userGuess > secret) {
                System.out.println("too high");
            } else if (userGuess < secret) {
                System.out.println("too low");
            }
		} while (userGuess != secret); //keep looping back as long as the guess was wrong

        System.out.println("You guessed the number correctly! It took you " + tries + " tries.");
    
        s.close();
    }
}

/*
Output:

Please enter an integer guess.
50
too high
Please enter an integer guess.
25
too low
Please enter an integer guess.
44
too high
Please enter an integer guess.
30 
too high
Please enter an integer guess.
26
too low
Please enter an integer guess.
27
too low
Please enter an integer guess.
29
You guessed the number correctly! It took you 7 tries.
*/
