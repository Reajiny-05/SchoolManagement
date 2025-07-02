public class Teacher1 {
    private int teacherID;
    private String email;
    private String password;
    private String username;
    private String phoneNumber;
    private String institude;
    
    // constuctor
    public Teacher1(int teacherID, String email, String password, String username, String phoneNumber,
            String institude) {
        this.teacherID = teacherID;
        this.email = email;
        this.password = password;
        this.username = username;
        this.phoneNumber = phoneNumber;
        this.institude = institude;
    }

    // Overloaded constructor
    public Teacher1(String password, String username) {
        this.password = password;
        this.username = username;
    }

    
}