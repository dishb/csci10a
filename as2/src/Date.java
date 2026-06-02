class Date {
    // Contributers: Curtis McHenry, Brandon Bullough
    
  public static void main(String[] args) {
    // Declare variables
    String day, month;
    int date, year;
    
    //Assign values
    day = "Wednesday";
    month = "June";
    date = 10;
    year = 2020;
    // Print Output
    System.out.print("\f");
    System.out.println("American format:");
    System.out.println(day + ", " + month + " " + date + ", " + year);
    System.out.println("European format:");
    System.out.println(day + " " + date + " " + month + ", " + year);
  }
}