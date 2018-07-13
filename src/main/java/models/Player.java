package models;

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }


}
