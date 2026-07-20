import java.util.Scanner;
/**
 * Write a description of class PairOfDiceTestApp here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PairOfDiceTestApp
{
    public static void main(String [] args)
    {
       /*********** Problem 6 ******************************
       //  Do problems 1-4 in the PairOfDice class first
       // 6) Verify your class works by running this program */
       PairOfDice dice1 = new PairOfDice();       
       dice1.print();
        
       PairOfDice dice2 = new PairOfDice(3, 4);
       dice2.print();        
        
       //***************** end problem 6 ********************/
       /************ Problem 7 ******************************
       // 7) Add a getTotal method to the PairOfDice class that
       //    returns the sum of the two die instance variables 
       //    of a dice object. 
       //
       // Then use your new method in two print statements below 
       // to print the totals for your dice1 and dice2 objects 
       //  (should be 2 and 7) */
       System.out.println("the total value of dice1 = " + dice1.getTotal());
       System.out.println("the total value of dice2 = " + dice2.getTotal());
       
       //***************** end problem 7 *******************/
       /************ Problem 8 ******************************
       // 8) Add code to compare the totals of two dice objects
       //    and print the object that has the higher total */
       if (dice1.getTotal() > dice2.getTotal())
       {
           dice1.print();
       }
       else if (dice2.getTotal() > dice1.getTotal())
       {
           dice2.print();
       }
       else
       {
           System.out.println("Both pairs of dice have the same total");
       }
       
       //***************** end problem 8 *******************/
       /************ Problem 9 ******************************
       // Add a void roll method to the PairOfDice class 
       //  (see assignment handout for instructions) 
       // Execute the following statements to make sure your
       // roll method works right */
        
       dice1.roll();    
       System.out.print("rolling....dice1 ");
       dice1.print();
       
       dice2.roll();
       System.out.print("rolling....dice2 now = ");
       dice2.print();       

       dice1.roll();    
       System.out.print("rolling....dice1 now = ");
       dice1.print();
       
       dice2.roll();
       System.out.print("rolling....dice2 now = ");
       dice2.print();
       
       //***************** end problem 9 *******************/
       /************ Problem 10 ******************************
       // Challenge: Write a do-while loop that rolls dice1 
       // until a value of 12 (boxcars!) is rolled, and after the loop, 
       // print the number of rolls it took to get boxcars. */
       int rolls = 0;
       do
       {
           dice1.roll();
           rolls++;
       } while (dice1.getTotal() != 12);
       System.out.println("It took " + rolls + " rolls to get boxcars on dice1");
       
       //***************** end problem 10 *******************/
       /************ Problem 11 ******************************
       // Extra Challenge: Write a do-while loop that rolls BOTH dice1 
       // and dice2 until ONE or more of them has a value of 12, 
       // and after the loop, print which object, dice1 or dice2
       // (or both) rolled the 12. */
       do
       {
           dice1.roll();
           dice2.roll();
       } while (dice1.getTotal() != 12 && dice2.getTotal() != 12);

       if (dice1.getTotal() == 12 && dice2.getTotal() == 12)
       {
           System.out.println("Both dice1 and dice2 rolled boxcars!");
       }
       else if (dice1.getTotal() == 12)
       {
           System.out.println("dice1 rolled boxcars!");
       }
       else
       {
           System.out.println("dice2 rolled boxcars!");
       }
       
       //***************** end problem 11 *******************/       
    }
   
}

/*
Output:

die1 = 1 and die2 = 1
die1 = 3 and die2 = 4
the total value of dice1 = 2
the total value of dice2 = 7
die1 = 3 and die2 = 4
rolling....dice1 die1 = 3 and die2 = 1
rolling....dice2 now = die1 = 2 and die2 = 5
rolling....dice1 now = die1 = 3 and die2 = 3
rolling....dice2 now = die1 = 6 and die2 = 5
It took 71 rolls to get boxcars on dice1
dice2 rolled boxcars!
*/
