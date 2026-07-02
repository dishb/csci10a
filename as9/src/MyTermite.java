/*
 * MyTermite implements the simple Resnick termite behavior:
 * - If you see a flower, pick it up. Unless you already have a flower;
 *   in that case, drop the one you have.
 * - Move forward, if you can.
 * - Turn left or right at random.
 */

import info.gridworld.actor.Flower;

public class MyTermite extends Termite {

    @Override
    public void act() {
        if (getGrid() == null)
            return;

        if (seeFlower()) {
            if (hasFlower()) {
                dropFlower();
            } else {
                pickUpFlower();
            }
        }

        if (canMove()) {
            move();
        }

        randomTurn();
    }
}
public class MyTermite extends Termite {

    public void act() {
        if (getGrid() == null)
            return;

        if (seeFlower()) {
            pickUpFlower();
        }
        if (hasFlower()) {
            dropFlower();
        }

        if (canMove()) {
            move();
        }
        randomTurn();
    }
}