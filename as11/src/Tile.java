
/**
 * Write a description of class Tile here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tile
{
    // 1) define instance variables here, make them private
    private char letter;
    private int value;

    
    // 2) define the no-arg constructor here
    public Tile()
    {
        letter = 'A';
        value = 1;
    }
    
    
    // 3) define the explicit (parameter) constructor here
    public Tile(char letter, int value)
    {
        this.letter = letter;
        this.value = value;
    }
    
    
    // 4) define the get and set methods here 
    //     (getLetter, getValue, setLetter, setValue)
    public char getLetter()
    {
        return letter;
    }

    public int getValue()
    {
        return value;
    }

    public void setLetter(char letter)
    {
        this.letter = letter;
    }

    public void setValue(int value)
    {
        this.value = value;
    }
    
    
    // 5) define the print method here
    public void print()
    {
        System.out.println(letter + "/" + value);
    }
    
}
