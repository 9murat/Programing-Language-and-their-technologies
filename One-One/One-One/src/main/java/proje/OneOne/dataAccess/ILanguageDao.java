package proje.OneOne.dataAccess;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import proje.OneOne.entities.Language;
@Qualifier("languages")
public interface ILanguageDao extends JpaRepository<Language,Integer> {
    boolean existsById(int id);

}
