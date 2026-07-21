/**
 * Part of assignment 15 for CSCI10A.
 * 
 * @author Dishant Bhandula
 * @version 7/21/26
 */
public class Cat extends Pet {
    public Cat() {
        super();
        setFleas(4);
    }

    @Override
    public String toString() {
        return "Cat: legs = " + getLegs() + ", fleas = " + getFleas();
    }

    @Override
    public void speak() {
        System.out.println("Meow!");
    }
}
