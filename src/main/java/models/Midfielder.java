package models;

public class Midfielder extends Player{

    private double passAccuracy;

    public Midfielder() {
    }

    public Midfielder(String name, int age, int rating, Team team, double passAccuracy) {
        super(name, age, rating, team);
        this.passAccuracy = passAccuracy;
    }

    public double getPassAccuracy() {
        return passAccuracy;
    }

    public void setPassAccuracy(double passAccuracy) {
        this.passAccuracy = passAccuracy;
    }
}
