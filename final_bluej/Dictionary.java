import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * A word list used to validate Scrabble plays.
 *
 * @author Dishant Bhandula
 * @version 7/23/26
 */
public class Dictionary {
    private ArrayList<String> words;

    public Dictionary() {
        words = new ArrayList<String>();
    }

    /**
     * Loads the dictionaryo fwords from a given file.
    */
    public void loadFromFile(String fileName) throws FileNotFoundException {
        File file = openDataFile(fileName);
        Scanner input = new Scanner(file);

        while (input.hasNextLine()) {
            String word = input.nextLine().trim().toUpperCase();
            if (word.length() > 0) {
                words.add(word);
            }
        }

        input.close();
    }

    /**
     * Returns true if word is in the list.
     * Uses a simple loop to check each word.
     */
    public boolean contains(String word) {
        if (word == null) {
            return false;
        }
        word = word.trim().toUpperCase();

        for (int i = 0; i < words.size(); i++) {
            if (words.get(i).equals(word)) {
                return true;
            }
        }
        return false;
    }

    public String getWord(int index) {
        return words.get(index);
    }

    public int size() {
        return words.size();
    }

    /**
     * Opens a file from either the bin or src directory, used to solve some quirky issues.
    */
    private static File openDataFile(String fileName) throws FileNotFoundException {
        File file = new File(fileName);
        if (!file.exists()) {
            file = new File("src/" + fileName);
        }
        if (!file.exists()) {
            file = new File("bin/" + fileName);
        }
        if (!file.exists()) {
            throw new FileNotFoundException("Could not find " + fileName);
        }
        return file;
    }
}
