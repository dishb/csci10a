import info.gridworld.actor.Bug;
import info.gridworld.grid.Location;

public class SpiralBug extends Bug {
    private int steps;
    private int sideLength;
    private int turnCount;
    private int ringGap;

    public SpiralBug(int initialLength) {
        this(initialLength, 1);
    }

    public SpiralBug(int initialLength, int ringGap) {
        steps = 0;
        sideLength = initialLength;
        turnCount = 0;
        this.ringGap = Math.max(1, ringGap);
    }

    public void act() {
        if (steps < sideLength && canMove()) {
            Location old = getLocation();
            move();
            EternalFlower f = new EternalFlower();
            if (getGrid() != null && getGrid().isValid(old) && getGrid().get(old) == null) {
                f.putSelfInGrid(getGrid(), old);
            }
            steps++;
        } else {
            turn();
            turn();
            steps = 0;
            turnCount++;
            if (turnCount % 2 == 0) {
                sideLength += (ringGap + 1);
            }
        }
    }
}
