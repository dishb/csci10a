import java.util.Scanner;

/**
 * Write a description of class Checkout here.
 *
 * @author Dishant Bhandula
 * @version 6/15/26
 */
public class Checkout
{
 	public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("KowMart express self-checkout (10 item limit)");

        int items, counter;
        double subtotal = 0;
        do {
            System.out.println("How many items (1 - 10)?");
            items = keyboard.nextInt();

            if (items <= 10 && items > 0) {
                counter = 1;
                while (counter <= items) {
                    System.out.println("What is the price of item " + counter + "?");
                    double cost = keyboard.nextDouble();
                    subtotal += cost;

                    counter++;
                }

                String ans = "";
                while (!ans.equalsIgnoreCase("yes") && !ans.equalsIgnoreCase(("no"))) {
                    System.out.println("Do you want a bag? It will cost an additional $0.05 if you have 3 or fewer items (yes/no)");
                    ans = keyboard.next();
                }
                if (ans.equalsIgnoreCase("yes")) {
                    if (items <= 3) {
                        subtotal += 0.05;
                    }
                }

                double total = 1.06 * subtotal;
                System.out.printf("Your total with 6%% sales tax is $%1.2f\n", total);
            }
        } while (items > 10 || items <= 0);
            //Add up the cost of each item (while loop, repeat items times)
            //Ask if a bag is needed
            //Add the cost of bag, if necessary.
            //Add in tax.
            //print out the total.

        keyboard.close();
    }
}

/*
Output:

----------------------------------
KowMart express self-checkout (10 item limit)
How many items (1 - 10)?
0
How many items (1 - 10)?
11
How many items (1 - 10)?
3
What is the price of item 1?
1.20
What is the price of item 2?
.95
What is the price of item 3?
3.30
Do you want a bag? It will cost an additional $0.05 if you have 3 or fewer items (yes/no)
maybe
Do you want a bag? It will cost an additional $0.05 if you have 3 or fewer items (yes/no)
yes
Your total with 6% sales tax is $5.83
----------------------------------
*/
