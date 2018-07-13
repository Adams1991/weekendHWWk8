package models;

import javax.persistence.*;

@Entity
@Table(name = "managers")
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

    @Column(name = "aptitude")
    public int getAptitude() {
        return aptitude;
    }

    public void setAptitude(int aptitude) {
        this.aptitude = aptitude;
    }

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "team_id", nullable = false)
    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }
}
