package object1;

public class Teachers extends User{

    // Full constructor
    public Teachers(int userID, String email, String password, String username, String phoneNumber,
            String institude) {
        super(userID, email, password, username, phoneNumber, institude);
    
    }

    // Overloaded constructor
    public Teachers(String username, String password) {
        super(username, password);
    }

     // Method to grade a student
    public void gradeStudent(Students student, int score) {
        student.setTotalWorkPoint(score); // Or add to it if needed
        System.out.println("Graded student " + student.getUsername() + " with score " + score);
    }

    //
    @Override
    public String toString() {
        return super.toString() + ", Teacher";
    }

    //
    @Override
    public String displayUserInfo() {
        return super.displayUserInfo() + " Teacher";
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj); // using the equals method from User class to compare email, and reuse the logic from user class
    }
    
}