package object1;

public class Teachers extends User{

    // Full constructor
    public Teachers(int userID, String email, String password, String username, String phoneNumber,
            String institude, int score) {
        super(userID, email, password, username, phoneNumber, institude);
    
    }


    // Overloaded constructor
    public Teachers(String username, String password) {
        super(username, password);
    }

    // Getter for score
    public int getScore() {
        return score;
    }

    // Setter for score
    protected void setScore(int score) {
    if (score < 0 || score > 10) {
        System.out.println("Score must be between 0–10.");
        this.score = 0;
    } else {
        this.score = score;
    }
}


    @Override
    public String toString() {
        return super.toString();
    }
    
    
}