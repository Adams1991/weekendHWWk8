package models;

public class Manager {

    private int id;
    private String name;
    private int aptitude;
    private Team team;

    public Manager(String name, int aptitude, Team team) {
        this.name = name;
        this.aptitude = aptitude;
        this.team = team;
    }

    public Manager() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAptitude() {
        return aptitude;
    }

    public void setAptitude(int aptitude) {
        this.aptitude = aptitude;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }
}
