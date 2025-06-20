import java.sql.Date;
import java.util.ArrayList;

public class Student {
    
    public String fullName;
    private String password;
    private String studentID;
    public String classAndYear;
    private char gender;
    private String email;
    private String phoneNumber;
    private String task;
    public Date endDate;
    private String skillAndExperience;
    private int taskPoint;


    // collection 
    private ArrayList<String> tasks = new ArrayList<>();


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

    public void setTask(String task) {
        this.task = task;
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

    public int getTaskPoint() {
        return taskPoint;
    }

    public void setTaskPoint(int taskPoint) {
        this.taskPoint = taskPoint;
    }

    
    // constructor for student
    public Student(String fullName, String password, String studentID, String classAndYear, char gender, String email,
            String phoneNumber, String task, Date endDate, String skillAndExperience, int taskPoint) {
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

    // overload constructor
    public Student(String fullName, String studentID) {
    this.fullName = fullName;
    this.studentID = studentID;
    }

    
    public static void isValidEmail() {
    
    }

    private static void isValidPhoneNumber(){

    }

    


}




