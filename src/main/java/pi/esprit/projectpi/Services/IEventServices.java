package pi.esprit.projectpi.Services;

import pi.esprit.projectpi.Entities.Evenement;

import java.util.List;

public interface IEventServices {

    void addEvent(Evenement e);
    void updateEvent(Evenement e);
    void deleteEvent(Integer idEvent);
    Evenement getById(Integer idEvent);
    List<Evenement> getAll();
}
