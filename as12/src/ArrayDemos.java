// I did the extra credit sorting problem

import java.util.Random;

public class ArrayDemos
{
    public static void main(String[] args)
    {   System.out.print("\f");
        /* ----------------- Problem 1 ----------------------*/
        System.out.println("\nP1");
        // a) Declare an array of int called count, that holds 5 int values 
        int[] count = new int[5];

        // b) Now assign the values 1, 5, 2, 9 and 8 to the five elements of your array using index [0] through [4]:
        count[0] = 1;
        count[1] = 5;
        count[2] = 2;
        count[3] = 9;
        count[4] = 8;

        // c) Print count array using the while loop illustrated at the bottom of section 12.1 of the text. 
        int i = 0;
        while (i < count.length)
        {
            System.out.print(count[i] + " ");
            i++;
        }
        System.out.println();
        
        // d) Change the values using some of the techniques illustrated at the top in section 12.1.
        count[0] = count[0] + 10;
        count[1] = 15;
        count[4] = count[2] + count[3];
        
        // e) Print the count array a second time to observe the changes made. 
        i = 0;
        while (i < count.length)
        {
            System.out.print(count[i] + " ");
            i++;
        }
        System.out.println();
        
        
         
        /* ----------------- Problem 2 ----------------------*/
        System.out.println("\nP2");
        // a) Make a copy of your count array called "copy" using the approach shown at top of sec12.2
        int[] copy = count;
        
        
        // b) change the value of copy[0], then print the count array a third time and observe the changes
        copy[0] = 99;
        i = 0;
        while (i < count.length)
        {
            System.out.print(count[i] + " ");
            i++;
        }
        System.out.println();
        
        
        // c) Make your copy array truly be an independent copy using the approach shown at bottom of sec12.2
        copy = new int[count.length];
        for (int j = 0; j < count.length; j++)
        {
            copy[j] = count[j];
        }

        
        // d) repeat step b) and verify nothing irregular happens
        copy[0] = 0;
        i = 0;
        while (i < count.length)
        {
            System.out.print(count[i] + " ");
            i++;
        }
        System.out.println();
        
        
        /* ----------------- Problem 3 ----------------------*/
        System.out.println("\nP3");        
        // Print the count array using a for-loop as illustrated in section 12.4 and 12.5
        for (int j = 0; j < count.length; j++)
        {
            System.out.print(count[j] + " ");
        }
        System.out.println();

        
        
        
        /* ----------------- Problem 4 ----------------------*/
        System.out.println("\nP4");        
        // Generate an array "die100" with 100 throws of a die (from 1 to 6). You may 
        // wish to refer to slides 30-31 of the lecture 12 powerpoints for hints on 
	// how to generate the random numbers.
        
 	// 0) create an int array called die100 with a size of 100 items
        int[] die100 = new int[100];

	
	// 1) Type in code on slide 32, then modify to try the different 
        // formulas at left of slide. Finish with the bottom one, which
        // should simulate the roll of single die (1-6)
        Random generator = new Random();

        
        // 2) once 1) works, Modiy the loop to assign the value being printed
        // to index i in the die100 array (make the loop go up to 100)
        for (int j = 0; j < die100.length; j++)
        {
            die100[j] = generator.nextInt(6) + 1;
        }

        
        // also, define a printArray method below main to print your int array. See slide 35.
        System.out.println("die100 contains the values: ");
        printArray(die100);       
        
        /* ----------------- Problem 5 ----------------------*/
        System.out.println("\nP5");
        // Define a method count5(int [] arr) below main that returns the count of the number of 
        // times a 5 is found in the array.
        
        System.out.println("The number 5 appeared " + count5(die100) + " times in the die100 array");
        
     
        
        /* ----------------- Problem 6 ----------------------*/
        System.out.println("\nP6");
        // Define an int array counts that has 7 elements in it. 
        // Follow the insructions in section 12.10 to create a histogram of the values in die100 stored
        // in the array counts. Then print your counts array from 1 to 6 and check if it represents the
        // true count of values in die100 (at least you can check if the count of 5's is the same as 
        // is count5 produces - there should be around 16 5's more or less). 
        int[] counts = new int[7];
        for (int j = 0; j < die100.length; j++)
        {
            counts[die100[j]]++;
        }
        
        
        System.out.println("The histogram of die100 is ");
        for (int j = 1; j <= 6; j++)
        {
            System.out.print(counts[j] + " ");
        }
        System.out.println();
        
        
        // EXTRA CREDIT: display your results as a bar chart like the one shown in slide 42 (and 43)
        for (int j = 1; j <= 6; j++)
        {
            System.out.print(j + ": ");
            for (int k = 0; k < counts[j]; k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        
    
        /* ----------------- Problem 7 ----------------------*/
        System.out.println("\nP7");
        // Generate an array called "arr10" with 10 random values between 0 and 99
        int[] arr10 = new int[10];
        for (int j = 0; j < arr10.length; j++)
        {
            arr10[j] = generator.nextInt(100);
        }
        
        System.out.println("arr10 contains the values: ");
        printArray(arr10);
        
        // Define a method maxValue that returns the largest number in an array 
        System.out.println("the largest value in arr10 is " + maxValue(arr10));
        
                
        /* ----------------- Problem 8 EXTRA CREDIT ----------------------*/
        System.out.println("\nP8");
        // Develop a bubbleSort method following the example slides 44-63 and use it 
        // to sort your arr10 array from problem 6
        
        bubbleSort(arr10);
        System.out.println("after sorting arr10, we have: ");
        printArray(arr10);
        
        
        /* -----------------------------------*/       
    }   // end of main

    public static void printArray(int[] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static int count5(int[] arr)
    {
        int total = 0;
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] == 5)
            {
                total++;
            }
        }
        return total;
    }

    public static int maxValue(int[] arr)
    {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++)
        {
            if (arr[i] > max)
            {
                max = arr[i];
            }
        }
        return max;
    }

    public static void bubbleSort(int[] arr)
    {
        for (int i = 0; i < arr.length - 1; i++)
        {
            for (int j = 0; j < arr.length - 1 - i; j++)
            {
                if (arr[j] > arr[j + 1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

}    

/*
Output:
---------------------------------------



P1
1 5 2 9 8 
11 15 2 9 11 

P2
99 15 2 9 11 
99 15 2 9 11 

P3
99 15 2 9 11 

P4
die100 contains the values: 
5 1 5 3 3 1 1 5 4 3 3 4 4 3 1 4 3 6 1 5 2 5 5 4 2 1 3 3 3 3 3 4 5 3 6 5 3 3 6 2 2 2 5 6 3 6 6 4 1 5 6 5 4 1 2 1 4 4 3 6 1 3 6 6 5 22 3 3 3 5 4 6 6 1 1 3 4 4 6 3 1 2 2 4 6 6 2 5 5 5 2 4 3 1 6 3 4 4 2

P5
The number 5 appeared 16 times in the die100 array

P6
The histogram of die100 is 
14 13 24 17 16 16 
1: **************
2: *************
3: ************************
4: *****************
5: ****************
6: ****************

P7
arr10 contains the values: 
33 19 35 51 43 95 34 37 70 78 
the largest value in arr10 is 95

P8
after sorting arr10, we have: 
19 33 34 35 37 43 51 70 78 95 
*/
