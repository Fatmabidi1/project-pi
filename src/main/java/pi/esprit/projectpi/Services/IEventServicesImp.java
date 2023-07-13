package pi.esprit.projectpi.Services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pi.esprit.projectpi.Entities.Evenement;
import pi.esprit.projectpi.Repositories.EventRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class IEventServicesImp implements IEventServices {
    private final EventRepository evenementRepository ;
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
        System.out.println(idEvent);
        return evenementRepository.findById(idEvent).get() ;
    }

    @Override
    public List<Evenement> getAll() {
        return  evenementRepository.findAll();
    }
}
