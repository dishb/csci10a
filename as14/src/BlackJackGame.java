import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
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
        ArrayList<Card> deck = new ArrayList<Card>(); // upgrade from array of Card 

//a) finish the makeDeck method below. This method fills the deck array
//   with info for 52 cards read from cards.txt       
        makeDeck(deck);

        System.out.println("The first card in deck is " + deck.get(0));
        System.out.println("The last card in deck is " + deck.get(51));
    
        ArrayList<Card> playerHand = new ArrayList<Card>(); // player can have unlimited cards
        ArrayList<Card> computerHand = new ArrayList<Card>();
        
        int playerScore = 0;
        int computerScore=0;         

        System.out.print("Player hand = " + playerHand);            
       
//b) finish the score method below main. It adds up and returns
//   the blackJackValue of all the cards in the ArrayList passed to it
//   initially the score will be zero.
        System.out.println("Player score = " + score(playerHand));        

        System.out.print("Player, hit or stay? ");  
        answer = keyboard.next();
        
        while (answer.equals("hit")) {           
            System.out.println("Dealing ... ");
//c) finish the deal method below main. It picks a random index from 0 to 51
//    and returns the card in the deck array at that index               
            playerHand.add(deal(deck));  // add a new card to the hand
            
            System.out.println("player hand = " + playerHand);
            
            playerScore = score(playerHand);
            System.out.println("Player score = " + playerScore);
            
            System.out.print("Player, hit or stay? ");  
            answer = keyboard.next();            
        }   
            
        System.out.print("Computer: ");  
  
 //d) finish the while loop for the computer's turn:
 
        while (computerScore < 16) { // the computer automatically stays at 16          
            System.out.println("Dealing ... ");
            computerHand.add(deal(deck));
            
            System.out.println("Computer hand = " + computerHand);
            
            computerScore = score(computerHand);
            System.out.println("Computer score = " + computerScore);
        }    
        
        // e)  determine and print the outcome of the game 
        //     based on playerScore and computerScore
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
    
    public static void makeDeck(ArrayList<Card> deck)
            throws FileNotFoundException
    {
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
            deck.add(temp);
            k++;
        }
        inputFile.close();
    }
    public static Card deal(ArrayList<Card> deck)
            throws FileNotFoundException
    {
        if (deck.size() == 0) {
            makeDeck(deck);
        }

        int randomIndex = randomInt(0, deck.size());
        Card tempCard = deck.get(randomIndex);
        deck.remove(randomIndex);
        return tempCard;
    }    

    public static int randomInt(int low, int high) {
        // returns a random int from low (inclusive) to high (exclusive)
        // Determine the span of the range.
                int range = high - low;
      
        // return a random number from the range.
            return (int)(range*Math.random()) + low;   
    }    
   
    public static int score(ArrayList<Card> hand)
    {
        int total = 0;
        for (int k = 0; k < hand.size(); k++) {
            total += blackJackValue(hand.get(k));
        }
        return total;
    }       
    
    public static int blackJackValue(Card c)
    {
        if (c.getRank() < 11)
            return c.getRank();
        else 
            return 10;       
    }

}

/*
Output:



The first card in deck is Ace of Clubs
The last card in deck is King of Spades
Player hand = []Player score = 0
Player, hit or stay? hit
Dealing ... 
player hand = [8 of Spades]
Player score = 8
Player, hit or stay? hit
Dealing ... 
player hand = [8 of Spades, 5 of Hearts]
Player score = 13
Player, hit or stay? hit
Dealing ... 
player hand = [8 of Spades, 5 of Hearts, 4 of Spades]
Player score = 17
Player, hit or stay? hit
Dealing ... 
player hand = [8 of Spades, 5 of Hearts, 4 of Spades, King of Spades]
Player score = 27
Player, hit or stay? hit
Dealing ... 
player hand = [8 of Spades, 5 of Hearts, 4 of Spades, King of Spades, Queen of Spades]
Player score = 37
Player, hit or stay? hit
Dealing ... 
player hand = [8 of Spades, 5 of Hearts, 4 of Spades, King of Spades, Queen of Spades, 10 of Diamonds]
Player score = 47
Player, hit or stay? hit
Dealing ... 
player hand = [8 of Spades, 5 of Hearts, 4 of Spades, King of Spades, Queen of Spades, 10 of Diamonds, Jack of Hearts]
Player score = 57
Player, hit or stay? hit
Dealing ... 
player hand = [8 of Spades, 5 of Hearts, 4 of Spades, King of Spades, Queen of Spades, 10 of Diamonds, Jack of Hearts, 8 of Hearts]
Player score = 65
Player, hit or stay? hit
Dealing ... 
player hand = [8 of Spades, 5 of Hearts, 4 of Spades, King of Spades, Queen of Spades, 10 of Diamonds, Jack of Hearts, 8 of Hearts, 9of Hearts]
Player score = 74
Player, hit or stay? stay
Computer: Dealing ... 
Computer hand = [Queen of Diamonds]
Computer score = 10
Dealing ... 
Computer hand = [Queen of Diamonds, 2 of Diamonds]
Computer score = 12
Dealing ... 
Computer hand = [Queen of Diamonds, 2 of Diamonds, Jack of Spades]
Computer score = 22
Player busts. Computer wins.
*/
