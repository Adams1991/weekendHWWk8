package models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name= "strikers")
public class Striker extends Player {

    private boolean provenGoalscorer;

    public Striker() {
    }

    public Striker(String name, int age, int rating, Team team, boolean provenGoalscorer) {
        super(name, age, rating, team);
        this.provenGoalscorer = provenGoalscorer;
    }

    @Column(name = "proven_goalscorer")
    public boolean isProvenGoalscorer() {
        return provenGoalscorer;
    }

    public void setProvenGoalscorer(boolean provenGoalscorer) {
        this.provenGoalscorer = provenGoalscorer;
    }


}
