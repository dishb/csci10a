import info.gridworld.actor.Bug;

public class CircleBug extends Bug {
    private int steps;
    private int sideLength;

    public CircleBug(int sideLength) {
        this.sideLength = sideLength;
        this.steps = 0;
    }

    public void act() {
        if (steps < sideLength && canMove()) {
            move();
            steps++;
        } else {
            turn();
            move();
            move();
            turn();
            steps = 0;
        }
    }
}
