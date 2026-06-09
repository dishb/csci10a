/**  CORRECT THE ERRORS! Find all 8 (or more?), if you dare!		
 *
 * A program that reads an age that is typed in by the
 * user and insults them 
 */
import java.util.*;
 
public class AgeInsult {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);  // creates a link to the keyboard
		System.out.println("How old are you?");
		int age = keyboard.nextInt();            // reads a double value from user    

		//Exactly one of these 4 main blocks will be executed.
		if (age <= 3) {
			System.out.println("Too young to know any better.");
		
		} else if (age < 10) {
			System.out.println("Not ready for prime time.");
		} else if (age < 18) {
			System.out.println("Grow up.");
		} else { // you may be tempted to just ADD an "if" after else
                                  // but the best fix is to DELETE (age >= 18)
                                  // since it's redundant. Try both ways! Then 
				  // leave it in the second way!!
                                  // Why is (age >= 18) redundant? 
                                  // Because we only visit the last else if all 
                                  // the other conditions above are false.
                                  // The previous condition was (age < 18)
                                  // If that was false then we know age must be >= 18
                                  // So you don't have to write it ... just say else {
			System.out.println("Get a job!");
		}

		//if statement without "else if" or even an "else".
		//  this will either execute or not execute depending on age
		if (age > 120) {
			System.out.println("Way too old!  You are probably lying.");
		}

		keyboard.close();
    }
}

/*
Output for problem 2:

---------------------------
2
Too young to know any better.
---------------------------

---------------------------
How old are you?
5
Not ready for prime time.
---------------------------

---------------------------
How old are you?
13
Grow up.
---------------------------

---------------------------
How old are you?
25
Get a job!
---------------------------

---------------------------
How old are you?
125
Get a job!
Way too old!  You are probably lying.
---------------------------
*/
