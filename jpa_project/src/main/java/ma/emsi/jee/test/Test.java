package ma.emsi.jee.test;
import java.util.Date;
import java.util.List;
import ma.emsi.jee.model.Etudiant;
import ma.emsi.jee.model.Personne;
import ma.emsi.jee.model.Professeur;
import ma.emsi.jee.dao.DaoImpl;
import ma.emsi.jee.dao.iDAO;


public class Test {

    private static iDAO dao = new DaoImpl();
    private static void addPersonne(String pseudo, String mail, String codePostal) {
        dao.add(new Personne(pseudo, mail, codePostal));
    }
    private static void addProfesseur(String pseudo, String mail, String codePostal, String diplome) {
        dao.add(new Professeur(pseudo, mail, codePostal, diplome));
    }
    private static void addEtudiant(String pseudo, String mail, String codePostal, Date dateInscription) {
        dao.add(new Etudiant(pseudo, mail, codePostal, dateInscription));
    }
    private static void display() {
        List<Personne> liste = dao.getAllPersons(); for (Personne personne : liste) {
            System.out.println(personne);
        }
    }
    public static void main(String[] args) {
        addPersonne("user01", "user01@gmail.com", "10000");
        /*addPersonne("user02", "user02@gmail.com", "20000");
        addPersonne("user03", "user03@gmail.com", "30000");
        addPersonne("user04", "user04@gmail.com", "40000");
        addProfesseur("user05", "user05@gmail.com", "50000", "INGENIEUR D'ETAT");
        addProfesseur("user06", "user06@gmail.com", "60000", "DOCTEUR D'ETAT");
        addProfesseur("user07", "user07@gmail.com", "70000", "phd");
        addProfesseur("user08", "user08@gmail.com", "80000", "INGENIEUR D'ETAT");
        addEtudiant("user09", "user09@gmail.com", "90000", new Date());
        addEtudiant("user10", "user10@gmail.com", "100000", new Date());
        addEtudiant("user11", "user11@gmail.com", "110000", new Date());
        display();*/
    }
}