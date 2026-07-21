/**
 * Part of assignment 15 for CSCI10A.
 * 
 * @author Dishant Bhandula
 * @version 7/21/26
 */
public class Pet extends Animal {
    private int fleas;

    public Pet() {
        super();
        setLegs(4);
        fleas = 0;
    }

    public void setFleas(int fleas) {
        this.fleas = fleas;
    }
    
    public int getFleas() {
        return fleas;
    }
    
    @Override
    public String toString(){
        return "Pet: legs = " + getLegs() + ", fleas = " + fleas;
    }

    @Override
    public void speak(){
        System.out.println("Undifferentiated Pet Noise");
    }
}
