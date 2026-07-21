/**
 * Part of assignment 15 for CSCI10A.
 * 
 * @author Dishant Bhandula
 * @version 7/21/26
 */
public class Human extends Animal {
    public Human() {
        super();
        setLegs(2);
    }

    @Override
    public String toString() {
        return "Human: legs = " + getLegs();
    }

    @Override
    public void speak() {
        System.out.println("Hello!");
    }
}
