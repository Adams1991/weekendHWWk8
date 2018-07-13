
import models.Midfielder;
import models.Team;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MidfielderTest {

    Midfielder midfielder;
    Team team;

    @Before
    public void setUp() {
        team = new Team();
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
    }

    @Test
    public void setAge() {
    }

    @Test
    public void getRating() {
    }

    @Test
    public void setRating() {
    }

    @Test
    public void getTeam() {
    }

    @Test
    public void setTeam() {
    }

    @Test
    public void getPassAccurracy(){

    }

    @Test
    public void setPassAccurracy(){

    }
}