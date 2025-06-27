//import com.sun.tools.javac.Main;
import java.sql.Date;
import java.util.TreeSet;
import javax.security.sasl.SaslClient;

public class Student {
    public Student() {

    }
    
    public String fullName;
    private String password;
    private String studentID;
    public String classAndYear;
    private char gender;
    private String email;
    private String phoneNumber;
    private String taskName;
    public Date endDate;
    private String skillAndExperience;
    private int taskPoint;


    // collection 
    private TreeSet<String> tasks = new TreeSet<>();
    private TreeSet<String> importantTasks = new TreeSet<>();

 
    // constructor for student
    public Student(String fullName, String password, String studentID, String classAndYear, char gender, String email,
            String phoneNumber, String taskName, Date endDate, String skillAndExperience, int taskPoint) {
        this.fullName = fullName;
        this.password = password;
        this.studentID = studentID;
        this.classAndYear = classAndYear;
        this.gender = gender;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.taskName = taskName;
        this.endDate = endDate;
        this.skillAndExperience = skillAndExperience;
        this.taskPoint = taskPoint;
    }

    // overload constructor
    public Student(String fullName, String studentID) {
    this.fullName = fullName;
    this.studentID = studentID;
    }

    public void addTask(String taskName) {

    }

    public static void isValidEmail() {
    
    }

    private static void isValidPhoneNumber(){

    }

    // Getters & Setters 

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getClassAndYear() {
        return classAndYear;
    }

    public void setClassAndYear(String classAndYear) {
        this.classAndYear = classAndYear;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getTask() {
        return task;
    }



    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getSkillAndExperience() {
        return skillAndExperience;
    }

    public void setSkillAndExperience(String skillAndExperience) {
        this.skillAndExperience = skillAndExperience;
    }

}

/*
    public static void main(String[] args) {
        Student s = new Student(null,null);
        s.setTaskPoint(10000);
    }
*/






