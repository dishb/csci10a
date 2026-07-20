import java.util.Scanner;
/**
 * Write a description of class PlayingCardTestApp here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PlayingCardTestApp
{
    public static void main(String [] args){
       /*********** Problem 6 ******************************
       //  Do problems 1-4 in the PlayingCard class first
       // 6) Verify your class works by running this program */
       PlayingCard card1 = new PlayingCard();       
       card1.print();
        
       PlayingCard card2 = new PlayingCard('S', 13);
       card2.print();        
        
       //***************** end problem 6 ********************/
       /************ Problem 7 ******************************
       // 7) Add code to create a PlayingCard object  
       //    representing the Jack of Diamonds and print 
       //    the object to the screen */
       PlayingCard card3 = new PlayingCard('D', 11);
       card3.print();
       
       //***************** end problem 7 *******************/
       /************ Problem 8 ******************************
       // 8) Add code to compare the ranks of two PlayingCard objects
       //    and print the card that has the higher rank */
       if (card1.getRank() > card2.getRank())
       {
           card1.print();
       }
       else if (card2.getRank() > card1.getRank())
       {
           card2.print();
       }
       else
       {
           System.out.println("Both cards have the same rank");
       }
       
       //***************** end problem 8 *******************/
       /************ Problem 9 ******************************
       // Write statements that read a complete set 
       //   of PlayingCard information from a keyboard Scanner into
        //   temporary local variables for suit and rank
        //   then create a new PlayingCard object with that info */
        
        // a) declare local variables to store PlayingCard info
        Scanner keyboard = new Scanner(System.in);
        char suit;
        int rank;
        
        System.out.println("Enter the suit and rank of a playing card");
        System.out.print("Enter the suit (C, D, H, or S): ");
        
        // b) read the PlayingCard info from the keyboard into your local variables
        suit = keyboard.next().charAt(0);
        System.out.print("Enter the rank (1-13): ");
        rank = keyboard.nextInt();
        
        // c) create a new PlayingCard object with the info you just read
        PlayingCard card4 = new PlayingCard(suit, rank);
        
        // d) print the PlayingCard object you just created and verify
        card4.print();
       
       
       
       //***************** end problem 9 *******************/
       
    }
   
}

/*
Output:

Ace of Clubs
King of Spades
Jack of Diamonds
King of Spades
Enter the suit and rank of a playing card
Enter the suit (C, D, H, or S): D
Enter the rank (1-13): 3
3 of Diamonds
*/
