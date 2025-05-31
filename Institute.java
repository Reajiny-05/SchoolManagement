public class Institute {
    String instituteName;
    String email;
    String password;
    String phoneNumber;
    String studentScheduleID;
    String studentPortfolioID;

    public Institute(String instituteName, String email, String password, String phoneNumber, String studentScheduleID,
            String studentPortfolioID) {
        this.instituteName = instituteName;
        this.email = email;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.studentScheduleID = studentScheduleID;
        this.studentPortfolioID = studentPortfolioID;
    }

}