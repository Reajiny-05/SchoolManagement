package object1;

public class User {

    protected int userID;
    protected String email;
    protected String password;
    protected String username;
    protected String phoneNumber;
    protected String institute;

    private static int userCount = 0;   // Static field to track how many users have been created

    // Constructor
    public User(int userID, String email, String password, String username, String phoneNumber,
            String institute) {
        this.userID = userID;
        this.setPhoneNumber(phoneNumber);
        this.setEmail(email);
        this.setPassword(password);
        this.setUsername(username);
        this.setInstitute(institute);
        userCount++;
    }

    // Overloaded constructor
    public User(String password, String username) {
        this.password = password;
        this.username = username;
        userCount++;
    }

    // static method to get the number of created users

    public static int getUserCount() {
        return userCount;
    }


    //display user information
    public String displayUserInfo() {
        return "Email: " + email + "\n" +
               "Username: " + username + "\n" +
               "Institute: " + institute;
    }

    //simple login check
    public boolean login(String username, String password) {
        return this.username.equals(username) && this.password.equals(password);
    }

    public String getEmail() {
        return email;
    }

    protected void setEmail(String email) {
        if (email == null || !email.contains("@")) {
            System.out.println("Invalid email format");
            return;
        }
        this.email = email;
    }

    protected String getPassword() {
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
        if (username == null || username.isEmpty()) {
            System.out.println("Username cannot be empty");
            return;
        }
        this.username = username;
    }

    protected String getPhoneNumber() {
        return phoneNumber;
    }

    protected void setPhoneNumber(String phoneNumber) {
        if (phoneNumber == null || !phoneNumber.matches("\\d{10}")) {
            System.out.println("Invalid phone number format");
            return;
        }
        this.phoneNumber = phoneNumber;
    }

    public String getInstitute() {
        return institute;
    }

    protected void setInstitute(String institute) {
    if (institute == null || institute.trim().isEmpty()) {
        System.out.println("Institute cannot be empty");
    } else {
        this.institute = institute;
    }
}

    protected int getUserID() {
        return userID;
    }

    @Override
    public String toString() {
        return "User [email=" + email + ", username=" + username + ", institude=" + institude + "]";
    }

    // Compares two users by email to check if they're the same person

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        User user = (User) obj;
        return email.equals(user.email); // to see if that person is the same person, where same email equal same person
    }   


}