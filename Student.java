import java.sql.Date;

public class Student {
    String fullName;
    String password;
    String studentID;
    String classAndYear;
    char gender;
    String email;
    String phoneNumber;
    boolean task;
    Date endDate;
    String skillAndExperience;
    int taskPoint;

    public Student(String fullName, String password, String studentID, String classAndYear, char gender, String email,
            String phoneNumber, boolean task, Date endDate, String skillAndExperience, int taskPoint) {
        this.fullName = fullName;
        this.password = password;
        this.studentID = studentID;
        this.classAndYear = classAndYear;
        this.gender = gender;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.task = task;
        this.endDate = endDate;
        this.skillAndExperience = skillAndExperience;
        this.taskPoint = taskPoint;
    }
    
}
