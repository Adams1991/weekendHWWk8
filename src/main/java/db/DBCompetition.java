package db;

import models.Competition;
import models.Manager;
import models.Player;
import models.Team;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static javafx.scene.input.KeyCode.T;

public class DBCompetition {
    private static Transaction transaction;
    private static Session session;


    public static List<Team> getTeamsInCompetition(Competition competition) {
        session = HibernateUtil.getSessionFactory().openSession();
        List<Team> results = null;
        try {
            Criteria cr = session.createCriteria(Team.class);
            cr.add(Restrictions.eq("competition.id", competition.getId()));
            results =  cr.list();

        } catch (HibernateException e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
        return results;
    }



    public static void playCompetition(Competition competition){
        List teamsInComp = getTeamsInCompetition(competition);
        competition.setTeamsInCompetition(teamsInComp);
        competition.runCompetition();
        for (Team team : competition.getTeamsInCompetition()) {
            DBHelper.update(team);
        }
        session = HibernateUtil.getSessionFactory().openSession();
        try {
            transaction = session.beginTransaction();
            session.update(competition);
            transaction.commit();
        } catch (HibernateException e) {
            transaction.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }


}
