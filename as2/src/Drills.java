/**
 * Practice with all the concepts we've learned in the Date program
 * 
 * @author Dishant Bhandula
 * @version 6/7/2026
 */
public class Drills
{
    public static void main (String [] args){
        System.out.println("\f");  // flush the buffer (erase the screen)
        
        //************* Ex A **************************
        // write a void method, paycheck, below main that calculates and prints
        //  a worker's paycheck, given the number of hours, and pay rate
        
        payCheck( 40, 7.75);
        
        payCheck( 20, 9.25);
        
        payCheck( 50, 12.50);
        
        //************ End Ex A **********************/
        //************* Ex B **************************
        // write a void method volume below main that calculates and prints
        //  the volume of a cylinder, given the radius and height
        
        volume( 0.5, 3);
        
        volume( 2.0, 2);
        
        // call area one more time to do the last test in the test plan 
        volume(5.0, 1);

        //************ End Ex B **********************/
        //************* Ex C **************************
        // write a void method feetAndInches below main that calculates 
        // and prints the number of feet and inches in a given number of 
        // inches
        
        feetAndInches(40);
        
        // call your method two more times to finish the test plan
        feetAndInches(83);
        feetAndInches(5);
        
        //************ End Ex C **********************/
        //************* Ex D **************************
        // write a void method averageSale below main that calculates 
        // and prints the the average sale of a comic book sold at
        // a convention
               
        // call your method three times to verify the test plan
        averageSale( 500.0, 47.0);
        averageSale( 434.0, 13.0);
        averageSale( 122.0, 15.0);
        
        //************ End Ex D **********************/
        
    }
    // Define method paycheck here
    public static void payCheck(int hours, double rate) {
        double pay = hours * rate;
        System.out.println("Hours: " + hours + ", Rate: " + rate + ", Amount: $" + pay);
    }

    // Define method volume here
    public static void volume(double radius, int height) {
        double vol = Math.PI * Math.pow(radius, 2) * height;
        System.out.println("Radius: " + radius + ", Height: " + height + ", Volume: " + vol);
    }
    
    // Define method feetAndInches here
    public static void feetAndInches(int inches) {
        int feet = inches / 12;
        int leftoverInches = inches - (feet * 12);
        System.out.println("Inches: " + inches + ", Feet: " + feet + ", Inches: " + leftoverInches);
    }

    // Define method averageSale here
    public static void averageSale(double totalRevenue, double numberSold) {
        double averageSale = totalRevenue / numberSold;
        System.out.println("Total Revenue: " + totalRevenue + ", Number Sold: " + numberSold + ", Average Sale: " + averageSale);
    }
}

/*
Output for problem 6:

part A:
-------------------------------------------------
Hours: 40, Rate: 7.75, Amount: $310.0
Hours: 20, Rate: 9.25, Amount: $185.0
Hours: 50, Rate: 12.5, Amount: $625.0
-------------------------------------------------

part B:
-------------------------------------------------
Radius: 0.5, Height: 3, Volume: 2.356194490192345
Radius: 2.0, Height: 2, Volume: 25.132741228718345
Radius: 5.0, Height: 1, Volume: 78.53981633974483
-------------------------------------------------

part C:
-------------------------------------------------
Inches: 40, Feet: 3, Inches: 4
Inches: 83, Feet: 6, Inches: 11
Inches: 5, Feet: 0, Inches: 5
-------------------------------------------------

part D:
-------------------------------------------------
Total Revenue: 500.0, Number Sold: 47.0, Average Sale: 10.638297872340425
Total Revenue: 434.0, Number Sold: 13.0, Average Sale: 33.38461538461539
Total Revenue: 122.0, Number Sold: 15.0, Average Sale: 8.133333333333333
-------------------------------------------------
*/
