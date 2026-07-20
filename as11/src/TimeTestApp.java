/**
 * class TimeTestApp tests our new Time class by creating
 * objects and trying out the object methods on them
 *
 * We develop this class in the lecture, watch the video
 * to see the class being developed and follow along
 */
public class TimeTestApp
{
    public static void main(String [] args){
        System.out.println("\f");  // start with blank screen

        /**************** Demo 1 ********************
        // Create an object of class Time and store a reference to it
        // in variable t
        Time t = new Time();

        System.out.println("t = " + t.hour
                            + ":" + t.minute
                            + ":" + t.second);

        t.hour = 11;
        t.minute = 8;
        t.second = 3.5;

        // print the values in t again
        System.out.println("t = " + t.hour
                            + ":" + t.minute
                            + ":" + t.second);

        //**************** end Demo 1 *****************/


        /**************** Demo 2 ********************
         * Define the "No-Arg" (Default) Constructor in the
         * Time class to set the default time to 12:00:00
         *
         * Re-run Demo 1 and observe the change in the
         * hour field.
         */
        //**************** end Demo 2 *****************/


        /**************** Demo 3 ********************
         * Define the "Overloaded" (Explicit) Constructor
         * in the Time class to let the user set the
         * initial time.
         

        // create a new Time object initialized to 10:45:00
        Time appt = new Time(10,45,0);

        // print the appointment time
        System.out.println("Your appointment is at: "
                            + appt.hour + ":"
                            + appt.minute + ":"
                            + appt.second);

        // change the hour field of appt to 11
        appt.hour = 11;

        System.out.println("Your appointment is at: "
                            + appt.hour + ":"
                            + appt.minute + ":"
                            + appt.second);

        // however, this can create problems
        // change the minute field to 901
        appt.minute = 901;

        System.out.println("Your appointment is at: "
                            + appt.hour + ":"
                            + appt.minute + ":"
                            + appt.second);

        /*
         * Therefore, in order to preserve the integrity
         * of a Time object we will make the instance
         * variables private.
         *
         * Once hour, minute, and second become private,
         * all direct references such as t.hour and
         * appt.hour must be commented out.
         */

        //**************** end Demo 3 *****************/


        /**************** Demo 4 ********************
         * Add the getters and setters (getHour,
         * setHour, etc.) to Time class.
         *
         * Comment out demos 1 - 3 and use the code
         * below instead.
         */

        Time appt = new Time(10,45,0);

        System.out.println("Your appointment is at: "
                            + appt.getHour() + ":"
                            + appt.getMinute() + ":"
                            + appt.getSecond());

        // change the hour field to 11
        appt.setHour(11);

        System.out.println("Your appointment is at: "
                            + appt.getHour() + ":"
                            + appt.getMinute() + ":"
                            + appt.getSecond());

        // still can create illegal Time values
        // Add validation to setMinute()
        appt.setMinute(901);

        System.out.println("Your appointment is at: "
                            + appt.getHour() + ":"
                            + appt.getMinute() + ":"
                            + appt.getSecond());

        //**************** end Demo 4 *****************/


        /**************** Demo 5 ********************
         * Default printing for Time objects only
         * shows a special hex code.
         */
        System.out.println("Your appointment is at " + appt);

        //**************** end Demo 5 *****************/


        /**************** Demo 6 ********************
         * Define a print method for Time objects
         * and use that to print.
         */
        System.out.print("Your appointment is at ");
        appt.print();

        //**************** end Demo 6 *****************/
    }
}

/*
Output:

Your appointment is at: 10:45:0.0
Your appointment is at: 11:45:0.0
Your appointment is at: 11:45:0.0
Your appointment is at Time@6ff3c5b5
Your appointment is at 11:45:0.0
*/
