import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
/**
 * Write a description of class ScrabbleGame here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BlackJackGame 
{    
    public static void main(String [] args) 
        throws FileNotFoundException
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("\f");
        String answer;
        Card [] deck = new Card[52];

//a) finish the makeDeck method below. This method fills the deck array
//   with info for 52 cards read from cards.txt       
        makeDeck(deck);

        System.out.println("The first card in deck is " + deck[0]);
        System.out.println("The last card in deck is " + deck[51]);
    
        Card [] playerHand = new Card[10]; // player can have up to 10 cards
        Card [] computerHand = new Card[10];
        
        int playerCount = 0, computerCount = 0;
        int playerScore=0, computerScore=0;         

        System.out.print("Player hand = ");            
//b) add the printCards method below main. It only prints playerCount cards in the array
        printCards(playerHand, playerCount);

//c) add the blackJackValue method below main, then test with the following
//   two lines of code. The blackJack value is the rank for ranks 1-10, 
//   and 10 for all others
        Card test = new Card('S',12);
        System.out.println("The blackjack value of test card = " + blackJackValue(test));
        
//d) finish the score method below main. It adds up and returns
//   the blackJackValue of the first count cards in the array passed to it
//   initially the score will be zero.
        System.out.println("Player score = " + score(playerHand, playerCount));        

        System.out.print("Player, hit or stay? ");  
        answer = keyboard.next();
        
        while (answer.equals("hit")) {           
            System.out.println("Dealing ... ");
//e) finish the deal method below main. It picks a random index from 0 to 51
//    and returns the card in the deck array at that index               
            playerHand[playerCount] = deal(deck);
            playerCount++;
            
            System.out.print("player hand = ");
            printCards(playerHand, playerCount);
            
            playerScore = score(playerHand, playerCount);
            System.out.println("Player score = " + playerScore);
            
            System.out.print("Player, hit or stay? ");  
            answer = keyboard.next();            
        }   
            
        System.out.print("Computer: ");  
  
 //f) finish the while loop for the computer's turn
 
        while (computerScore < 16) { // the computer automatically stays at 16          
            System.out.println("Dealing ... ");
            computerHand[computerCount] = deal(deck);
            computerCount++;
            
            System.out.print("Computer hand = ");
            printCards(computerHand, computerCount);
            
            computerScore = score(computerHand, computerCount);
            System.out.println("Computer score = " + computerScore);
        }    
        
        // g)  determine and print the outcome of the game
        if (playerScore > 21) {
            System.out.println("Player busts. Computer wins.");
        }
        else if (computerScore > 21) {
            System.out.println("Computer busts. Player wins.");
        }
        else if (playerScore > computerScore) {
            System.out.println("Player wins.");
        }
        else if (computerScore > playerScore) {
            System.out.println("Computer wins.");
        }
        else {
            System.out.println("It's a tie.");
        }
                    
    } // END OF MAIN METHOD
    
    public static void makeDeck(Card [] deck)
            throws FileNotFoundException
    {
        // IDE often runs from the project folder, so try common locations
        File file = new File("cards.txt");
        if (!file.exists()) {
            file = new File("src/cards.txt");
        }
        if (!file.exists()) {
            file = new File("bin/cards.txt");
        }
        Scanner inputFile = new Scanner(file);

        int k = 0;
        while (k < 52 && inputFile.hasNext()) {
            char suit = inputFile.next().charAt(0);
            int rank = inputFile.nextInt();

            Card temp = new Card(suit, rank);
            deck[k] = temp;
            k++;
        }
        inputFile.close();
    }

    public static void printCards(Card [] hand, int count)
    {
        for (int k = 0; k < count; k++) {
            System.out.print(hand[k] + " ");
        }
        System.out.println();
    }

    public static Card deal(Card [] deck)
    {
        int randomIndex = randomInt(0, 52);
        return deck[randomIndex];
    }    

    public static int randomInt(int low, int high) {
        // returns a random int from low (inclusive) to high (exclusive)
        // Determine the length of the range.
                int range = high - low;
      
        // Give a random number from the range.
            return (int)(range*Math.random()) + low;
        
    }    
   

    public static int score(Card [] hand, int count)
    {
        int total = 0;
        for (int k = 0; k < count; k++) {
            total += blackJackValue(hand[k]);
        }
        return total;
    }       
    
    public static int blackJackValue(Card c)
    {
        if (c.getRank() <= 10) {
            return c.getRank();
        }
        return 10;
    }
}

/*
Output (I have no idea how Black Jack works even after reading the rules):



The first card in deck is Ace of Clubs
The last card in deck is King of Spades
Player hand = 
The blackjack value of test card = 10
Player score = 0
Player, hit or stay? hit
Dealing ... 
player hand = 10 of Spades 
Player score = 10
Player, hit or stay? stay
Computer: Dealing ... 
Computer hand = Ace of Spades 
Computer score = 1
Dealing ... 
Computer hand = Ace of Spades Jack of Diamonds 
Computer score = 11
Dealing ... 
Computer hand = Ace of Spades Jack of Diamonds Queen of Clubs 
Computer score = 21
Computer wins.
*/
