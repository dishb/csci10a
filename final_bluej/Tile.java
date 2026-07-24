/**
 * A Scrabble tile with a letter and point value.
 * Base class for the tile hierarchy.
 *
 * @author Dishant Bhandula
 * @version 7/23/26
 */
public class Tile {
    private char letter;
    private int value;

    public Tile() {
        letter = 'A';
        value = 1;
    }

    public Tile(char letter, int value) {
        this.letter = letter;
        this.value = value;
    }

    public char getLetter() {
        return letter;
    }

    public int getValue() {
        return value;
    }

    public void setLetter(char letter) {
        this.letter = letter;
    }

    public void setValue(int value) {
        // Value must be between 0 and 10.
        if (value >= 0 && value <= 10) {
            this.value = value;
        }
    }

    /** True if this tile can stand in for any letter. */
    public boolean isBlank() {
        return false;
    }

    public String toString() {
        return letter + "/" + value;
    }
}
