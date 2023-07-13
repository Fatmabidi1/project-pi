package pi.esprit.projectpi.Services;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pi.esprit.projectpi.Entities.DossierSponsoring;
import pi.esprit.projectpi.Repositories.DossierSponsoringRepository;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor

public class DossierSponsoringServiceImpl implements IdossierSponsoringService{
    @Autowired
    DossierSponsoringRepository dossierSponsoringRepository;
    @Override
    public DossierSponsoring ajouterDossierSponsoring(DossierSponsoring dossierSponsoring) {
return dossierSponsoringRepository.save(dossierSponsoring);
    }

    @Override
    public void updateDossierSponsoring(DossierSponsoring dossierSponsoring) {
        dossierSponsoringRepository.save(dossierSponsoring);

    }

    @Override
    public List<DossierSponsoring> getAllDossierSponsoring() {
        return dossierSponsoringRepository.findAll();
    }

    @Override
    public DossierSponsoring getById(Integer idDossier) {
        return dossierSponsoringRepository.findById(idDossier).orElse(null);
    }

    @Override
    public void deleteDossierSponsoring(Integer idDossier) {
dossierSponsoringRepository.deleteById(idDossier);
    }

    @Override
    public DossierSponsoring findByEventId(int id) {
        System.out.println(id);
        return dossierSponsoringRepository.findDossierSponsoringByEvenementIdEvent(id).orElse(null);
    }


}
