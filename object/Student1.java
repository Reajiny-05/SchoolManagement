public class Student1 {

    int studentID;
    String email;
    String password;
    String username;
    String phoneNumber;
    int totalWorkPoint = 0;
    String institude;
    
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

