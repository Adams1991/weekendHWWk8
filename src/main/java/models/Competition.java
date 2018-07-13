package models;

import java.util.List;

public class Competition {
    private int id;
    private String name;
    private String winner;
    private boolean competitionComplete;
    private List<Team> teamsInCompetition;

    public Competition(String name, String winner, boolean competitionComplete) {
        this.name = name;
        this.winner = winner;
        this.competitionComplete = competitionComplete;
    }

    public Competition() {
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

    public String getWinner() {
        return winner;
    }

    public void setWinner(String winner) {
        this.winner = winner;
    }

    public boolean isCompetitionComplete() {
        return competitionComplete;
    }

    public void setCompetitionComplete(boolean competitionComplete) {
        this.competitionComplete = competitionComplete;
    }

    public List<Team> getTeamsInCompetition() {
        return teamsInCompetition;
    }

    public void setTeamsInCompetition(List<Team> teamsInCompetition) {
        this.teamsInCompetition = teamsInCompetition;
    }
}
