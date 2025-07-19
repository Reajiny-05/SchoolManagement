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
        this.password = password;
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

//Subclasses for User
//student
package object1;


public class Student1 extends User{
    private int totalWorkPoint;

    //constructor
    public Student1(int userID, String email, String password, String username, String phoneNumber,
            String institude, int totalWorkPoint) {
        super(userID, email, password, username, phoneNumber, institude);
        this.totalWorkPoint = totalWorkPoint;
    }

    //overloaded constructor
    public Student1(String password, String username) {
        super(password, username);
    }


}

// Teacher class extending User
package object1;

public class Teacher1 {
    private int score = 0;

    // Full constructor
    public Teacher1(int id, String username, String email, String password, String phoneNumber,
                    int score) {
        super(id, username, email, password, phoneNumber);  // Call User constructor
        this.score = score;
    
    }

    // Overloaded constructor
    public Teacher1(String username, String password) {
        super(username, password);
    }

    // Getter for score
    public int getScore() {
        return score;
    }

    // Setter for score
    protected void setScore(int score) {
        this.score = score;
    }
    
}