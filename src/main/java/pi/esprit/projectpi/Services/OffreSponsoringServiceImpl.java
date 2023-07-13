package pi.esprit.projectpi.Services;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pi.esprit.projectpi.Entities.OffreSponsoring;
import pi.esprit.projectpi.Repositories.OffreSponsoringRepository;

import java.util.List;
import java.util.Set;
@Service
@RequiredArgsConstructor


public class OffreSponsoringServiceImpl implements IoffreSponsoringService{
    @Autowired
    OffreSponsoringRepository offreSponsoringRepository;
    @Override
    public void ajouterOffreSponsoring(OffreSponsoring offreSponsoring) {
        offreSponsoringRepository.save(offreSponsoring);

    }

    @Override
    public void updateOffreSponsoring(OffreSponsoring offreSponsoring) {
offreSponsoringRepository.save(offreSponsoring);
    }

    @Override
    public List<OffreSponsoring> getAllOffreSponsoring() {
        return offreSponsoringRepository.findAll();
    }

    @Override
    public OffreSponsoring getById(Integer idOffreSponsoring) {
        return offreSponsoringRepository.findById(idOffreSponsoring).orElse(null);
    }

    @Override
    public void deleteOffreSponsoring(Integer idOffreSponsoring) {
        offreSponsoringRepository.deleteById(idOffreSponsoring);

    }
}
