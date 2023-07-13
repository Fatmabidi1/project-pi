package pi.esprit.projectpi.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pi.esprit.projectpi.Entities.Utilisateur;

public interface UtilisateurRepository  extends JpaRepository<Utilisateur,Integer> {
}
