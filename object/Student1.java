public class Student1 {

    private int studentID;
    private String email;
    private String password;
    private String username;
    private String phoneNumber;
    private int totalWorkPoint = 0;
    private String institude;
    
    // Constuctor 
    public Student1(int studentID, String email, String password, String username, String phoneNumber,
            int totalWorkPoint, String institude) {
        this.studentID = studentID;
        this.email = email;
        this.password = password;
        this.username = username;
        this.phoneNumber = phoneNumber;
        this.totalWorkPoint = totalWorkPoint;
        this.institude = institude;
    }

    // Overloaded constructor
    public Student1(String password, String username) {
        this.password = password;
        this.username = username;
    }

}

