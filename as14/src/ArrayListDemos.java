    /*
      http://www.java-examples.com/simple-java-arraylist-example
      Java ArrayList Example  
      This Java ArrayList Example shows how to create an object of Java ArrayList. It also
      shows how to add elements to ArrayList and how get the same from ArrayList.
    */
    import java.awt.Point;     
    import java.util.ArrayList;
     
    public class ArrayListDemos {
     
      public static void main(String[] args) {
          //*----------  DEMO 1 -------------------------------
          // Create an ArrayList to hold some names.
          System.out.println("\fDemo 1");
          ArrayList<String> nameList = new ArrayList<String>();
          
          // Add some names to the ArrayList.
          nameList.add("James");
          nameList.add("Catherine");
          nameList.add("Bill");
          
          // Display the size of the ArrayList.
          System.out.println("The ArrayList has " +
                             nameList.size() +
                             " objects stored in it.");
    
          // Now display the items in nameList.
          for (int index = 0; index < nameList.size(); index++)
             System.out.println(nameList.get(index));
          
          //------------END DEMO 1 ------------------------*/
          /*----------  DEMO 2 FOR-EACH LOOP -------------------------------
          // Now display the items using a for-each loop
          System.out.println("\n\nDemo 2");
          for (String name : nameList)
             System.out.println(name);
          
          //------------END DEMO 2 ------------------------*/
          /*----------  DEMO 3 GET AND REMOVE -------------------------------
          // Display the items in nameList and their indices.
          System.out.println("\n\nDemo 3");
          displayItems(nameList);
          
          // Now remove the item at index 1.
          nameList.remove(1);
          
          System.out.println("The item at index 1 is removed. " +
                             "Here are the items now.");
                             
          // Display the items in nameList and their indices.
          displayItems(nameList);

          //------------END DEMO 3 ------------------------*/
          /*----------  DEMO 4 INSERT -------------------------------
          System.out.println("\n\nDemo 4");
          // Now insert an  item at index 1.          
          nameList.add(1, "Mary");
          
          System.out.println("Mary was added at index 1. " +
                             "Here are the items now.");
                             
          // Display the items in nameList and their indices.
          displayItems(nameList);
          
          //------------END DEMO 4 ------------------------*/
          /*----------  DEMO 5 -------------------------------
          System.out.println("\n\nDemo 5");          
         
          // Now replace the item at index 2.
          nameList.set(2, "Becky");
          
          System.out.println("Catherine was replaced with Becky. " +
                             "Here are the items now.");
          displayItems(nameList);
          //------------END DEMO 5 ------------------------*/
          /*----------  DEMO 6 -------------------------------
          System.out.println("\n\nDemo 6");  
          
          ArrayList<Point> curve = new ArrayList<Point>();
          
          curve.add( new Point(100,200) );
          curve.add( new Point(300,60) );
          curve.add( new Point(230,120) );
          
          displayItems2(curve);
          //------------END DEMO 6 ------------------------*/
          //*----------  DEMO 7 -------------------------------
          System.out.println("\n\nDemo 7");  
          
          ArrayList<Point> curve = new ArrayList<Point>();                                            
          curve.add( new Point(300,300));
          curve.add( new Point(500,300));
          dragon(curve, 1);          
          displayItems2(curve);
          //------------END DEMO 7 ------------------------*/

          
          
      }
      
      public static void displayItems(ArrayList<String> alist){
          // Display the items in aist and their indices.
          for (int index = 0; index < alist.size(); index++)
          {
             System.out.println("Index: " + index + " Name: " +
                                alist.get(index));
          }          
      }
      public static void displayItems2(ArrayList<Point> alist){
          // Display the items in aist and their indices.
          for (int index = 0; index < alist.size(); index++)
          {
             System.out.println("Index: " + index + " Name: " +
                                alist.get(index));
          }          
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
      
      public static double distance(Point p1, Point p2) {
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
