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

