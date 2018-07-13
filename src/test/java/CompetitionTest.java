import models.*;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class CompetitionTest {


    Competition competition;
    Team team1;
    Team team2;
    Midfielder midfielderForTeam1;
    Striker strikerForTeam2;
    Manager manager1;
    Manager manager2;




    @Before
    public void setUp() {
        competition = new Competition("Champs Cup", "No Winner", false);
        team1= new Team();
        team2 = new Team("Cowden FC", 30, competition);
        manager1 = new Manager("John", 8, team1);
        manager2 = new Manager("Bob", 10, team2);
        strikerForTeam2 = new Striker("Rachel", 23, 10, team2, true);
        midfielderForTeam1 = new Midfielder("John", 30, 9, team2, 20);
    }


    @Test
    public void getName() {
        assertEquals("Champs Cup", competition.getName());
    }

    @Test
    public void setName() {
        competition.setName("Bla");
        assertEquals("Bla", competition.getName());
    }


    @Test
    public void getWinner() {
        assertEquals("No Winner", competition.getWinner());
    }

    @Test
    public void setWinner() {
        competition.setWinner("Bla");
        assertEquals("Bla", competition.getWinner());
    }

    @Test
    public void isComplete(){
        assertEquals(false, competition.isCompetitionComplete());
    }

    @Test
    public void setComplete(){
        competition.setCompetitionComplete(true);
        assertEquals(true, competition.isCompetitionComplete());
    }






}
