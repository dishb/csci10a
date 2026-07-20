/* 
 * Example code for Think Java (http://thinkapjava.com)
 *
 * Adapted from http://en.wikibooks.org/wiki/Java_Programming/Canvas
 *
 * Copyright(c) 2011 Allen B. Downey
 * GNU General Public License v3.0 (http://www.gnu.org/copyleft/gpl.html)
 *
 * @author Allen B. Downey
 */

import java.awt.Color;
import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Polygon;
import javax.swing.JFrame;
import java.util.Scanner;
import java.util.ArrayList;

public class DragonCurve extends Canvas {   
    // uses an ArrayList to build a recursive drawing
    //   see http://en.wikipedia.org/wiki/Dragon_curve
    
    public static ArrayList<Point> curve;
    
    public static void main(String[] args) {
        // Create a JFrame object, which is a window that can contain the canvas,
        // buttons, menus, and other window components;
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // add the canvas
        // Canvas class is used to create an area in a frame to be 
        //   used for displaying graphics.
        Canvas canvas = new DragonCurve(); 
        canvas.setSize(800, 600);          // Set the size of our canvas
        frame.getContentPane().add(canvas);// Add our canvas to the JFrame object

        // construct the curve
        curve = new ArrayList<Point>();                                            
        curve.add( new Point(300,300));
        curve.add( new Point(500,300));
        dragon(curve, 3);
        
        // Display the frame on the screen.
        frame.pack();
        frame.setVisible(true);
    }

    public void paint(Graphics g) {
        for (int k=0; k < curve.size()-1; k++){
            Point p1 = curve.get(k);
            Point p2 = curve.get(k+1);
            g.drawLine( p1.x, p1.y, p2.x, p2.y);
        }    
    }
    
    public void draw(Graphics g, Rectangle b)
    {
        g.fillOval(b.x, b.y, b.width, b.height);       
    }
       
      public static void dragon(ArrayList<Point> curve, int level){
        if (level > 0){
		int sign = -1;
        for (int k=0; k < curve.size()-1; k++){
            Point p1 = curve.get(k);
            Point p2 = curve.get(k+1);
            double dist = distance(p1,p2)/Math.sqrt(2);
            double ang = angle(p1,p2) + sign*Math.PI/4;
            Point p3 = new Point();
            p3.x = p1.x + (int)Math.round(dist*Math.cos(ang));
            p3.y = p1.y + (int)Math.round(dist*Math.sin(ang));
            curve.add(k+1,p3);
  			sign *=-1; // flip the sign for the next point
            k++; // skip over new point just added
        }    
            dragon(curve, level-1);
        }
      }// end dragon 
    
    public static double distance (Point p1, Point p2) {
        double dx = p2.x - p1.x; 
        double dy = p2.y - p1.y; 
        return Math.sqrt( dx*dx + dy*dy);
    }
    public static double angle (Point p1, Point p2) {
        double dx = p2.x - p1.x; 
        double dy = p2.y - p1.y; 
        return Math.atan2( dy, dx);
    }
    
}
