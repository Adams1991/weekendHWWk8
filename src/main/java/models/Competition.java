package models;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name= "competitions")
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

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "winner")
    public String getWinner() {
        return winner;
    }

    public void setWinner(String winner) {
        this.winner = winner;
    }

    @Column(name = "is_complete")
    public boolean isCompetitionComplete() {
        return competitionComplete;
    }

    public void setCompetitionComplete(boolean competitionComplete) {
        this.competitionComplete = competitionComplete;
    }

    @OneToMany(mappedBy="competition", fetch = FetchType.LAZY)
    public List<Team> getTeamsInCompetition() {
        return teamsInCompetition;
    }

    public void setTeamsInCompetition(List<Team> teamsInCompetition) {
        this.teamsInCompetition = teamsInCompetition;
    }
}
