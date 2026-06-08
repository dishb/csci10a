/**
   This program computes test average for three test scores
*/

public class TestAverage {
   public static void main (String [] args) {
      System.out.println("\f");  // flush the buffer (erase the screen)

      // call your method three times here
      average3(78, 83, 93);
      average3(88, 92, 79);
      average3(85, 90, 95);
   }  

   // define the method average3 here
   public static void average3(double score1, double score2, double score3) {
      double average = (score1 + score2 + score3) / 3;
      System.out.println("The average of " + score1 + ", " + score2 + ", and " + score3 + " is: " + average);
   }
}

/*
Output for problem 7:
------------------------------------------------
The average of 78.0, 83.0, and 93.0 is: 84.66666666666667
The average of 88.0, 92.0, and 79.0 is: 86.33333333333333
The average of 85.0, 90.0, and 95.0 is: 90.0
------------------------------------------------
*/
