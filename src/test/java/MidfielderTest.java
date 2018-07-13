
import models.Midfielder;
import models.Team;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MidfielderTest {

    Midfielder midfielder;
    Team team;
    Team team2;

    @Before
    public void setUp() {
        team = new Team();
        team2 = new Team();
        midfielder = new Midfielder("John", 30, 10, team, 30 );
    }


    @Test
    public void getName() {
        assertEquals("John", midfielder.getName());
    }

    @Test
    public void setName() {
        midfielder.setName("Bla");
        assertEquals("Bla", midfielder.getName());
    }

    @Test
    public void getAge() {
        assertEquals(30, midfielder.getAge());
    }

    @Test
    public void setAge() {
        midfielder.setAge(10);
        assertEquals(10, midfielder.getAge());
    }

    @Test
    public void getRating() {
        assertEquals(10, midfielder.getRating());
    }

    @Test
    public void setRating() {
        midfielder.setRating(9);
        assertEquals(9, midfielder.getRating());
    }

    @Test
    public void getTeam() {
        assertEquals(team, midfielder.getTeam());
    }

    @Test
    public void setTeam() {
        midfielder.setTeam(team2);
        assertEquals(team2, midfielder.getTeam());
    }

    @Test
    public void getPassAccuracy(){
        assertEquals(30, midfielder.getPassAccuracy(), 0.01);
    }

    @Test
    public void setPassAccuracy(){
        midfielder.setPassAccuracy(40);
        assertEquals(40, midfielder.getPassAccuracy(), 0.01);
    }
}