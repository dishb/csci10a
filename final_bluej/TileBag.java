import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * The bag of unused Scrabble tiles. Tiles are drawn randomly and removed.
 *
 * @author Dishant Bhandula
 * @version 7/23/26
 */
public class TileBag {
    private ArrayList<Tile> tiles;

    public TileBag() {
        tiles = new ArrayList<Tile>();
    }

    /**
     * Loads tiles from a text file (letter then value on each line).
     * Blank markers (#) become BlankTile objects.
     */
    public void fillFromFile(String fileName) throws FileNotFoundException {
        File file = openDataFile(fileName);
        Scanner input = new Scanner(file);

        while (input.hasNext()) {
            char letter = input.next().charAt(0);
            int value = input.nextInt();

            if (letter == '#') {
                tiles.add(new BlankTile());
            } else {
                tiles.add(new Tile(letter, value));
            }
        }

        input.close();
    }

    public int size() {
        return tiles.size();
    }

    public boolean isEmpty() {
        return tiles.isEmpty();
    }

    /**
     * Draws one random tile from the bag, or null if empty. 
    */
    public Tile draw() {
        if (tiles.isEmpty()) {
            return null;
        }
        int index = randomInt(0, tiles.size());
        return tiles.remove(index);
    }

    private static int randomInt(int low, int high) {
        int range = high - low;
        return (int) (range * Math.random()) + low;
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
