package ma.emsi.jee.dao;

import java.util.List;
import ma.emsi.jee.model.Personne;

public interface iDAO {
    void add(Personne e);
    List<Personne> getAllPersons();
}