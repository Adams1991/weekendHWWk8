
import models.*;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;

public class TeamTest {


    Manager manager1;
    Manager manager2;
    Team team1;
    Team team2;
    Competition competition;
    Competition competition2;
    Midfielder midfielderForTeam1;
    Striker strikerForTeam2;

    @Before
    public void setUp() {
        competition = new Competition("Champs Cup", "No Winner", false);
        competition2 = new Competition();
        team1= new Team("Barca", 30, competition);
        team2 = new Team("Cowden FC", 30, competition);
        manager1 = new Manager("John", 10, team1);
        manager2 = new Manager("Bob", 8, team2);
        strikerForTeam2 = new Striker("Rachel", 23, 6, team2, true);
        midfielderForTeam1 = new Midfielder("John", 30, 9, team2, 20);
    }


    @Test
    public void getName() {
        assertEquals("Barca", team1.getName());
    }

    @Test
    public void setName() {
        team1.setName("Bla");
        assertEquals("Bla", team1.getName());
    }

    @Test
    public void getPoints() {
        assertEquals(30, team1.getPoints());
    }

    @Test
    public void setPoints() {
        team1.setPoints(9);
        assertEquals(9, team1.getPoints());
    }



    @Test
    public void setManager(){
        team1.setManager(manager2);
        assertEquals(manager2, team1.getManager());
    }

    @Test
    public void getCompetition(){
        assertEquals(competition, team1.getCompetition());
    }

    @Test
    public void setCompetition(){
        team1.setCompetition(competition2);
        assertEquals(competition2, team1.getCompetition());
    }

    @Test
    public void getOverallPlayersRatings() {
        team2.getPlayers().add(strikerForTeam2);
        assertEquals(6, team2.OverallPlayersRatings());
    }

//    @Test
//    public void canPlayGame__win(){
//        team2.getPlayers().add(strikerForTeam2);
//        team1.getPlayers().add(midfielderForTeam1);
//        team1.playGame(team2);
//        assertEquals( 33, team1.getPoints());
//    }


}
