
/**
 * Learning about how Java methods return values.
 * 
 * @author Dishant Bhandula
 * @version 6/15/26
 */
public class PartA
{
    public static void main(String [] args)
    {
        //************* Prob 1 ***********************
        // write the isDivisible method below main
        //  test by running this segment
        
        System.out.println("Is 8 divisible by 3? " + isDivisible(8,3));
        System.out.println("Is 9 divisible by 3? " + isDivisible(9,3));
        
        //************** End Prob 1 ******************/
        //************* Prob 2 ***********************
        // write the multadd method below main
        //  test by running this segment
        
        System.out.println("1*2 + 3 = " + multadd(1.0, 2.0, 3.0));
        
        // write 2 more test cases
        System.out.println("1*1 + 1 = " + multadd(1.0, 1.0, 1.0));
        System.out.println("4*2 + 3 = " + multadd(4.0, 2.0, 3.0));
        
        
        //************** End Prob 2 ******************/
        //************* Prob 3 ***********************
        // write the isTriangle method below main
        //   HINT: use || or && to chain three logical expressions
        //         together
        //  then write some code that prints "it's a triangle"
        //    if the numbers 4, 1, 2 could be sides of a triangle
        //    or prints "not a triangle" if the numbers 4,1,2 cannot.
        //
        
        if ( isTriangle(4,1,2)){
            System.out.println("4,1,2 is a triangle");
        }
        else{
            System.out.println("4,1,2 is NOT a triangle");
        }
        
        if ( isTriangle(14,10,12)){
            System.out.println("14,10,12 is a triangle");
        }
        else {
            System.out.println("14,10,12 is NOT a triangle");
        }   
        
        // add another three test cases here
        
        if ( isTriangle(3,4,5)){
            System.out.println("3,4,5 is a triangle");
        }
        else {
            System.out.println("3,4,5 is NOT a triangle");
        }  

        if ( isTriangle(3,9,5)){
            System.out.println("3,9,5 is a triangle");
        }
        else {
            System.out.println("3,9,5 is NOT a triangle");
        }  

        if ( isTriangle(9,40,41)){
            System.out.println("9,40,41 is a triangle");
        }
        else {
            System.out.println("9,40,41 is NOT a triangle");
        }  

        //************** End Prob 3 ******************/
    } // end of main

    public static boolean isDivisible(int n, int m) {
        return (n % m == 0);
    }

    public static double multadd(double a, double b, double c) {
        return (a * b + c);
    }

    public static boolean isTriangle(int a, int b, int c) {
        if (a > (b + c)) {
            return false;
        } else if (b > (a + c)) {
            return false;
        } else if (c > (a + b)) {
            return false;
        }

        return true;
    }
}

/*
Output:

problem 1:
------------------------------------------
Is 8 divisible by 3? false
Is 9 divisible by 3? true
------------------------------------------

problem 2:
------------------------------------------
1*2 + 3 = 5.0
1*1 + 1 = 2.0
4*2 + 3 = 11.0
------------------------------------------

problem 3:
------------------------------------------
4,1,2 is NOT a triangle
14,10,12 is a triangle
3,4,5 is a triangle
3,9,5 is NOT a triangle
9,40,41 is a triangle
------------------------------------------
*/
