package models;


import javax.persistence.*;

@Entity
@Table(name="players")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Player {
    private int id;
    private String name;
    private int age;
    private int rating;
    private Team team;


    public Player() {
    }

    public Player(String name, int age, int rating, Team team) {
        this.name = name;
        this.age = age;
        this.rating = rating;
        this.team = team;
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

    @Column(name = "age")
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Column(name = "rating")
    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    @ManyToOne
    @JoinColumn(name="team_id", nullable=false)
    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }


}
