import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
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
        Tile [] letterBag = new Tile[99];

//a) finish the fillBag method below main. This method fills the letterBag
//   with info for 99 tiles read from tiles.txt              
        fillBag(letterBag);
        System.out.println("The first letter in letterBag is " + letterBag[0]);
        System.out.println("The last letter in letterBag is " + letterBag[98]);

//b) finish the makeRack method below main. This method creates a rack of 
//   7 tiles and assigns them 7 random tiles from letterBag
        Tile [] player1rack = makeRack(letterBag);
        Tile [] player2rack = makeRack(letterBag);
        
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
            replenishRack(word1, player1rack, letterBag);
            System.out.print("the new player 1 rack = ");
            printAllTiles(player1rack); 
        }
        else    
            System.out.println("the word you chose doesn't work with your rack");        
    }
    
    public static void fillBag(Tile [] tiles)
            throws FileNotFoundException
    {  
        // IDE often runs from the project folder, so try common locations
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
            tiles[k] = new Tile(letter, value);
            k++;
        }
        inputFile.close();
    }
    
    public static Tile [] makeRack(Tile [] tileBag)
            throws FileNotFoundException
    {
        Tile [] rack = new Tile[7];

        for (int k = 0; k < 7; k++) {
            int randomIndex = randomInt(0, 99);
            rack[k] = tileBag[randomIndex];
        }

        return rack;
    }    

    public static int randomInt(int low, int high) {
        // Determine the length of the range.
                int range = high - low;
      
        // Give a random number from the range.
            return (int)(range*Math.random()) + low;
        
    }    
    public static void printAllTiles(Tile [] tiles)
    {
        for (int k = 0; k < tiles.length; k++)
          System.out.print(tiles[k] + " "); 
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

    public static boolean validWord(String word, Tile [] rack)
    {
        String rackString = "";
        for (int k = 0; k < rack.length; k++) {
            rackString += rack[k].getLetter();
        }

        for (int k = 0; k < word.length(); k++) {
            char letter = word.charAt(k);
            if (countLetters(letter, word) > countLetters(letter, rackString)) {
                return false;
            }
        }

        return true;
    }   
    

    public static int scoreWord(String word, Tile [] rack)
    {
        int score = 0;
        for (int k = 0; k < word.length(); k++) {
            score += scoreOfLetter(word.charAt(k), rack);
        }
        return score;
    }       
    
    public static int scoreOfLetter(char letter, Tile [] rack)
    {
        for (int k = 0; k < rack.length; k++) {
            if (letter == rack[k].getLetter()) {
                return rack[k].getValue();
            }
        }
        return -1000;
    }

    public static void replenishRack(String word, Tile [] rack, Tile [] letterBag)
    {
        for (int w = 0; w < word.length(); w++) {
            char letter = word.charAt(w);
            for (int k = 0; k < rack.length; k++) {
                if (rack[k].getLetter() == letter) {
                    int randomIndex = randomInt(0, 99);
                    rack[k] = letterBag[randomIndex];
                    break;
                }
            }
        }
    }
}

/*
Output:



The first letter in letterBag is A/1
The last letter in letterBag is #/0
player 1 rack = O/1 M/3 A/1 I/1 E/1 O/1 Y/4 
player 2 rack = E/1 C/3 A/1 O/1 R/1 D/2 O/1 
Player 1, please enter a word from the letters in  your rack
MAY
the word you chose has a score of 8
the new player 1 rack = O/1 O/1 M/3 I/1 E/1 O/1 C/3 
*/
