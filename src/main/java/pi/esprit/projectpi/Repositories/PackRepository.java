package pi.esprit.projectpi.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pi.esprit.projectpi.Entities.Pack;

import java.util.Set;

public interface PackRepository extends JpaRepository<Pack,Integer> {

}
