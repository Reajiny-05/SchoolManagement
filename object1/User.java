package object1;

public class User {

    protected int userID;
    protected String email;
    protected String password;
    protected String username;
    protected String phoneNumber;
    protected String institude;

    // Constructor
    public User(int userID, String email, String password, String username, String phoneNumber,
            String institude) {
        this.userID = userID;
        this.email = email;
        this.password = password;
        this.username = username;   
        this.phoneNumber = phoneNumber;
        this.institude = institude;
    }

    // Overloaded constructor
    public User(String password, String username) {
        this.password = password;
        this.username = username;
    }

    //display user information
    public String displayUserInfo() {
        return "Email: " + email + "\n" +
               "Username: " + username + "\n" +
               "Institude: " + institude;
    }

    //simple login check
    public boolean login(String username, String password) {
        return this.username.equals(username) && this.password.equals(password);
    }

    public String getEmail() {
        return email;
    }

    protected void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    protected void setPassword(String password) {
        if (password.length() < 6){
            System.out.println("Password too short");
        }
        else {
            this.password = password;
        }
        
    }

    public String getUsername() {
        return username;
    }

    protected void setUsername(String username) {
        this.username = username;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    protected void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getInstitude() {
        return institude;
    }

    protected int getUserID() {
        return userID;
    }

    @Override
    public String toString() {
        return "User [email=" + email + ", username=" + username + ", institude=" + institude + "]";
    }


}

package object1;


public class Students extends User{
    private int totalWorkPoint = 0;

    //constructor
    public Students(int userID, String email, String password, String username, String phoneNumber,
            String institude, int totalWorkPoint) {
        super(userID, email, password, username, phoneNumber, institude);
    }

    //overloaded constructor
    public Students(String password, String username) {
        super(password, username);
    }

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

    @Override
    public String toString() {
        return super.toString() + ", Students [totalWorkPoint=" + totalWorkPoint + "]";
    }

   
}

package object1;

public class Teachers extends User{

    // Full constructor
    public Teachers(int userID, String email, String password, String username, String phoneNumber,
            String institude, int score) {
        super(userID, email, password, username, phoneNumber, institude);
    
    }


    // Overloaded constructor
    public Teachers(String username, String password) {
        super(username, password);
    }

     // Method to grade a student
    public void gradeStudent(Students student, int score) {
        student.setTotalWorkPoint(score); // Or add to it if needed
        System.out.println("Graded student " + student.getUsername() + " with score " + score);
    }



    @Override
    public String toString() {
        return super.toString() + ", Teacher";
    }
    
    
}

package object1;
import java.sql.Date;

public class Task {
    private int taskID;
    private String taskName;
    private Date deadline;
    private int score;
    private String progress;

    private static int taskCount = 0; // Static variable to count the total tasks made by one student

    //contructor 
    public Task(int taskID, String taskName, int score, String progress, Date deadline) {
        this.taskID = taskID;
        this.taskName = taskName;
        this.score = score;
        this.progress = progress;
        this.deadline = deadline;
      
    }

    
    // Getters
    public int getTaskID() {
        return taskID;
    }

    public String getTaskName() {
        return taskName;
    }

    public int getScore() {
        return score;
    }
    protected void setScore(int score) {
        if (score >= 0 && score <= 10) {
            this.score = score;
        } else {
            System.out.println("Score must be between 0–10.");
        }
    }

    public String getProgress() {
        return progress;
    }
    protected void setProgress(String progress) {
        this.progress = progress;
    }

    public Date getDeadline() {
        return deadline;
    }



   
    //static method to make sure that there is a name for the task
    public static boolean isValidTaskName(String name) {
    return name != null && !name.trim().isEmpty();
    
    }

    @Override
    public String toString() {
       return "Name=" + taskName + ", Score=" + score +
               ", Progress=" + progress + ", Deadline=" + deadline + "]";
    
    }


}

