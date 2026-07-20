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
import info.gridworld.grid.Location;

/**
 * This class runs a world that contains a bug and a rock, added at random
 * locations. Click on empty locations to add additional actors. Click on
 * populated locations to invoke methods on their occupants. <br />
 * To build your own worlds, define your own actors and a runner class. See the
 * BoxBugRunner (in the boxBug folder) for an example. <br />
 * This class is not tested on the AP CS A and AB exams.
 */
public class BugRunnerWithKeystroke
{
    public static Bug bizzy = new Bug();     // creat a new Bug object and store it in bizzy

    public static void main(String[] args)
    {
        ActorWorld world = new ActorWorld();   // create a new gridworld where actors can roam
        world.add(new Location(4,4),bizzy);                    //  add bizzy to the world
        
        Rock pebble = new Rock();    // create a new Rock object and store it in pebble
        world.add(pebble);                   //   add pebble to the world
        pebble.moveTo( new Location(2,2));   // move pebble to row 2, column 2 (upper left corner is 0,0)     
        
                                         
        java.awt.KeyboardFocusManager.getCurrentKeyboardFocusManager()
            .addKeyEventDispatcher(new java.awt.KeyEventDispatcher(){
                public boolean dispatchKeyEvent(java.awt.event.KeyEvent event){
                    String key = javax.swing.KeyStroke.getKeyStrokeForEvent(event).toString();
                    if (key.equals("pressed UP"))
                        bizzy.setDirection(0);
                    if (key.equals("pressed RIGHT"))
                        bizzy.setDirection(90);
                    if (key.equals("pressed DOWN"))
                        bizzy.setDirection(180);
                    if (key.equals("pressed LEFT"))
                        bizzy.setDirection(270);
                    return true;
                }
            });
 
        world.show();
    }
    
    public static void vertRockLine(ActorWorld world, int row, int col, int numRocks)
    {
        Rock p = new Rock();
        world.add(p);
        p.moveTo( new Location(row,col));
        if (numRocks > 0){
            vertRockLine(world, row-1, col, numRocks - 1);
        }
    }
}
