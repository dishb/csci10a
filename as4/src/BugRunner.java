/* 
 * AP(r) Computer Science GridWorld Case Study:
 * Copyright(c) 2005-2006 Cay S. Horstmann (http://horstmann.com)
 *
 * This code is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation.
 *
 * This code is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * @author Cay Horstmann
 */

import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Bug;
import info.gridworld.actor.Rock;
import java.awt.Color;

/**
 * This class runs a world that contains a bug and a rock, added at random
 * locations. Click on empty locations to add additional actors. Click on
 * populated locations to invoke methods on their occupants. <br />
 * To build your own worlds, define your own actors and a runner class. See the
 * BoxBugRunner (in the boxBug folder) for an example. <br />
 * This class is not tested on the AP CS A and AB exams.
 */
public class BugRunner {
    public static void main(String[] args) {
        ActorWorld world = new ActorWorld();

        // problem 5
        Bug redBug = new Bug();
        world.add(redBug);
        moveBug(redBug, 3);

        // problem 6
        Color purple = new Color(148, 0, 211);
        world.add(new Bug(new Color(0, 255, 0 ))); // a green bug
        Bug purpleBug = new Bug(purple);
        world.add(purpleBug);

        world.add(new Rock());
        world.show();
    }

    // problem 5
    public static void moveBug(Bug bug, int n) {
        if (n > 0) {
            if (bug.canMove()) {
                moveBug(bug, n - 1);
                bug.move();
            } else {
                bug.turn();
                moveBug(bug, n - 1);
            }
        }
    }
}
