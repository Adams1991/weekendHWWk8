import models.Striker;
import models.Team;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StrikerTest {

    Striker striker;
    Team team;
    Team team2;

    @Before
    public void setUp() {
        team = new Team();
        team2 = new Team();
        striker = new Striker("John", 30, 10, team, true);
    }


    @Test
    public void getName() {
        assertEquals("John", striker.getName());
    }

    @Test
    public void setName() {
        striker.setName("Bla");
        assertEquals("Bla", striker.getName());
    }

    @Test
    public void getAge() {
        assertEquals(30, striker.getAge());
    }

    @Test
    public void setAge() {
        striker.setAge(10);
        assertEquals(10, striker.getAge());
    }

    @Test
    public void getRating() {
        assertEquals(10, striker.getRating());
    }

    @Test
    public void setRating() {
        striker.setRating(9);
        assertEquals(9, striker.getRating());
    }

    @Test
    public void getTeam() {
        assertEquals(team, striker.getTeam());
    }

    @Test
    public void setTeam() {
        striker.setTeam(team2);
        assertEquals(team2, striker.getTeam());
    }

    @Test
    public void isProvenGoalscorer(){
        assertEquals(true, striker.isProvenGoalscorer());
    }

    @Test
    public void setProvenGoalscorer(){
        striker.setProvenGoalscorer(false);
        assertEquals(false, striker.isProvenGoalscorer());
    }
}
