/**
 * Part of assignment 15 for CSCI10A.
 * 
 * @author Dishant Bhandula
 * @version 7/21/26
 */
public class Animal
{
    private boolean brain;
    private int legs;

    public Animal() {
        brain = true;
        legs = 0;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public int getLegs() {
        return legs;
    }
    
    @Override
    public String toString() {
        return "Animal: legs = " + getLegs();
    }
    
    public void speak() {
        System.out.println("Undifferentiated animal noise.");
    }    
}
