package object1;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


public class studentPortfolio {
    protected int portfolioID;
    protected String portfolioName;
    private String skills;
    private String password;     // Password used to control access to skill 

    //constructor
    public studentPortfolio(String portfolioName, String skills, String password) {
        this.portfolioName = portfolioName;
        this.skills = skills;
    }

        //setter and getter
    protected String getPortfolioName() {
        return portfolioName;
    }

    protected String getSkills() {
        return skills;
    }

    protected void setPortfolioName(String portfolioName) {
        this.portfolioName = portfolioName;
    }

    // set password for updating the skill
    protected void setSkills(String newSkills, String inputPassword) {
        if (!checkPassword(inputPassword)) {
            System.out.println("Access denied: Incorrect password. Skills not updated.");
            return;
        }

        if (newSkills == null || newSkills.trim().isEmpty()) {
            this.skills = "No skills provided";
        } else {
            this.skills = newSkills.trim();
        }
    
    }
        protected void setSkills(String newSkills, String inputPassword) {
        if (!checkPassword(inputPassword)) {
            System.out.println("Access denied: Incorrect password. Skills not updated.");
            return;
        }

        if (newSkills == null || newSkills.trim().isEmpty()) {
            this.skills = "No skills provided";
        } else {
            this.skills = newSkills.trim();
        }
    
    }
    
    

    
    
}
