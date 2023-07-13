package pi.esprit.projectpi.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pi.esprit.projectpi.Entities.DossierSponsoring;
import pi.esprit.projectpi.Entities.Pack;

import java.util.Optional;
import java.util.Set;

public interface DossierSponsoringRepository extends JpaRepository<DossierSponsoring,Integer> {
        Optional<DossierSponsoring> findDossierSponsoringByEvenementIdEvent(int id);

}
