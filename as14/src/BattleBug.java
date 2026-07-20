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
import java.awt.Color;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;
import info.gridworld.actor.*;
import java.util.ArrayList;

/**
 * A <code>BoxBug</code> traces out a square "box" of a given size. <br />
 * The implementation of this class is testable on the AP CS A and AB exams.
 */
public class BattleBug extends Bug
{
    private int steps;
    private int sideLength;
    private int winFlower; 
    private int flowers; 
    private ArrayList<Location> list;

    /**
     * Constructs a box bug that traces a square of a given side length
     * @param length the side length
     */
    public BattleBug(int length, int winFlower)
    {
        steps = 0;
        sideLength = length;
        this.winFlower = winFlower;
        flowers=0;
    }

    public void move()
    {
        Grid<Actor> grid = getGrid();
        if (grid == null)
            return;
        Location loc = getLocation();
        Location next = loc.getAdjacentLocation(getDirection());
        if (grid.isValid(next)){
            Actor neighbor = grid.get(next);
            if (neighbor instanceof Flower){
                flowers++;
            }
            moveTo(next);
        }
        else
            removeSelfFromGrid();
     //   Flower flower = new Flower(getColor());
     //   flower.putSelfInGrid(gr, loc);
    }
    /**
     * Moves to the next location of the square.
     */
    public void act()
    {
        list = getGrid().getOccupiedLocations();
        System.out.println("list  = " + list.get(0));
        if (flowers > winFlower)
        {
            this.setColor(new Color(0,255,0));    
        }
        if (steps < sideLength && canMove())
        {
            move();
            steps++;
        }
        else   // do a random turn
        {
            for (int k=0; k<(int)(Math.random()*8); k++)
                turn();
            steps = 0;
        }
    }

}
