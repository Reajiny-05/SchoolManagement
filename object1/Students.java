package object1;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class Students extends User{
    private int totalWorkPoint = 0;
    private String classAndYear = "";

    // Static counter to track number of student instances
    private static int studentCount = 0;


    //full constructor taken from user (parent) 
    public Students(int userID, String email, String password, String username, String phoneNumber, String institude,
            int totalWorkPoint, String classAndYear) {
        super(userID, email, password, username, phoneNumber, institude);
        this.setTotalWorkPoint(totalWorkPoint);
        this.classAndYear = classAndYear;
        studentCount++;
    }

    
    // Constructor used during sign-up (email, username, password only)
    // Assigns default values to phoneNumber and institute
    public Students(String username, String password, String email) {
    super(0, email, password, username, "0123456789", "Default Institute");

    studentCount++;   // Increase student count
    }


    //overloaded constructor when only username and password available (login)
    public Students(String password, String username) {
        super(password, username);
        studentCount++;
    }

    // Returns total number of Students created.
    public static int getStudentCount() {
    return studentCount;
    }

    //setter and getter for total work point
    public int getTotalWorkPoint() {
        return totalWorkPoint;
    }

    protected void setTotalWorkPoint(int totalWorkPoint) {
        if (totalWorkPoint < 0) {
            System.out.println(" Work point must be >= 0.");
            this.totalWorkPoint = 0;
        } else {
            this.totalWorkPoint = totalWorkPoint;
        }
    }


    //setter and getter of the class and year of the student
    public String getClassAndYear() {
        return classAndYear;
    }

    // Setter with password check
    protected void setClassAndYear(String classAndYear, String inputPassword) {
        if (this.password.equals(inputPassword)) {
            this.classAndYear = classAndYear;
            System.out.println("Class and year updated successfully.");
        } else {
            System.out.println("Wrong password. Cannot change class and year.");
        }
    }

    // collection
    // method to add task by sorted deadline
    private TreeMap<Date, Task> taskMap = new TreeMap<>();

    public void addTask(Task task) {
        taskMap.put(task.getDeadline(), task);
    }

    public void displayAllTasksSorted() {
        for (Task t : taskMap.values()) {
            System.out.println(t);
        }
    }

    // method to add portfolio
    private List<studentPortfolio> portfolioList = new ArrayList<>();

    public void addPortfolio(studentPortfolio portfolio) {
        portfolioList.add(portfolio);
    }

    // method to display Portfolio
    public void displayAllPortfolios() {
        if (portfolioList.isEmpty()) {
            System.out.println("No portfolios added yet.");
            return;
    }

        System.out.println("Portfolios of " + this.getUsername() + ":");
    for (studentPortfolio p : portfolioList) {
        System.out.println(p.displayPortfolioInfo());
        }
    }


    //display, mkaing it easy for debugging
    @Override
    public String toString() {
        return super.toString() + ", Students [classAndYear = " + classAndYear + ", totalWorkPoint = " + totalWorkPoint + "]";
    }

    //display, user interface is better
    @Override
    public String displayUserInfo() {
        return super.displayUserInfo() + ", classAndYear = " + classAndYear + ", totalWorkPoint = " + totalWorkPoint;
    }

     
    @Override
    public boolean equals(Object obj) {
        return super.equals(obj); // using the equals method from User class to compare email, and reuse the logic from user class
    }
    
    
    @Override
    public String getRole() {
        return "Student";
    }

}