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

import info.gridworld.actor.Bug;

/**
 * A <code>DancingBug</code> turns a pattern of times before each move. <br />
 * The implementation of this class is testable on the AP CS A and AB exams.
 */
public class DancingBug extends Bug
{
    private int[] hotMoves;
    private int index;

    /**
     * Constructs a dancing bug that turns according to the given pattern.
     * @param hotMoves the number of turns before each move
     */
    public DancingBug(int[] hotMoves)
    {
        this.hotMoves = hotMoves;
        index = 0;
    }

    /**
     * Turns according to the current pattern entry, then moves like a Bug.
     */
    public void act()
    {
        for (int i = 0; i < hotMoves[index]; i++)
        {
            turn();
        }

        if (canMove())
        {
            move();
        }

        index++;
        if (index == hotMoves.length)
        {
            index = 0;
        }
    }
}
