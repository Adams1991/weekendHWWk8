
import models.*;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;

public class TeamTest {


    Manager manager;
    Manager manager2;
    Team team;
    Team team2;
    Competition competition;
    Competition competition2;

    @Before
    public void setUp() {
        competition = new Competition();
        competition2 = new Competition();
        manager = new Manager("John", 10, team);
        manager2 = new Manager();
        team2= new Team();
        team = new Team("Cowden FC", 30, manager, competition);
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
    public void setPoints() {
        team.setPoints(9);
        assertEquals(9, team.getPoints());
    }

    @Test
    public void getManager(){
        assertEquals(manager, team.getManager());
    }

    @Test
    public void setManager(){
        team.setManager(manager2);
        assertEquals(manager2, team.getManager());
    }

    @Test
    public void getCompetition(){
        assertEquals(competition, team.getCompetition());
    }

    @Test
    public void setCompetition(){
        team.setCompetition(competition2);
        assertEquals(competition2, team.getCompetition());
    }



}
