package models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name= "teams")
public class Team {

    private int id;
    private String name;
    private int points;
    private List<Player> players;
    private Manager manager;
    private Competition competition;



    public Team(String name, int points, Competition competition) {
        this.name = name;
        this.points = points;
        this.competition = competition;
        this.players = new ArrayList<Player>();
        this.manager = new Manager();
    }

    public Team() {
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

    @Column(name = "points")
    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    @OneToMany(mappedBy="team", fetch = FetchType.LAZY)
    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    @OneToOne(mappedBy = "team", fetch = FetchType.LAZY)
    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    @ManyToOne
    @JoinColumn(name="competition_id", nullable=false)
    public Competition getCompetition() {
        return competition;
    }

    public void setCompetition(Competition competition) {
        this.competition = competition;
    }

    public void playGame(Team team2) {
        int teamGameScore = 0;
        int opponentGameScore = 0;
        int teamPoints = getPoints();
        int opponentPoints = team2.getPoints();

        if (OverallPlayersRatings() > team2.OverallPlayersRatings())
            teamGameScore += 3;
        else
            opponentGameScore += 3;

        if (getManager().getAptitude() > team2.getManager().getAptitude())
            teamGameScore +=3;
        else
            opponentGameScore += 3;

        if (teamGameScore > opponentGameScore)
            setPoints(teamPoints += 3);
        else
            team2.setPoints(opponentPoints += 3);





        }



    public int OverallPlayersRatings() {
        int overallRating = 0;
        for (Player player : getPlayers()) {
            overallRating += player.getRating();
        }
        return overallRating;
    }
}
