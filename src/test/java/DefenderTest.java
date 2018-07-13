import models.Defender;
import models.Team;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DefenderTest {
    
        Defender defender;
        Team team;
        Team team2;

        @Before
        public void setUp() {
            team = new Team();
            team2 = new Team();
            defender = new Defender("John", 30, 10, team);
        }


        @Test
        public void getName() {
            assertEquals("John", defender.getName());
        }

        @Test
        public void setName() {
            defender.setName("Bla");
            assertEquals("Bla", defender.getName());
        }

        @Test
        public void getAge() {
            assertEquals(30, defender.getAge());
        }

        @Test
        public void setAge() {
            defender.setAge(10);
            assertEquals(10, defender.getAge());
        }

        @Test
        public void getRating() {
            assertEquals(10, defender.getRating());
        }

        @Test
        public void setRating() {
            defender.setRating(9);
            assertEquals(9, defender.getRating());
        }

        @Test
        public void getTeam() {
            assertEquals(team, defender.getTeam());
        }

        @Test
        public void setTeam() {
            defender.setTeam(team2);
            assertEquals(team2, defender.getTeam());
        }


        
        
}

