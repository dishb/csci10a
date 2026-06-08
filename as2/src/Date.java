class Date {
    // Contributers: Curtis McHenry, Brandon Bullough
    
  public static void main(String[] args) {
    // Declare variables
    String day, month;
    int date, year;
    
    //Assign values
    day = "Wednesday";
    month = "June";
    date = 8;
    year = 2020;
    // Print Output
    System.out.print("\f");

    // testing my solution for problem 5
    printAmerican(day, month, date, year);
    System.out.println();
    printEuropean(day, month, date, year);
  }

  public static void printEuropean(String day, String month, int date, int year) {
    System.out.println("European format:");
    System.out.println(day + " " + date + " " + month + ", " + year);
  }

  public static void printAmerican(String day, String month, int date, int year) {
    System.out.println("American format:");
    System.out.println(day + ", " + month + " " + date + ", " + year);
  }
}

/*
Output for problem 5:

part B:
---------------------------
American format:
Wednesday, June 8, 2020
---------------------------

part C:
---------------------------
European format:
Wednesday 8 June, 2020
---------------------------
*/
