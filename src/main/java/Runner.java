import db.DBHelper;
import models.*;

public class Runner {

    public static void main(String[] args) {


        // Competition CRUD test

        Competition competition = competition = new Competition("Champs Cup", "No Winner", false);
        DBHelper.save(competition);

        Competition competition2 = competition = new Competition("Bla Cup", "No Winner", false);
        DBHelper.save(competition);
        competition2.setName("FA Cup");
        DBHelper.update(competition2);

        Team team = new Team("Cowden FC", 30, competition);
        DBHelper.save(team);

        Midfielder midfielder = new Midfielder("Bob", 18, 20, team, 100 );
        DBHelper.save(midfielder); 
        
        Striker striker = new Striker("Bob", 18, 20, team, true);
        DBHelper.save(striker); 
        
        Defender defender = new Defender("Bob", 18, 20, team );
        DBHelper.save(defender);

        Manager manager = new Manager("John", 10, team);
        DBHelper.save(manager);





    }


}
