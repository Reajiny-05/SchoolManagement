package object1;


public class Students extends User{
    private int totalWorkPoint;

    //constructor
    public Students(int userID, String email, String password, String username, String phoneNumber,
            String institude, int totalWorkPoint) {
        super(userID, email, password, username, phoneNumber, institude);
        this.totalWorkPoint = totalWorkPoint;
    }

    //overloaded constructor
    public Students(String password, String username) {
        super(password, username);
    }


}

