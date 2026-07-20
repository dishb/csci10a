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
public class ScrabbleGame 
{
    public static void main(String [] args) 
        throws FileNotFoundException
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("\f");
        ArrayList<Tile> letterBag = new ArrayList<Tile>();

//a) finish the fillBag method below main. This method fills the letterBag
//   with info for 99 tiles read from tiles.txt              
        fillBag(letterBag);
        System.out.println("The first letter in letterBag is " + letterBag.get(0));
        System.out.println("The last letter in letterBag is " + letterBag.get(98));

//b) finish the makeRack method below main. This method creates a rack of 
//   7 tiles and assigns them 7 random tiles from letterBag
        ArrayList<Tile> player1rack = makeRack(letterBag);
        ArrayList<Tile> player2rack = makeRack(letterBag);
        
//c) add the printAllTiles method below main
        System.out.print("player 1 rack = "); 
        printAllTiles(player1rack);
        System.out.print("player 2 rack = ");
        printAllTiles(player2rack);
        
        System.out.println("Player 1, please enter a word from the letters in  your rack");
        String word1 = keyboard.next();

//d) CHALLENGE finish the validWord method below main. This determines if
//   the letters in word1 are all found (at the same or greater count) as 
//   the letters in player1rack. You can go on and come back to this later.
        if (validWord(word1, player1rack))   
        {
//e) EASIER CHALLENGE finish the scoreWord and scoreOfLetter methods below main
//   the scoreWord method steps through each letter in word, finds the corresponding
//   Tile in the rack, and adds up all the values associated with all the  Tiles 
//   that make up word
            int score1 = scoreWord(word1, player1rack);
            System.out.println("the word you chose has a score of " + score1);
//f) CHALLENGE figure out a way to replace the letters used by word in the rack
//    with new random letters taken from the letterBag
            replenishRack(player1rack, letterBag);
            System.out.print("the new player 1 rack = ");
            printAllTiles(player1rack); 
        }
        else    
            System.out.println("the word you chose doesn't work with your rack");        
    }
    
    public static void fillBag(ArrayList<Tile> tiles)
            throws FileNotFoundException
    {  
        File file = new File("tiles.txt");
        if (!file.exists()) {
            file = new File("src/tiles.txt");
        }
        if (!file.exists()) {
            file = new File("bin/tiles.txt");
        }
        Scanner inputFile = new Scanner(file);
        int k = 0;
        while (k < 99 && inputFile.hasNext()) {
            char letter = inputFile.next().charAt(0);
            int value = inputFile.nextInt();
            tiles.add(new Tile(letter, value));
            k++;
        }
        inputFile.close();
    }
    
    public static ArrayList<Tile> makeRack(ArrayList<Tile> tileBag)
            throws FileNotFoundException
    {
        ArrayList<Tile> rack = new ArrayList<Tile>();

        for (int k = 0; k < 7; k++) {
            int randomIndex = randomInt(0, tileBag.size());
            Tile tile = tileBag.get(randomIndex);
            tileBag.remove(randomIndex);
            rack.add(tile);
        }

        return rack;
    }    

    public static int randomInt(int low, int high) {
        // Determine the length of the range.
                int range = high - low;
      
        // Give a random number from the range.
            return (int)(range*Math.random()) + low;
        
    }    
    public static void printAllTiles(ArrayList<Tile> tiles)
    {
        for (int k = 0; k < tiles.size(); k++)
          System.out.print(tiles.get(k) + " "); 
        System.out.println();// go to new line
    }    
    
    public static int countLetters(char ch, String s)
    {
        int count = 0;
        for (int k = 0; k < s.length(); k++) {
            if (s.charAt(k) == ch) {
                count++;
            }
        }
        return count;
    }

    public static boolean validWord(String word, ArrayList<Tile> rack)
    {
        String rackString = "";
        for (int k = 0; k < rack.size(); k++) {
            rackString += rack.get(k).getLetter();
        }

        for (int k = 0; k < word.length(); k++) {
            char letter = word.charAt(k);
            if (countLetters(letter, word) > countLetters(letter, rackString)) {
                return false;
            }
        }

        return true;
    }   
    

    public static int scoreWord(String word, ArrayList<Tile> rack)
    {
        int score = 0;
        for (int k = 0; k < word.length(); k++)        
            score += scoreOfLetter(word.charAt(k), rack);
        return score;
    }       
    
    public static int scoreOfLetter(char letter, ArrayList<Tile> rack)
    {
        for (int k = 0; k < rack.size(); k++) {
            if (letter == rack.get(k).getLetter()) {
                int value = rack.get(k).getValue();
                rack.remove(k);
                return value;
            }
        }
        return -1000;
    }

    public static void replenishRack(ArrayList<Tile> rack, ArrayList<Tile> letterBag)
            throws FileNotFoundException
    {
        while (rack.size() < 7) {
            int randomIndex = randomInt(0, letterBag.size());
            Tile tile = letterBag.get(randomIndex);
            letterBag.remove(randomIndex);
            rack.add(tile);
        }
    }
}

/*
Output:



The first letter in letterBag is A/1
The last letter in letterBag is #/0
player 1 rack = O/1 I/1 R/1 A/1 O/1 E/1 K/5 
player 2 rack = O/1 H/4 D/2 E/1 J/8 T/1 D/2 
Player 1, please enter a word from the letters in  your rack
RAKE
the word you chose has a score of 8
the new player 1 rack = O/1 I/1 O/1 E/1 U/1 E/1 I/1 
*/
