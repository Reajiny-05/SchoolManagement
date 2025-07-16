package object1;

public class Teacher1 extends User{
    private int score = 0;

    // Full constructor
    public Teacher1(int userID, String email, String password, String username, String phoneNumber,
            String institude, int score) {
        super(userID, email, password, username, phoneNumber, institude);
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