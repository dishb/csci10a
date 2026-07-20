
/**
 * Write a description of class PairOfDice here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PairOfDice 
{
    // 1) define instance variables here, make them private
    private int die1;
    private int die2;

    
    // 2) define the no-arg constructor here
    public PairOfDice()
    {
        die1 = 1;
        die2 = 1;
    }
    
    
    // 3) define the explicit (parameter) constructor here
    public PairOfDice(int die1, int die2)
    {
        this.die1 = die1;
        this.die2 = die2;
    }
    
    
    // 4) define the get and set methods here 
    //     (getDie1, getDie2, setDie1, setDie2)
    public int getDie1()
    {
        return die1;
    }

    public int getDie2()
    {
        return die2;
    }

    public void setDie1(int die1)
    {
        this.die1 = die1;
    }

    public void setDie2(int die2)
    {
        this.die2 = die2;
    }

    // 5) define the print method here
    public void print()
    {
        System.out.println("die1 = " + die1 + " and die2 = " + die2);
    }
      
    // 7) define a getTotal method that returns the sum of die1 and die2
    public int getTotal()
    {
        return die1 + die2;
    }

    // 9) define a roll method that updates the value of each die
    public void roll()
    {
        die1 = (int)(Math.random() * 6) + 1;
        die2 = (int)(Math.random() * 6) + 1;
    }

}
