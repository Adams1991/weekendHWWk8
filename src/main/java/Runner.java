import db.DBCompetition;
import db.DBHelper;
import db.DBTeam;
import models.*;

import java.util.List;

public class Runner {

    public static void main(String[] args) {


        // Competition CRUD tests

        Competition competition = competition = new Competition("Champs Cup", "No Winner", false);
        DBHelper.save(competition);
        competition.setName("FA Cup");
        DBHelper.update(competition);

        Competition competition2 = new Competition("Bla Cup", "No Winner", false);
        DBHelper.save(competition2);
        DBHelper.delete(competition2);

        Competition foundCompetition = DBHelper.findById(Competition.class, 1);

        List<Competition> allCompetitions = DBHelper.getAll(Competition.class);


        // Team CRUD tests

        Team team = new Team("Cowden FC", 30, competition);
        DBHelper.save(team);
        team.setName("Loch FC");
        DBHelper.update(team);

        Team team3 = new Team("Barca", 30, competition);
        DBHelper.save(team3);

        Team team2 = new Team("Bla United" , 10, competition);
        DBHelper.save(team2);
        DBHelper.delete(team2);

        Team foundTeam = DBHelper.findById(Team.class, 1);

        List<Team> allTeams = DBHelper.getAll(Team.class);


        // Player Crud tests(only testing on subclass)

        Midfielder midfielder = new Midfielder("Grant", 10, 10, team, 100);
        DBHelper.save(midfielder);
        midfielder.setName("Bill");
        DBHelper.update(midfielder);

        Midfielder midfielder2 = new Midfielder("Stacey" , 20, 30, team, 100);
        DBHelper.save(midfielder2);
        DBHelper.delete(midfielder2);

        Midfielder foundMidfielder = DBHelper.findById(Midfielder.class, 1);

        List<Midfielder> allMidfielders = DBHelper.getAll(Midfielder.class);
        
        
        Striker striker = new Striker("Bob", 18, 8, team3, true);
        DBHelper.save(striker); 
        
        Defender defender = new Defender("Bobi", 18, 20, team);
        DBHelper.save(defender);

        
        // Manager Crud tests
        Manager manager = new Manager("Bob", 10, team);
        DBHelper.save(manager);
        manager.setName("Bill");
        DBHelper.update(manager);

        Manager manager3 = new Manager("Bill", 2, team3);
        DBHelper.save(manager3);

        Manager manager2 = new Manager("Lauren" , 10, team);
        DBHelper.save(manager2);
        DBHelper.delete(manager2);

        Manager foundManager = DBHelper.findById(Manager.class, 1);

        List<Manager> allManagers = DBHelper.getAll(Manager.class);


        List<Team> teamsInComp = DBCompetition.getTeamsInCompetition(competition);

        List<Player> playersInTeam = DBTeam.getPlayers(team);

        Manager teamManager = DBTeam.getManager(team);


        DBCompetition.playCompetition(competition);



    }


}
