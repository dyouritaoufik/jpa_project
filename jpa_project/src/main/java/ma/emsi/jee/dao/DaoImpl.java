package ma.emsi.jee.dao;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import ma.emsi.jee.test.SessionBuilder;
import org.apache.log4j.Logger;
import ma.emsi.jee.model.Personne;


public class DaoImpl implements iDAO {
    private EntityManager session;
    private static final Logger log = Logger.getLogger("DaoImpl");

    public void add(Personne personne) {
        try {
            log.info("ajout de la personne " + personne + " en cours ...");
            session = SessionBuilder.openSession();
            EntityTransaction tx = session.getTransaction();
            tx.begin();
            session.persist(personne);
            tx.commit();
        } catch (Exception e) {
            e.printStackTrace();
            log.error("Erreur de l'ajout de la personne", e);
        } finally {
            session.close();

        }
        log.info("personne " + personne + " ajouté avec succés.");
    }

    public List<Personne> getAllPersons() {
        List<Personne> liste = null;
        try {
            session = SessionBuilder.openSession();
            EntityTransaction tx = session.getTransaction();
            tx.begin();
            liste = (List<Personne>) session.createQuery("from Personne").getResultList();
            tx.commit();
            return liste;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            session.close();
            return liste;
        }
    }
}
