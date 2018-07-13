
import models.*;
import org.junit.Before;

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





}
