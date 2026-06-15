
/**
 * Learning about recursion in Java.
 * 
 * @author Dishant Bhandula
 * @version 6/15/26
 */
public class PartB
{
    public static void main(String [] args)
    {
        //************* Prob 5 ***********************
        //  Type in the definition of the prod method where indicated
        //  below main and execute it. 
        //  Does it perform the way you predicted? 

        
        System.out.println("prod(1,4) = " + prod(1,4));
        System.out.println("prod(3,8) = " + prod(3,8));
        
        //  Try a couple other calls. 
        //  Does it behave as expected? 
        
        System.out.println("prod(9,10) = " + prod(8,10));
        System.out.println("prod(1,1) = " + prod(1,1));

        //************** End Prob 5 ******************/      
        //************* Prob 6 ***********************
        // We have a triangle made of blocks. The topmost row 
        // has 1 block, the next row down has 2 blocks, 
        // the next row has 3 blocks, and so on. 
        //
        // Define the triangleCount method below main to compute  
        // recursively the total number of blocks in such a triangle 
        // with the given number of rows. 
        
        // Test cases:
        
        System.out.println("triangleCount(0) = " + triangleCount(0));
        System.out.println("triangleCount(1) = " + triangleCount(1));
        System.out.println("triangleCount(2) = " + triangleCount(2));
        System.out.println("triangleCount(8) = " + triangleCount(8));        
         
        //************** End Prob 6 ******************/
    }
    
    // type in the prod method here
    
    public static int prod(int m, int n) {
        if (m == n) {
            return n;
        } else {
            int recurse = prod(m, n - 1);
            int result = n * recurse;
            return result;
        }
    }

    // define the triangleCount method here

    public static int triangleCount(int rows) {
        if (rows <= 0) {
            return 0;
        } else {
            return rows + triangleCount(rows - 1);
        }
    }
}

/*
Output:

problem 5:
------------------------------
prod(1,4) = 24
prod(3,8) = 20160
prod(9,10) = 720
prod(1,1) = 1
------------------------------

problem 6:
------------------------------
triangleCount(0) = 0
triangleCount(1) = 1
triangleCount(2) = 3
triangleCount(8) = 36
------------------------------
*/
