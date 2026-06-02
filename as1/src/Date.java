public class Date {
    public static void main(String[] args) {
        String month, day;
        int date, year;
        month = "June";
        day = "Monday";
        date = 1;
        year = 2026;

        // System.out.println(day);
        // System.out.println(month);
        // System.out.println(date);
        // System.out.println(year);

        // System.out.println(day + ", " + month + " " + date + ", " + year);

        System.out.println("American format:");
        System.out.println(day + ", " + month + " " + date + ", " + year);
        System.out.println("European format:");
        System.out.println(day + " " + date + " " + month + ", " + year);
    }
}

/*
Output for activity 3:

step 2:
------------------------------------------------
Monday
June
1
2026
------------------------------------------------

step 4:
------------------------------------------------
Monday, June 1, 2026
------------------------------------------------

step 5:
------------------------------------------------
American format:
Monday, June 1, 2026
European format:
Monday 1 June, 2026
------------------------------------------------
*/
