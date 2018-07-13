
import models.*;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class TeamTest {

    Midfielder midfielder;
    Striker striker;
    Defender defender;
    Manager manager;
    Team team;
    Team team2;
    Competition competition;

    @Before
    public void setUp() {
        competition = new Competition();
        team2= new Team();
        team = new Team("Cowden FC", 30, manager, competition);
        manager = new Manager("John", 10, team);
        midfielder = new Midfielder("John", 30, 10,team, 30 );
        striker = new Striker("John", 30, 10, team, true);
        defender = new Defender("John", 30, 10, team);

    }


    @Test
    public void getName() {
        assertEquals("Cowden FC", team.getName());
    }

    @Test
    public void setName() {
        team.setName("Bla");
        assertEquals("Bla", team.getName());
    }

    @Test
    public void getPoints() {
        assertEquals(30, team.getPoints());
    }

    @Test
    public void setAptitude() {
        team.setPoints(9);
        assertEquals(9, team.getPoints());
    }
}
