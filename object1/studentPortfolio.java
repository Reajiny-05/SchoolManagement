package object1;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


public class studentPortfolio {
    protected int portfolioID;
    protected String portfolioName;
    private String skills;

    //constructor
    public studentPortfolio(String portfolioName, String skills) {
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

    protected void setSkills(String skills) {
        this.skills = skills;
    }
    
    

    
    
}
