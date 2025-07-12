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