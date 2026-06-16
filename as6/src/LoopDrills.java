import java.util.*;
/** 
 * Drills in different Looping constructs
 */

public class LoopDrills
{
   public static void main (String [] args)
   {  
      System.out.println("\f"); // flush the buffer
      Scanner keyboard = new Scanner(System.in); // use this Scanner whenever you 
                                                 // need user input
      
      //******************  Problem 1 Multiple Assignment *************************
      System.out.println("****************** P1 *********************");
      // observer the output of these four statements, 
      //   then add statements where indicated below.
      int x = 5;
      System.out.println("after assigning 5 to x, x = " + x);
      x = 7;
      System.out.println("after assigning 7 to x, x = " + x);
      
      int y = 3;
      //a) assign the value of y to x here (this means x = y;)
      x = y;
      
      System.out.println("after assigning y to x, x = " + x + " (should be 3)");
      
      //demonstrates assigning the result of adding x + 1 back to x
      x = x + 1;
      System.out.println("after assigning x + 1 to x, x = " + x + " (should be 4)");
      
      //b) assign the result of adding x + 5 back to x
      x = x + 5;
      
      System.out.println("after assigning x + 5 to x, x = " + x + " (should be 9!)");
      
      //c) use System.out.println to determine the effect of this statement on the 
      //    value stored in x
      x++;
      System.out.println("after incrementing x, x = " + x + " (should be 10)");
      
      //d) use System.out.println to determine the effect of this statement on the 
      //    value stored in x
      x--;
      System.out.println("after decrementing x, x = " + x + " (should be 9)");
      
      //****************** End Problem 1 ***************************/      
      //******************  Problem 2 Basic Counting While Loop *******************
      System.out.println("****************** P2 *********************");
      // Run this loop and observe the output. 
      // Then modify the loop controls at a), b) and c) so it prints
      //     "0, 2, 4, 6, 8, Done!"      
      
      int n=0;                  // a) initialize the value of n
      while (n < 10)              // b) test the value in n
      {
         System.out.println(n);
         n = n+2;                // c) change the value in n
      }
      System.out.println("Done!");   // d) final message (only repeats once)   
      
     
      //****************** End Problem 2 ***************************/ 
      //******************  Problem 3 While Loop Debug *****************************
      System.out.println("****************** P3 *********************");
      // This loop is supposed to count up from 0 to 100 in steps of 10
      //  But it has a couple errors. Fix it so it works right.
      //  Remember, to halt an infinite loop in BlueJ, 
      //    R-click the red "barber pole" run indicator, then choose reset JVM

	  int k = 0;
	  while (k < 101) 
	  {   
		 System.out.print(k + ", ");
		 k += 10;
	  }
      System.out.println("Done");
      
      //****************** End Problem 3 *****************************/
      //******************  Problem 4 Repeating a Calculation ********************
      System.out.println("****************** P4 *********************");
      //  Run this program, then modify it using a While-loop to calculate
      //  the area of three different circles, following the instructions below.

      int count = 0;
      double radius, area;	                     // 1)
      while (count < 3) {
        System.out.println("Enter a radius ");  // 2)
        radius = keyboard.nextDouble();            // 3)
        area=3.14*radius*radius;                   // 4)
        System.out.println("The area is " + area); // 5)
        count++;
      }
      
      // a) Above line 1) declare variable int count and initialize it to 0
      // b) insert a while statement after line 1)   while (count < 3)
      // c) put lines 2 through 5 inside curly braces below your while header
      // d) before the close curly brace, (after line 5) increment count by 1.
      
      // Run your modified program and see that it computes area for three circles
      
      //****************** End Problem 4 ***************************/      
      //******************  Problem 5 If Statements in loops *****************************
      System.out.println("****************** P5 *********************");
      // Run this program. Notice that to quit the loop, enter an age less than 0
      // 
      // Now add if statements to the loop to insult the person based on their age
      //   for people less than 13, "not ready for prime time"
      //   for teenagers, "grow up"
      //   for people 20 and over, "get a job!"
      //    ...etc...
      
      int age = 0;
      
      while (age >= 0)
      {
          System.out.print("What is your age? ");
          age = keyboard.nextInt();
          System.out.println("Really, you are " + age + " years old?");
          if (age <= 0) {
            System.out.println("good bye");
          } else if (age < 13) {
            System.out.println("not ready for prime time");
          } else if (age <= 19) {
            System.out.println("grow up");
          } else {
            System.out.println("get a job!");
          }
      }
   
      //****************** End Problem 5 ***************************/      
      //****************** Problem 6 Input Validation Loops ****************
      System.out.println("****************** P6 *********************");
      // Run this program, then add a do-while loop to make sure
      //   the input is between 1 and 100 before allowing the 
      //   the program to continue to the last statement. 
      //
      int number; 
      
      // start the do loop here
      do {
      System.out.print("Enter a number in the " +
                 "range of 1 through 100: ");
      number = keyboard.nextInt();
      } while (number < 1 || number > 100);
      
      System.out.println("Finally! You entered " + number);

      //****************** End Problem 6 ***************************/      
      //****************** Problem 7 Printing a table ****************
      System.out.println("****************** P7 *********************");
      // Run this program, which makes a table converting Centigrade to Fahrenheit
      //  then make another table as indicated below.
      
        double tempF;
        double tempC = 20;
        while ( tempC <= 40) 
        {
             tempF = 1.8*tempC + 32;
             System.out.println(tempC + " C = " + tempF + " F");
        	 tempC = tempC + 5;
        }

      // NOW make your own table of miles to kilometers using a loop as above
      //  miles on the left, from 10 to 100 miles, steps of 10
      //  km on the right
      //  remember  km = miles*1.609344
      
      double miles = 10;
      double km;
      System.out.println("Miles     Kilometers");
      while (miles < 100) {
        km = miles * 1.609344;
        System.out.println(miles + "       " + km);
        miles += 10;
      }
      
      //****************** End Problem 7 ***************************/      
      //****************** Problem 8 Encapsulating a loop in a method *********
      System.out.println("****************** P8 *********************");
      // Run this program and notice it calls the C2FTable method
      //  defined below main. Notice the output.
      
      C2FTable(0,100,10);
      
      // now print a table from 30 to 50 degrees C, in steps of 1 deg C.
      C2FTable(30, 50, 1);
      
      // now write your own method below main to print miles to km tables
      //  test using these calls
      miles2kmTable(20,120,5);
      miles2kmTable(50,55,0.1);
      
      //****************** End Problem 8 ***************************/      

      keyboard.close();
    } // end of main method
    
