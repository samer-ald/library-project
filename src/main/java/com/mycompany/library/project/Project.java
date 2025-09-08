package com.mycompany.library.project;

public class Project extends Item {

    private String team;
    private String level;

    public Project(String id, String title, int year, String specialization, String team, String level) {
        super(id, title, year, specialization);
        this.team = team;
        this.level = level;
    }

    public String getLevel() {
        return level;
    }

    public String getTeam() {
        return team;
    }

    @Override
    public void displayInfo() {
        System.out.println("[Project]: {" + title + "}  Level: " + level + "  / ID: " + id + " / specialization: " + specialization + " / " + year + " / By Team { " + team + " }");
    }

}
//samer
