package models;


import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name= "defenders")
public class Defender extends Player {

    public Defender() {
    }

    public Defender(String name, int age, int rating, Team team) {
        super(name, age, rating, team);
    }
}
