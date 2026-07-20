
/**
 * Write a description of class Employee here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Employee
{
    // private instance variables
    private String name;
    private int id;
    private double salary;

    // define the no-arg constructor here 
    //  (Set name to "-----", id to 0, salary to 0)
    public Employee() {
        name = "-----";
        id = 0;
        salary = 0;
    }

    // define the constructor with arguments (explicit constructor) here
    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    
    // define the three get methods here
    public String getName(){
        return name;
    }

    public int getID() {
        return id;
    }

    public double getSalary() {
        return salary;
    }
    
    // define the three set methods here
    public void setName(String name){
        this.name = name;
    }

    public void setID(int id) {
        this.id = id;
    }

    public void setSalar(double salary) {
        this.salary = salary;
    }
    
    // define the print method here
    public void print() {
        System.out.println(name + " " + id + " " + salary);
    }
    
    // [SKIP] define the equals method here
    
    
    // [SKIP] define the compareTo method here 
    //    (compare by their names, use  the String compareTo method
    //     to compare just the names of both employees)
    //   then at the bottom of main write a conditional that uses it
    
    
    // we can put a main method inside our class to test that it works properly
    // this would be called a "Test Driver" program
    public static void main(String [] args){
        Employee undefined = new Employee();
        Employee boss = new Employee("Sax Winderhaven",12345,55000);  
        Employee newGuy = new Employee("Jasper John", 44444, 41000);
        Employee undefined2 = new Employee();
        
        System.out.print("Employee undefined = ");
        undefined.print();
        System.out.print("Employee boss = ");
        boss.print();
        System.out.print("Employee newGuy = ");
        newGuy.print();
        
        boss.setName("Ryan Cooper");
        boss.setID(55443);
        boss.setSalar(85000);
        System.out.print("Now Employee boss = ");
        boss.print();        
        System.out.print("Salary for Employee newGuy = "+ newGuy.getSalary());
        System.out.print("ID for Employee boss = "+ boss.getID());
        System.out.print("Name for Employee undefined = "+ undefined.getName());
        
        /* ===================  SKIP ========================
        if ( boss.equals(newGuy) )
            System.out.println("boss and newGuy contain the same info");
        if ( undefined.equals(undefined2) )
            System.out.println("undefined and undefined2 contain the same info");
        
        // write a conditional expression to determine which employee, 
        //  boss or newGuy comes first in the directory (by name)
        //   use the compareTo method for the String clas on the getName() 
        //     of both objects
        if ( true  )
            System.out.println("newGuy comes first in the directory");
        else
            System.out.println("boss comes first in the directory");

        // ==================================================*/
            
    }

}

/*
Output:

Employee undefined = ----- 0 0.0
Employee boss = Sax Winderhaven 12345 55000.0
Employee newGuy = Jasper John 44444 41000.0
Now Employee boss = Ryan Cooper 55443 85000.0
Salary for Employee newGuy = 41000.0ID for Employee boss = 55443Name for Employee undefined = -----%      
*/