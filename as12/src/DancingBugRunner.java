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
 * @author Chris Nevison
 * @author Barbara Cloud Wells
 */

import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;

import java.awt.Color;

/**
 * This class runs a world that contains dancing bugs. <br />
 * This class is not tested on the AP CS A and AB exams.
 */
public class DancingBugRunner
{
    public static void main(String[] args)
    {
        int[] turns = {2, 4, 1, 7, 0, 3};

        ActorWorld world = new ActorWorld();

        DancingBug bug1 = new DancingBug(turns);
        bug1.setColor(Color.ORANGE);

        DancingBug bug2 = new DancingBug(turns);
        bug2.setColor(Color.BLUE);

        DancingBug bug3 = new DancingBug(turns);
        bug3.setColor(Color.GREEN);

        DancingBug bug4 = new DancingBug(turns);
        bug4.setColor(Color.RED);

        world.add(new Location(5, 2), bug1);
        world.add(new Location(5, 4), bug2);
        world.add(new Location(5, 6), bug3);
        world.add(new Location(5, 8), bug4);
        world.show();
    }
}
