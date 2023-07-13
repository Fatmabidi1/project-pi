package pi.esprit.projectpi.Services;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;
import pi.esprit.projectpi.Entities.OffreFrs;
import pi.esprit.projectpi.Repositories.OffreFrsRepository;

import java.util.Set;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Getter
@Setter
public class IOffreFrsServicesImp implements IOffreFrsServices {

    private final OffreFrsRepository offreFrsRepository;

    @Override
    public OffreFrs ajouterOffreFrs(OffreFrs o) {
        return offreFrsRepository.save(o);
    }

    @Override
    public OffreFrs modifierOffreFrs(OffreFrs o) {
        return offreFrsRepository.save(o);
    }

    @Override
    public OffreFrs getOffreFrsById(int idOffreFrs) {
        return offreFrsRepository.findById(idOffreFrs).orElse(null);
    }

    @Override
    public void supprimerOffreFrs(int idOffreFrs) {
        offreFrsRepository.deleteById(idOffreFrs);
    }

    @Override
    public Set<OffreFrs> getAllOffresFrs() {
        return offreFrsRepository.findAll().stream().collect(Collectors.toSet());
    }

    @Override
    public Set<OffreFrs> getAllOffresLessThanValue(float seuil) {
        Set<OffreFrs> OffresSet = getAllOffresFrs();
        OffresSet.stream().filter(offreFrs -> offreFrs.getPrix()<= seuil);
        return  OffresSet;
    }
}
