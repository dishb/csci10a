// Name: Dishant Bhandula
// Approximate completion time: 5 minutes
// References: None

public class MathTrick {
    public static void main(String[] args) {
        // Get a positive integer
        int x;
        x = 10;
		// Square it
        int y;
        y = x * x;
        System.out.println(y);
		// Add the original number
        y = y + x;
        System.out.println(y);
		// Divide by the original number
        y = y / x;
        System.out.println(y);
		// Add 17
        y = y + 17;
        System.out.println(y);
		// Subtract the original number
        y = y - x;
        System.out.println(y);
		// Divide by 6
        y = y / 6;
        System.out.println(y);
		// Print the result
        System.out.println("Here is the final result, which should be 3: ");
        System.out.println(y);
    }
}

/*
Output for activity 5:

where initial x is 7:
------------------------------------------------
49
56
8
25
18
3
Here is the final result, which should be 3: 
3
------------------------------------------------

where initial x is 10:
------------------------------------------------
100
110
11
28
18
3
Here is the final result, which should be 3: 
3
------------------------------------------------
 */
