import models.Manager;
import models.Team;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;
    Team team;
    Team team2;

    @Before
    public void setUp() {
        team = new Team();
        team2 = new Team();
        manager = new Manager("John", 10, team);
    }


    @Test
    public void getName() {
        assertEquals("John", manager.getName());
    }

    @Test
    public void setName() {
        manager.setName("Bla");
        assertEquals("Bla", manager.getName());
    }
    
    @Test
    public void getAptitude() {
        assertEquals(10, manager.getAptitude());
    }

    @Test
    public void setAptitude() {
        manager.setAptitude(9);
        assertEquals(9, manager.getAptitude());
    }

    @Test
    public void getTeam() {
        assertEquals(team, manager.getTeam());
    }

    @Test
    public void setTeam() {
        manager.setTeam(team2);
        assertEquals(team2, manager.getTeam());
    }

}
