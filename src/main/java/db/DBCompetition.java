package db;

import models.Competition;
import models.Manager;
import models.Team;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import java.util.List;

public class DBCompetition {
    private static Transaction transaction;
    private static Session session;


    public static List<Team> getTeamsInCompetition(Competition competition) {
        session = HibernateUtil.getSessionFactory().openSession();
        List<Team> results = null;
        try {
            Criteria cr = session.createCriteria(Team.class);
            cr.add(Restrictions.eq("competition", competition));
            results =  cr.list();
        } catch (HibernateException e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
        return results;
    }

    public static Manager getManager(Competition competition){
        session = HibernateUtil.getSessionFactory().openSession();
        Manager manager = null;

        try {
            Criteria cr = session.createCriteria(Manager.class);
            cr.add(Restrictions.eq("competition", competition));
            manager = (Manager)cr.uniqueResult();
        } catch (HibernateException e) {
            e.printStackTrace();
        } finally {
            session.close();
        }

        return manager;
    }

//
//    public static void playCompetition(Object object){
//        session = HibernateUtil.getSessionFactory().openSession();
//        try {
//            transaction = session.beginTransaction();
//            session.update(object);
//            transaction.commit();
//        } catch (HibernateException e) {
//            transaction.rollback();
//            e.printStackTrace();
//        } finally {
//            session.close();
//        }
//    }
}