    public static void C2FTable(int startC, int stopC, int stepC){
        double tempC = startC, tempF;
        while ( tempC <= stopC) {
             tempF = 1.8*tempC + 32;
             System.out.println(tempC + "C = " + tempF + "F");
        	 tempC = tempC + stepC;
        }
    }

    public static void miles2kmTable(double startMiles, double stopMiles, double stepMiles) {
      double km;
      while (startMiles < stopMiles) {
        km = startMiles * 1.609344;
        System.out.println(startMiles + " miles = " + km + " km");
        startMiles += stepMiles;
      }
    }
}

/*
Output:

****************** P1 *********************
after assigning 5 to x, x = 5
after assigning 7 to x, x = 7
after assigning y to x, x = 3 (should be 3)
after assigning x + 1 to x, x = 4 (should be 4)
after assigning x + 5 to x, x = 9 (should be 9!)
after incrementing x, x = 10 (should be 10)
after decrementing x, x = 9 (should be 9)
****************** P2 *********************
0
2
4
6
8
Done!
****************** P3 *********************
0, 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, Done
****************** P4 *********************
Enter a radius 
1
The area is 3.14
Enter a radius 
2
The area is 12.56
Enter a radius 
3
The area is 28.259999999999998
****************** P5 *********************
What is your age? 4
Really, you are 4 years old?
not ready for prime time
What is your age? 17
Really, you are 17 years old?
grow up
What is your age? 26
Really, you are 26 years old?
get a job!
What is your age? -1
Really, you are -1 years old?
good bye
****************** P6 *********************
Enter a number in the range of 1 through 100: 0
Enter a number in the range of 1 through 100: 400
Enter a number in the range of 1 through 100: 86
Finally! You entered 86
****************** P7 *********************
20.0 C = 68.0 F
25.0 C = 77.0 F
30.0 C = 86.0 F
35.0 C = 95.0 F
40.0 C = 104.0 F
Miles     Kilometers
10.0       16.09344
20.0       32.18688
30.0       48.28032
40.0       64.37376
50.0       80.4672
60.0       96.56064
70.0       112.65408000000001
80.0       128.74752
90.0       144.84096
****************** P8 *********************
0.0C = 32.0F
10.0C = 50.0F
20.0C = 68.0F
30.0C = 86.0F
40.0C = 104.0F
50.0C = 122.0F
60.0C = 140.0F
70.0C = 158.0F
80.0C = 176.0F
90.0C = 194.0F
100.0C = 212.0F
30.0C = 86.0F
31.0C = 87.80000000000001F
32.0C = 89.6F
33.0C = 91.4F
34.0C = 93.2F
35.0C = 95.0F
36.0C = 96.8F
37.0C = 98.60000000000001F
38.0C = 100.4F
39.0C = 102.2F
40.0C = 104.0F
41.0C = 105.8F
42.0C = 107.60000000000001F
43.0C = 109.4F
44.0C = 111.2F
45.0C = 113.0F
46.0C = 114.8F
47.0C = 116.60000000000001F
48.0C = 118.4F
49.0C = 120.2F
50.0C = 122.0F
20.0 miles = 32.18688 km
25.0 miles = 40.2336 km
30.0 miles = 48.28032 km
35.0 miles = 56.327040000000004 km
40.0 miles = 64.37376 km
45.0 miles = 72.42048 km
50.0 miles = 80.4672 km
55.0 miles = 88.51392000000001 km
60.0 miles = 96.56064 km
65.0 miles = 104.60736 km
70.0 miles = 112.65408000000001 km
75.0 miles = 120.70080000000002 km
80.0 miles = 128.74752 km
85.0 miles = 136.79424 km
90.0 miles = 144.84096 km
95.0 miles = 152.88768000000002 km
100.0 miles = 160.9344 km
105.0 miles = 168.98112 km
110.0 miles = 177.02784000000003 km
115.0 miles = 185.07456000000002 km
50.0 miles = 80.4672 km
50.1 miles = 80.62813440000001 km
50.2 miles = 80.78906880000001 km
50.300000000000004 miles = 80.95000320000001 km
50.400000000000006 miles = 81.11093760000001 km
50.50000000000001 miles = 81.27187200000002 km
50.60000000000001 miles = 81.43280640000002 km
50.70000000000001 miles = 81.59374080000002 km
50.80000000000001 miles = 81.75467520000002 km
50.90000000000001 miles = 81.91560960000002 km
51.000000000000014 miles = 82.07654400000003 km
51.100000000000016 miles = 82.23747840000003 km
51.20000000000002 miles = 82.39841280000003 km
51.30000000000002 miles = 82.55934720000003 km
51.40000000000002 miles = 82.72028160000004 km
51.50000000000002 miles = 82.88121600000004 km
51.60000000000002 miles = 83.04215040000004 km
51.700000000000024 miles = 83.20308480000004 km
51.800000000000026 miles = 83.36401920000004 km
51.90000000000003 miles = 83.52495360000005 km
52.00000000000003 miles = 83.68588800000005 km
52.10000000000003 miles = 83.84682240000005 km
52.20000000000003 miles = 84.00775680000005 km
52.30000000000003 miles = 84.16869120000005 km
52.400000000000034 miles = 84.32962560000006 km
52.500000000000036 miles = 84.49056000000006 km
52.60000000000004 miles = 84.65149440000006 km
52.70000000000004 miles = 84.81242880000006 km
52.80000000000004 miles = 84.97336320000007 km
52.90000000000004 miles = 85.13429760000007 km
53.00000000000004 miles = 85.29523200000007 km
53.100000000000044 miles = 85.45616640000007 km
53.200000000000045 miles = 85.61710080000007 km
53.30000000000005 miles = 85.77803520000008 km
53.40000000000005 miles = 85.93896960000008 km
53.50000000000005 miles = 86.09990400000008 km
53.60000000000005 miles = 86.26083840000008 km
53.70000000000005 miles = 86.42177280000008 km
53.800000000000054 miles = 86.58270720000009 km
53.900000000000055 miles = 86.74364160000009 km
54.00000000000006 miles = 86.90457600000009 km
54.10000000000006 miles = 87.0655104000001 km
54.20000000000006 miles = 87.2264448000001 km
54.30000000000006 miles = 87.3873792000001 km
54.40000000000006 miles = 87.5483136000001 km
54.500000000000064 miles = 87.7092480000001 km
54.600000000000065 miles = 87.87018240000012 km
54.70000000000007 miles = 88.03111680000012 km
54.80000000000007 miles = 88.19205120000012 km
54.90000000000007 miles = 88.35298560000012 km
*/
