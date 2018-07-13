package models;

import java.util.List;

public class Team {

    private int id;
    private String name;
    private int points;
    private List<Player> players;
    private Manager manager;
    private Competition competition;



    public Team(String name, int points, Manager manager, Competition competition) {
        this.name = name;
        this.points = points;
        this.manager = manager;
        this.competition = competition;
    }

    public Team() {
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

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    public Competition getCompetition() {
        return competition;
    }

    public void setCompetition(Competition competition) {
        this.competition = competition;
    }
}
