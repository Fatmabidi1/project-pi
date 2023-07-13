package pi.esprit.projectpi.Services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pi.esprit.projectpi.Entities.Evenement;
import pi.esprit.projectpi.Repositories.EvenementRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class IEvenementServicesIpm implements IEvenementServices {
  private final EvenementRepository evenementRepository ;
    @Override
    public void addEvent(Evenement e) {
        evenementRepository.save(e);

    }

    @Override
    public void updateEvent(Evenement e) {

        evenementRepository.save(e);
    }

    @Override
    public void deleteEvent(Integer idEvent) {
        evenementRepository.deleteById(idEvent);

    }

    @Override
    public Evenement getById(Integer idEvent) {
        return evenementRepository.findById(idEvent).get() ;
    }

    @Override
    public List<Evenement> getAll() {
        return  evenementRepository.findAll();
    }
}
