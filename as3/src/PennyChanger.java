/*
    Dishant Bhandula
*/

public class PennyChanger {
    public static void main(String[] args) {
        System.out.println("\f");  // flush the buffer (erase the screen)
        
        change(75);
        change(43);
        change(24);
        
    }
    public static void change(int pennies){
        int leftoverPennies, quarters, dimes, nickels, leftOverPennies;

        leftoverPennies = pennies % 25;
        quarters = (pennies - leftoverPennies) / 25;
        leftOverPennies = leftoverPennies % 10;
        dimes = (leftoverPennies - leftOverPennies) / 10;
        leftoverPennies = leftOverPennies % 5;
        nickels = (leftOverPennies - leftoverPennies) / 5;

        System.out.println(pennies + " = " + quarters + " quarters, " + dimes + " dimes, " + nickels + " nickels, " + leftoverPennies + " pennies.");
    }    
}

/*
Output for problem 1:
---------------------------
75 = 3 quarters, 0 dimes, 0 nickels, 0 pennies.
43 = 1 quarters, 1 dimes, 1 nickels, 3 pennies.
24 = 0 quarters, 2 dimes, 0 nickels, 4 pennies.
---------------------------
*/
