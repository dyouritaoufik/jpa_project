package ma.emsi.jee.model;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("professeur")
public class Professeur extends Personne {
    private String diplome;
    @Override
    public String toString() {
        return "Professeur : " + diplome + " " + getIdentifiant() + " " + getPseudo();
    }

    public Professeur(String pseudo, String mail, String codePostal, String diplome) {
        super(pseudo, mail, codePostal);
        this.diplome = diplome;
    }
    public Professeur() {
        super();
// TODO Auto-generated constructor stub
    }
    public String getDiplome() {
        return diplome;
    }
    public void setDiplome(String diplome) {
        this.diplome = diplome;
    }
}