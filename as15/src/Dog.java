/**
 * Part of assignment 15 for CSCI10A.
 * 
 * @author Dishant Bhandula
 * @version 7/21/26
 */
public class Dog extends Pet {
    public Dog() {
        super();
        setFleas(8);
    }

    @Override
    public String toString() {
        return "Dog: legs = " + getLegs() + ", fleas = " + getFleas();
    }

    @Override
    public void speak() {
        System.out.println("Woof!");
    }
}
