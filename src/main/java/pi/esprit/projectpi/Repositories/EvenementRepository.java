
package pi.esprit.projectpi.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pi.esprit.projectpi.Entities.Evenement;


public interface EvenementRepository extends JpaRepository<Evenement,Integer> {
}