package proje.OneOne.dataAccess;

import org.springframework.data.jpa.repository.JpaRepository;
import proje.OneOne.entities.Technologies;

public interface ITechnologyDao extends JpaRepository<Technologies,Integer> {
}
