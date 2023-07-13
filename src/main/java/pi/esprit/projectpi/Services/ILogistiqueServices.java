package pi.esprit.projectpi.Services;

import pi.esprit.projectpi.Entities.Logistique;

import java.util.Set;

public interface ILogistiqueServices {
    Logistique ajouterLogistique(Logistique l);
    Logistique modifierLogistique(Logistique l);
   void supprimerLogistique(int idLogistique );
    Logistique getLogistiqueById(int idLogistique);
    Set<Logistique> getAllLogistiques ();
    void assignLogistiqueToEvent(int idEvent, int idLogistique);
}