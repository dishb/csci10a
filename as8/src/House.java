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

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.GraphicsEnvironment;
import java.awt.Polygon;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class House extends Canvas {

    public static void main(String[] args) {
        House house = new House();

        BufferedImage image = new BufferedImage(700, 500, BufferedImage.TYPE_INT_RGB);
        Graphics imageGraphics = image.createGraphics();
        house.paint(imageGraphics);
        imageGraphics.dispose();

        File outputFile = new File("house.jpg");
        try {
            ImageIO.write(image, "jpg", outputFile);
            System.out.println("Saved house image to " + outputFile.getAbsolutePath());
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (!GraphicsEnvironment.isHeadless()) {
            JFrame frame = new JFrame();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            Canvas canvas = house;
            canvas.setSize(700, 500);
            frame.getContentPane().add(canvas);

            frame.pack();
            frame.setVisible(true);
        }
    }

    public void paint(Graphics g) {
        g.setColor(new Color(135, 206, 235));
        g.fillRect(0, 0, 700, 500);

        Rectangle frame = new Rectangle(140, 180, 360, 220);

        g.setColor(new Color(160, 82, 45));
        Polygon roof = new Polygon();
        roof.addPoint(frame.x - 20, frame.y);
        roof.addPoint(frame.x + frame.width / 2, frame.y - 120);
        roof.addPoint(frame.x + frame.width + 20, frame.y);
        g.fillPolygon(roof);

        g.setColor(new Color(255, 220, 120));
        g.fillRect(frame.x, frame.y, frame.width, frame.height);

        g.setColor(new Color(120, 180, 255));
        g.fillRect(frame.x + frame.width / 7, frame.y + frame.height / 4, frame.width / 7, frame.width / 7);
        g.fillRect(frame.x + 4 * frame.width / 7, frame.y + frame.height / 4, frame.width / 7, frame.width / 7);

        g.setColor(Color.BLACK);
        g.drawRect(frame.x + frame.width / 7, frame.y + frame.height / 4, frame.width / 7, frame.width / 7);
        g.drawRect(frame.x + 4 * frame.width / 7, frame.y + frame.height / 4, frame.width / 7, frame.width / 7);

        g.setColor(new Color(255, 200, 120));
        g.fillRect(frame.x + 2 * frame.width / 5, frame.y + 3 * frame.height / 4 - 20, frame.width / 7, frame.height / 3);
        g.setColor(Color.BLACK);
        g.drawRect(frame.x + 2 * frame.width / 5, frame.y + 3 * frame.height / 4 - 20, frame.width / 7, frame.height / 3);

        g.setColor(new Color(140, 70, 40));
        g.fillRect(frame.x + 3 * frame.width / 5, frame.y + 2 * frame.height / 3, frame.width / 8, frame.height / 4);

        g.setColor(new Color(120, 80, 40));
        g.fillRect(frame.x + 2 * frame.width / 5, frame.y + 3 * frame.height / 4 - 20, frame.width / 7, 5);

        g.setColor(Color.GREEN);
        g.fillRect(0, 430, 700, 70);

        g.setColor(Color.BLACK);
        g.drawLine(frame.x + frame.width / 2, frame.y, frame.x + frame.width / 2, frame.y + frame.height);
    }
}
