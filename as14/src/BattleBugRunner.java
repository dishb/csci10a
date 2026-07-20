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
import java.util.Random;
import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;

import java.awt.Color;

/**
 * This class runs a world that contains box bugs. <br />
 * This class is not tested on the AP CS A and AB exams.
 */
public class BattleBugRunner
{
    public static final int NUMFLOW = 80;
    public static Random gen = new Random();
    
    public static void main(String[] args)
    {
      //  System.out.println("\f");
        ActorWorld world = new ActorWorld();
        BattleBug alice = new BattleBug(6, NUMFLOW/2);
        alice.setColor(Color.ORANGE);
        BattleBug bob = new BattleBug(3, NUMFLOW/2);
        world.add(new Location(7, 8), alice);
        world.add(new Location(5, 5), bob);        
        Location spot;        
        for (int k=0; k<NUMFLOW; k++){
            Flower f = new Flower();
            do{ 
               spot = new Location(gen.nextInt(10), gen.nextInt(10));
              // System.out.println("k: " + k + "spot = " + spot + ": " + world.getGrid().get(spot));
            } while (world.getGrid().get(spot) != null);
            world.add(spot, f);
        }

        world.show();
        
    }
}