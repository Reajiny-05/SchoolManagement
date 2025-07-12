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

