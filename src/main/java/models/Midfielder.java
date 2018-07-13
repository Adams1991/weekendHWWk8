package models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name= "midfielders")
public class Midfielder extends Player{

    private double passAccuracy;

    public Midfielder() {
    }

    public Midfielder(String name, int age, int rating, Team team, double passAccuracy) {
        super(name, age, rating, team);
        this.passAccuracy = passAccuracy;
    }


    @Column(name = "pass_accuracy")
    public double getPassAccuracy() {
        return passAccuracy;
    }

    public void setPassAccuracy(double passAccuracy) {
        this.passAccuracy = passAccuracy;
    }
}
