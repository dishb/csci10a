/**
 * class Time represents a time of day in hours, min, sec
 *   We develop this class in the lecture, watch the video
 *   to see the class being developed and follow along
 */
public class Time
{
    // instance variables, 
    // every object we create, has own copy of these
    private int hour, minute;
    private double second;   
    
    // methods
    
    // add the no-arg constructor here
    public Time(){
        this.hour = 12;
        this.minute = 0;
        this.second = 0.0;
    }
    
    // add the overloaded constructor here
    public Time(int hour, int minute, double second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }    
    
    // add the getHour method here
    public int getHour(){
        return hour;
    }
    // add the getMinute method here
    public int getMinute(){
        return minute;
    }
    // add the getSecond method here
    public double getSecond(){
        return second;
    }
    // add the setHour method here
    public void setHour(int hour){
        this.hour = hour;
    }
        
    // add the setMinute method here
    public void setMinute(int minute){
        if (minute >= 0 && minute < 60)
            this.minute = minute;
        else
            System.out.println("illegal minute in setMinute");
    }
    // add the setSecond method here
    public void setSecond(double second){
        this.second = second;
    }
    
    // OBJECT method because of NO static keyword
    public void print(){
        System.out.println(this.hour + ":" 
                            + this.minute + ":" 
                            + this.second);
    }
    
//    // CLASS method because of static
//    public static void printTime(Time t)
//    {
//        System.out.println(t.hour + ":" 
//                            + t.minute + ":" 
//                            + t.second);        
//    }
}


