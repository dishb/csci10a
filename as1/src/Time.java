public class Time {
    public static void main(String[] args) {
        int hour, minute, second;
        hour = 15;
        minute = 29;
        second = 33;

        int secondsInDay = 24 * 60 * 60;
        int secondsSinceMidnight = hour * 3600 + minute * 60 + second;
        System.out.println("Seconds since midnight: " + secondsSinceMidnight);
        int secondsRemainingInDay = secondsInDay - secondsSinceMidnight;
        System.out.println("Seconds remaining in day: " + secondsRemainingInDay);
        int percentageOfDayPassed = 100 * secondsSinceMidnight / secondsInDay;
        System.out.println("Percentage of day passed: " + percentageOfDayPassed + "%");
    }
}

/*
Output for activity 4:

step 4:
------------------------------------------------
Seconds since midnight: 55221
Seconds remaining in day: 31179
Percentage of day passed: 63%
------------------------------------------------

step 5:
------------------------------------------------
Seconds since midnight: 55773
Seconds remaining in day: 30627
Percentage of day passed: 64%
------------------------------------------------
*/
