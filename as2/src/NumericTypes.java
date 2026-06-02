/**
   This program demonstrates how numeric types and operators behave in Java
*/

public class NumericTypes
{
   public static void main (String [] args)
   {
      //******************  Problem 1, Part 1 *****************************
      //variable declarations
      int number = 2 ;     // number of scores
      int score1 = 100;    // first test score
      int score2 = 95;     // second test score
      double average;            // arithmetic average
      String output;             // line of output to print out
      
      // Find the average of score1 and score2
      average = (double) (score1 + score2) / number;
      
      // Print the average with explanatory info
      System.out.println("The average of " + score1 + " and " + score2 + " is " + average);      
      System.out.println();      // to leave a blank line 
      
      //*/
      //******************  Problem 1, Part 2 *****************************
      
      int fahrenheit = 212;  // boiling temperature in fahrenheit
      double celsius;               // temperature in celsius
     
      // Convert Fahrenheit temperatures to Celsius
      celsius = (5.0 / 9) * (fahrenheit - 32);
      System.out.println(fahrenheit + " deg F = " + celsius + " deg C");
      System.out.println();      // to leave a blank line

      //*/
      //******************  Problem 1, Part 3 *****************************
      
      double diameter = 3.0; // the diameter of a sphere

      // Create a variable to store the radius and initialize with 
      //    one half of the diameter 
      
      double radius = diameter / 2;

      // calculate and store the volume of the sphere using Math.PI and Math.pow
      
      double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);

      // print out the volume

      System.out.println("The volume of a sphere with diameter " + diameter + " is " + volume);
      
      //*/
      /******************  Problem 1, Problem 4 *****************************
      // Compute the square root of the number stored in N
      double N = 3;
      System.out.println("We are going to find the square root of N, when N = " + N);

      double lastGuess = 1;                                                 // step 1
      System.out.println("Our first guess is " + lastGuess);
      
      double nextGuess = 0;  // fix this                                    // step 2         
      System.out.println("nextGuess =  and nextGuess^2 = "); //fix this     // step 3      
      lastGuess = nextGuess;                                                // step 4      
         
      // now repeat steps 2 - 4 five more times by copying and pasting them below:
     
      
      // now print the difference between lastGuess and the square root of 3 obtained using Math.sqrt
      System.out.println("The difference between lastGuess and the real square root of 3 is "); // fix this
      //*/      
   }  
}

/*
Output for problem 1:


part 1:
-----------------------------------------------
The average of 100 and 95 is 97.5
-----------------------------------------------

part 2:
-----------------------------------------------
212 deg F = 100.0 deg C
-----------------------------------------------

part 3:
-----------------------------------------------
The volume of a sphere with diameter 3.0 is 14.137166941154067
-----------------------------------------------
*/
