package object1;

public class Teachers extends User{
    private String course = "";     // subject/course the teacher teaches

    private static int teacherCount = 0;    // Static counter to track number of teacher 

    //full constructor
    public Teachers(int userID, String email, String password, String username, String phoneNumber, String institude,
            String course) {
        super(userID, email, password, username, phoneNumber, institude);
        this.setCourse(course);   // Use setter for validation
        teacherCount++;
    }


    // Overloaded constructor
    public Teachers(String username, String password) {
        super(username, password);
        teacherCount++;
    }

    public static int getTeacherCount() {
    return teacherCount;
    }

    //setter and getter
    public String getCourse() {
        return course;
    }

    protected void setCourse(String course) {
        if (course != null && !course.trim().isEmpty()) {
            this.course = course;
        } else {
            System.out.println("Invalid course name.");
        }
    }

    // Method to grade a student
    public void gradeStudent(Students student, int score) {
        student.setTotalWorkPoint(score); // Or add to it if needed
        System.out.println("Graded student " + student.getUsername() + " with score " + score);
    }

    // toString method for easier debugging — includes teacher-specific data.
    @Override
    public String toString() {
        return super.toString() + ", Teacher [course = " + course + "]";
    }

    @Override
    public String displayUserInfo() {
        return super.displayUserInfo() + ", course = " + course;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj); // using the equals method from User class to compare email, and reuse the logic from user class
    }

    @Override
    public String getRole() {
        return "Teacher";
    }

    
}