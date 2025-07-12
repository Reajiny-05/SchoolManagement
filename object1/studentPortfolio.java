package object1;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


public class studentPortfolio {
    private int portfolioID;
    private String background;
    private String skills;
    private String language;
    private String experience;
 
    // constuctor 
    public studentPortfolio(int portfolioID, String background, String skills, String language, String experience) {
        this.portfolioID = portfolioID;
        this.background = background;
        this.skills = skills;
        this.language = language;
        this.experience = experience;
    }

    public int getPortfolioID() {
        return portfolioID;
    }

    public void setPortfolioID(int portfolioID) {
        this.portfolioID = portfolioID;
    }

    public String getBackground() {
        return background;
    }

    public void setBackground(String background) {
        this.background = background;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public String getLanguage() {
        return language;
    } 
    
}
