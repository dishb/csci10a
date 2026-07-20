import java.util.Scanner;
/**
 * Write a description of class ScrabbleTileTestApp here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ScrabbleTileTestApp
{
    public static void main(String [] args){
       /*********** Problem 6 ******************************
       //  Do problems 1-4 in the Tile class first
       // 6) Verify your class works by running this program */
       Tile tile1 = new Tile();       
       tile1.print();
        
       Tile tile2 = new Tile('J', 8);
       tile2.print();        
        
       //***************** end problem 6 ********************/
       /************ Problem 7 ******************************
       // 7) Add code to create a Tile object with 
       //    the letter 'Z' and value 10 and print the object 
       //    to the screen */
       Tile tile3 = new Tile('Z', 10);
       tile3.print();
       
       //***************** end problem 7 *******************/
       /************ Problem 8 ******************************
       // 8) Add code to compare the values of two Tile objects
       //    and print the object that has the higher value */
       if (tile1.getValue() > tile2.getValue())
       {
           tile1.print();
       }
       else if (tile2.getValue() > tile1.getValue())
       {
           tile2.print();
       }
       else
       {
           System.out.println("Both tiles have the same value");
       }
       
       //***************** end problem 8 *******************/
       /************ Problem 9 ******************************
       // Write statements that read a complete set 
       //   of Tile information from a keyboard Scanner into
        //   temporary local variables for letter and value
        //   then create a new Tile object with that info */
        
        // a) declare local variables to store Tile info
        Scanner keyboard = new Scanner(System.in);
        char letter;
        int value;
        
        System.out.println("Enter the letter and value of a Scrabble tile");
        System.out.print("Enter the letter: ");
        
        // b) read the Tile info from the keyboard into your local variables
        letter = keyboard.next().charAt(0);
        System.out.print("Enter the value: ");
        value = keyboard.nextInt();
        
        // c) create a new Tile object with the info you just read
        Tile tile4 = new Tile(letter, value);
        
        // d) print the Tile object you just created and verify
        tile4.print();
       
       
       
       //***************** end problem 9 *******************/
       
    }   
   
}

/*
Output:

A/1
J/8
Z/10
J/8
Enter the letter and value of a Scrabble tile
Enter the letter: M
Enter the value: 3
M/3
*/
