package pi.esprit.projectpi.Services;

import pi.esprit.projectpi.Entities.OffreFrs;

import java.util.Set;

public interface IOffreFrsServices {
    OffreFrs ajouterOffreFrs(OffreFrs o);
    OffreFrs modifierOffreFrs(OffreFrs o);
    OffreFrs getOffreFrsById(int idOffreFrs);
    void supprimerOffreFrs(int idOffreFrs);
    Set<OffreFrs> getAllOffresFrs();
    Set<OffreFrs> getAllOffresLessThanValue(float seuil);
}
