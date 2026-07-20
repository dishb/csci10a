class Time
{
    private int hour, minute;
    private double second;

    // No-arg constructor
    public Time()
    {
        hour = 12;
        minute = 0;
        second = 0;
    }

    // Overloaded constructor
    public Time(int hour, int minute, double second)
    {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour()
    {
        return hour;
    }

    public int getMinute()
    {
        return minute;
    }

    public double getSecond()
    {
        return second;
    }

    public void setHour(int hour)
    {
        this.hour = hour;
    }

    public void setMinute(int minute)
    {
        if (minute >= 0 && minute <= 59)
            this.minute = minute;
    }

    public void setSecond(double second)
    {
        this.second = second;
    }

    public void print()
    {
        System.out.println(hour + ":" + minute + ":" + second);
    }
}