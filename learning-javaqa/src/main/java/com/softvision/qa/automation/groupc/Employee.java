package com.softvision.qa.automation.groupc;

public class Employee extends Person {
    // We have a IS A relation(Employee is a person)
    private String jobTitle;
    private String technicalLevel;
    private String skill;
    private String manager;
    private String site;
    private String building;
    private int office;
    private int desk;

    public Employee(String firstName, String jobTitle) {
        super(firstName);
        this.jobTitle = jobTitle;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getTechnicalLevel() {
        return technicalLevel;
    }

    public void setTechnicalLevel(String technicalLevel) {
        this.technicalLevel = technicalLevel;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building;
    }

    public int getOffice() {
        return office;
    }

    public void setOffice(int office) {
        this.office = office;
    }

    public int getDesk() {
        return desk;
    }

    public void setDesk(int desk) {
        this.desk = desk;
    }

    public String toString() {

        return super.toString() + "#" + technicalLevel + "#" + skill + "#" + manager + "#" + site + "#" + building + office + "#" + desk;
    }
}
