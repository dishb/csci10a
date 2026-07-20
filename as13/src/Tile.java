/**
 * Write a description of class Tile here.
 * 
 * @author Rachel Weber 
 * @version November 6, 2014
 */
public class Tile
{
    private char letter;
    private int value;

    public Tile() {
        this.letter = 'A';
        this.value = 1;
    }

    public Tile(char letter, int value) {
        this.letter = letter;
        this.value = value;
    }    

// Accessor methods.
    public char getLetter() {
        return this.letter;
    }
    
    public int getValue() {
        return this.value;
    }
// End of accessor method list.
    
// Modifier methods.
    public void setLetter(char letter) {
        this.letter = letter;
    }
    
    public void setValue(int value) {
        if(value >= 1 && value <= 10) {
            this.value = value;
        }
    }
// End of modifier method list.

    public void print() {
        System.out.print(letter + "/" + value);
    }
    
    public String toString(){
        return letter + "/" + value;

    }
}