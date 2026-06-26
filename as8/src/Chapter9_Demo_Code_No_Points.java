// To use a class defined in another package, you have to import it. 
// Point and Rectangle are in the java.awt package, so you import 
// them like this:

import java.awt.Point;
import java.awt.Rectangle;

/**
 * 
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Chapter9_Demo_Code_No_Points
{
    
    public static void main(String [] args)
    {
        System.out.println("\f");
        
        // 9.1 CREATING AN OBJECT VARIABLE AND A NEW OBJECT
        // In Java, a point is represented by a Point object. 
        // To create a new point, you have to 
        //    a) create an object variable to refer to it, and 
        //    b) use new to create the actual object
        
        Point dot;
        dot = new Point(3, 4);  // dot contains a reference to a newly created Point object
                                // every Point object has an x and a y instance variable 
        
        // 9.3 ACCESSSING THE INSTANCE VARIABLES OF AN OBJECT
        // The pieces of data that make up an object are called instance variables 
        // because each object, which is an instance of its type, has its own copy 
        // of the instance variables.        
        
        int x_coord = dot.x; //go to the object dot refers to, and get the value of instance variable x

        System.out.println("Here are the x and y values of dot: " + dot.x + ", " + dot.y);

        
        // Declare a second Point object variable and have it refer to a  
        // new Point with coordinates 18,7
        
        // Then print out the instance variables of your new point
        
        // USING THE INSTANCE VARIABLES TO CALCULATE A NEW VALUE
        int distanceSquared = dot.x * dot.x + dot.y * dot.y; 
        System.out.println("The distance of dot from the origin is " + Math.sqrt(distanceSquared) ) ; 
        
        // 9.4 OPTIONS FOR PRINTING A POINT OBJECT
        System.out.print("Printing dot using printPoint, dot = ");
        printPoint(dot);     // here we are passing dot to the printPoint method to be printed there
        
        // or we can just use a built in method in the Point class  
        System.out.println("Using built in method to print a Point, dot = " + dot);

        // 9.5 RECTANGLE OBJECTS    
        Rectangle box = new Rectangle(0, 0, 100, 200);
        System.out.println("box = " + box); 
        
        // make a printRectangle method and invoke it here
        
        // You can change the contents of an object by making an assignment to one of its instance variables. 
        // For example, to “move” a rectangle without changing its size, you can modify the x and y values:

        box.x = box.x + 50;
        box.y = box.y + 100;
    
        // 9.6 OBJECTS CAN BE RETURNED FROM METHODS AS WELL
        Point center = findCenter(box);
        
        printPoint(center);
        
        // 9.7 OBJECTS ARE MUTABLE (Changeable)
        Rectangle box1 = new Rectangle(100, 200, 80, 40); 
        moveRect(box1, 50, 100);
        System.out.println("After moveRect(box1, 50, 100), box1 = " + box1);
             
        box1.translate(50, 100);
        System.out.println("After box1.translate(50, 100), box1 = " + box1);
        
        // a) try out the grow method on box1 then print the current state of box1
               
        // b) figure out how to use distance to determine the distance 
        //    between the upper left corners of box and box1. 
        
        // 9.8  ALIASING 
        //      when two or more object variables refer to the same object
        Rectangle box2 = box1;
        
        // grow box2 and see what happens to both box1 and box2
        
        // 9.9 THE KEYWORD NULL 
        Point p = null;           // p does not refer to any object
        
        int x_value = p.x;        // NullPointerException
        p.translate(50, 50);      // NullPointerException
        
        // 9.10 GARBAGE COLLECTION
        p = new Point(1,2);       // Now p refers to an actual Point object
        p = null;                 // Now p does not refer to an object
                                      //   The Point(1,2) object has been "orphaned" 
                                      //   and will be removed from memory
        p = new Point(5,6);       // Now p refers to a different Point object
                                      //   that has just been created by new
    }
    
    public static void printPoint(Point p) {
        System.out.println("(" + p.x + ", " + p.y + ")");
    }
    
    public static double distance(Point p1, Point p2) {
        double dx = p2.x - p1.x;  
        double dy = p2.y - p1.y;
        return Math.sqrt(dx*dx + dy*dy);
    }    
    
    public static Point findCenter(Rectangle rect) {
        int x = rect.x + rect.width/2;
        int y = rect.y + rect.height/2;
        return new Point(x, y);
    }
    
    public static void moveRect(Rectangle box, int dx, int dy) {
        box.x = box.x + dx;
        box.y = box.y + dy;
    }      
}
