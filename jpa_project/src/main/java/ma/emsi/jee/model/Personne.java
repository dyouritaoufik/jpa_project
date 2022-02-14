package ma.emsi.jee.model;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "descriminateur")
@DiscriminatorValue(value = "personne")
public class Personne {
    @Id
    @GeneratedValue
    private int identifiant;
    private String pseudo;
    private String mail;
    private String codePostal;
    @Override
    public String toString() {
        return "Personne" + identifiant + " " + pseudo;
    }
    public Personne() {
        super();
// TODO Auto-generated constructor stub
    }
    public Personne(String pseudo, String mail, String codePostal) {
        super();
        this.pseudo = pseudo;
        this.mail = mail;
        this.codePostal = codePostal;
    }
    public int getIdentifiant() {
        return identifiant;
    }
    public void setIdentifiant(int identifiant) {
        this.identifiant = identifiant;
    }
    public String getPseudo() {
        return pseudo;
    }
    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }
    public String getMail() {
        return mail;
    }
    public void setMail(String mail) {
        this.mail = mail;
    }
    public String getCodePostal() {
        return codePostal;
    }
    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
    }
}