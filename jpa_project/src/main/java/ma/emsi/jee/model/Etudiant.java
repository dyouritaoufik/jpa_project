package ma.emsi.jee.model;
import java.util.Date;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("etudiant")
public class Etudiant extends Personne {
    private Date dateInscription;
    public Etudiant(String pseudo, String mail, String codePostal, Date dateInscription) {
        super(pseudo, mail, codePostal);
        this.dateInscription = dateInscription;
    }
    @Override
    public String toString() {
        return "Etudiant : " + dateInscription.toString() + " " + getIdentifiant() + " " + getPseudo();
    }
    public Date getDateInscription() {
        return dateInscription;
    }
    public Etudiant() {
        super();
// TODO Auto-generated constructor stub
    }
    public void setDateInscription(Date dateInscription) {
        this.dateInscription = dateInscription;
    }
}