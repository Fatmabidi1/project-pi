package pi.esprit.projectpi.Services;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;
import pi.esprit.projectpi.Entities.Evenement;
import pi.esprit.projectpi.Entities.Logistique;
import pi.esprit.projectpi.Repositories.EvenementRepository;
import pi.esprit.projectpi.Repositories.LogistiqueRepository;


import java.util.Set;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Getter
@Setter
public class ILogistiqueServicesImp implements ILogistiqueServices {
    private final LogistiqueRepository logistiqueRepository;
    private final EvenementRepository evenementRepository;

    @Override
    public Logistique ajouterLogistique(Logistique l) {
        return logistiqueRepository.save(l);
    }

    @Override
    public Logistique modifierLogistique(Logistique l) {
        return logistiqueRepository.save(l);
    }

    @Override
    public void supprimerLogistique(int idLogistique ) {
         logistiqueRepository.deleteById(idLogistique);
    }

    @Override
    public Logistique getLogistiqueById(int idLogistique) {
        return logistiqueRepository.findById(idLogistique).orElse(null);
    }

    @Override
    public Set<Logistique> getAllLogistiques() {
        return logistiqueRepository.findAll().stream().collect(Collectors.toSet());
    }

    @Override
    public void assignLogistiqueToEvent(int idEvent, int idLogistique) {
       Evenement e = evenementRepository.findById(idEvent).orElse(null);
       //To be finished after mapping
    }
}
