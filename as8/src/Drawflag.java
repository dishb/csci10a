
import java.awt.Color;
import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Polygon;
import javax.swing.JFrame;
import java.util.Scanner;

/**
 * DrawFlag - draws flags of the world using Graphics methods
 *
 * @author Dishant Bhandula
 * @version 6/26/26
 */
public class Drawflag extends Canvas
{
    public static void main(String[] args) {
        // Create a JFrame object, which is a window that can contain the canvas,
        // buttons, menus, and other window components
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // add the canvas
        // Canvas class is used to create an area in a frame to be 
        // used for displaying graphics
        Canvas canvas = new Drawflag(); // Create a Drawflag object called canvas
        canvas.setSize(800, 500);       // Set the size of our canvas
        frame.getContentPane().add(canvas); // Add our canvas to the JFrame object
        
        // Display the frame on the screen
        frame.pack();
        frame.setVisible(true);
    }

    public void paint(Graphics g) {
        // Draw a row of 5 Japanese flags
        Rectangle frame = new Rectangle(40, 20, 50, 30);
        int count = 0;
        while (count < 5) {
            japaneseFlag(g, frame);
            frame.translate(60, 0);
            count++;
        }
        
        // Draw a row of 5 Colombian flags
        frame = new Rectangle(40, 70, 50, 30);
        count = 0;
        while (count < 5) {
            colombianFlag(g, frame);
            frame.translate(60, 0);
            count++;
        }
        
        // Draw a row of 5 Swedish flags
        frame = new Rectangle(40, 120, 50, 30);
        count = 0;
        while (count < 5) {
            swedishFlag(g, frame);
            frame.translate(60, 0);
            count++;
        }
        
        // Draw a row of 5 Czech flags
        frame = new Rectangle(40, 170, 50, 30);
        count = 0;
        while (count < 5) {
            czechFlag(g, frame);
            frame.translate(60, 0);
            count++;
        }
    }

    public static void japaneseFlag(Graphics g, Rectangle frame) {
        // Draw the outline of the flag
        g.setColor(Color.black);
        g.drawRect(frame.x, frame.y, frame.width, frame.height);
        
        // Find the center of the flag
        Point center = findCenter(frame);
        
        // Create the sun rectangle
        Rectangle sun = new Rectangle(center.x, center.y, frame.width/4, frame.width/4);
        
        // Translate the sun to center it properly
        sun.translate(-sun.width/2, -sun.height/2);
        
        // Draw the sun
        g.setColor(Color.red);
        g.fillOval(sun.x, sun.y, sun.width, sun.height);
    }

    public static void colombianFlag(Graphics g, Rectangle frame) {
        // The Colombian flag consists of three horizontal stripes
        // Yellow (1/2 height), Blue (1/4 height), Red (1/4 height)
        
        // Draw yellow stripe (top half)
        g.setColor(new Color(255, 205, 0)); // Yellow
        g.fillRect(frame.x, frame.y, frame.width, frame.height/2);
        
        // Draw blue stripe (1/4 height)
        g.setColor(Color.blue);
        g.fillRect(frame.x, frame.y + frame.height/2, frame.width, frame.height/4);
        
        // Draw red stripe (bottom 1/4 height)
        g.setColor(Color.red);
        g.fillRect(frame.x, frame.y + 3*frame.height/4, frame.width, frame.height/4);
        
        // Draw outline
        g.setColor(Color.black);
        g.drawRect(frame.x, frame.y, frame.width, frame.height);
    }

    public static void swedishFlag(Graphics g, Rectangle frame) {
        // The Swedish flag is blue with a yellow cross
        
        // Draw blue background
        g.setColor(Color.blue);
        g.fillRect(frame.x, frame.y, frame.width, frame.height);
        
        // Draw yellow vertical stripe
        g.setColor(new Color(255, 205, 0)); // Yellow
        g.fillRect(frame.x + frame.width/3, frame.y, frame.width/6, frame.height);
        
        // Draw yellow horizontal stripe
        g.fillRect(frame.x, frame.y + frame.height/3, frame.width, frame.height/6);
        
        // Draw outline
        g.setColor(Color.black);
        g.drawRect(frame.x, frame.y, frame.width, frame.height);
    }

    public static void czechFlag(Graphics g, Rectangle frame) {
        // The Czech flag has white top stripe, red bottom stripe, and a blue triangle on the left
        
        // Draw white stripe (top half)
        g.setColor(Color.white);
        g.fillRect(frame.x, frame.y, frame.width, frame.height/2);
        
        // Draw red stripe (bottom half)
        g.setColor(Color.red);
        g.fillRect(frame.x, frame.y + frame.height/2, frame.width, frame.height/2);
        
        // Create a blue triangle on the left side
        Polygon triangle = new Polygon();
        triangle.addPoint(frame.x, frame.y); // top left
        triangle.addPoint(frame.x, frame.y + frame.height); // bottom left
        triangle.addPoint(frame.x + frame.width/2, frame.y + frame.height/2); // right middle
        
        g.setColor(Color.blue);
        g.fillPolygon(triangle);
        
        // Draw outline
        g.setColor(Color.black);
        g.drawRect(frame.x, frame.y, frame.width, frame.height);
    }

    public static Point findCenter(Rectangle rect) {
        int x = rect.x + rect.width/2;
        int y = rect.y + rect.height/2;
        return new Point(x, y);
    }
}
