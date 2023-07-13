package pi.esprit.projectpi.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pi.esprit.projectpi.Entities.Evenement;

import java.util.Optional;


public interface EventRepository extends JpaRepository<Evenement,Integer> {

}

