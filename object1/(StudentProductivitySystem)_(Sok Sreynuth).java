package object1;

public class User {

    private int userID;
    private String email;
    private String password;
    private String username;
    private String phoneNumber;
    private String institude;

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

    
}
