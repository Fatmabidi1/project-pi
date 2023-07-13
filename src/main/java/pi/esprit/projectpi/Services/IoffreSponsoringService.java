package pi.esprit.projectpi.Services;

import pi.esprit.projectpi.Entities.OffreSponsoring;

import java.util.List;
import java.util.Set;

public interface IoffreSponsoringService {
    void ajouterOffreSponsoring(OffreSponsoring offreSponsoring);
    void updateOffreSponsoring(OffreSponsoring offreSponsoring);
    List<OffreSponsoring> getAllOffreSponsoring();
    OffreSponsoring getById(Integer idOffreSponsoring);
    void deleteOffreSponsoring(Integer idOffreSponsoring);
}
