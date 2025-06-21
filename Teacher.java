public class Teacher {

    public String fullName;
    private String teacherID;
    private String instituteName;
    private String email;
    private String password;
    private String phoneNumber;
    private studentPortfolioID;

   //Getter and Setter

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getTeacherID() {
        return teacherID;
    }

    public void setTeacherID(String teacherID) {
        this.teacherID = teacherID;
    }

    public String getInstituteName() {
        return instituteName;
    }

    public void setInstituteName(String instituteName) {
        this.instituteName = instituteName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getStudentPortfolioID() {
        return studentPortfolioID;
    }

    public void setStudentPortfolioID(String studentPortfolioID) {
        this.studentPortfolioID = studentPortfolioID;
    }

    
    public Teacher(String fullName, String teacherID, String instituteName, String email, String password,
            String phoneNumber, String studentPortfolioID) {
        this.fullName = fullName;
        this.teacherID = teacherID;
        this.instituteName = instituteName;
        this.email = email;
        this.password = password;
        this.phoneNumber = phoneNumber;
        
        this.studentPortfolioID = studentPortfolioID;
    }

    
    public static void isValidEmail() {
        
    }

    private static void isValidPhoneNumber() {
        
    }
    
    
}
