import models.Competition;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class CompetitionTest {


    Competition competition;


    @Before
    public void setUp() {
        competition = new Competition("Champs Cup", "No Winner", false);
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
