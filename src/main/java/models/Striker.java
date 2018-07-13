package models;

public class Striker extends Player {

    private boolean provenGoalscorer;

    public Striker() {
    }

    public Striker(String name, int age, int rating, Team team, boolean provenGoalscorer) {
        super(name, age, rating, team);
        this.provenGoalscorer = provenGoalscorer;
    }

    public boolean isProvenGoalscorer() {
        return provenGoalscorer;
    }

    public void setProvenGoalscorer(boolean provenGoalscorer) {
        this.provenGoalscorer = provenGoalscorer;
    }


}
