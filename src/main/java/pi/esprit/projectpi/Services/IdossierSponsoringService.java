package pi.esprit.projectpi.Services;

import pi.esprit.projectpi.Entities.DossierSponsoring;
import pi.esprit.projectpi.Entities.Utilisateur;

import java.util.List;
import java.util.Optional;

public interface IdossierSponsoringService {


    DossierSponsoring ajouterDossierSponsoring(DossierSponsoring dossierSponsoring);
    void updateDossierSponsoring(DossierSponsoring dossierSponsoring);
    List<DossierSponsoring> getAllDossierSponsoring();
    DossierSponsoring getById(Integer idDossier);
    void deleteDossierSponsoring(Integer idDossier);

    DossierSponsoring findByEventId(int id);


}
