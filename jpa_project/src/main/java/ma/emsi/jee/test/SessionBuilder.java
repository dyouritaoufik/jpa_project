package ma.emsi.jee.test;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.apache.log4j.Logger;


public class SessionBuilder {
    private static EntityManagerFactory sessionFactory = null;
    private static final Logger log = Logger.getLogger("SessionBuilder");
    private SessionBuilder() {
    }
    public static EntityManagerFactory getSessionFactory() {
        if (sessionFactory == null) {
            try {
// Create the SessionFactory
                sessionFactory = Persistence.createEntityManagerFactory("JPA_Project");
            } catch (Exception e) {
                System.err.println("sessionFactory error " + e);
                e.printStackTrace();
                log.error("SessionFactory creation failed", e);
            }
        }
        log.info("Session Factory crée avec succés");
        return sessionFactory;
    }
    public static EntityManager openSession() {
        return getSessionFactory().createEntityManager();
    }
}