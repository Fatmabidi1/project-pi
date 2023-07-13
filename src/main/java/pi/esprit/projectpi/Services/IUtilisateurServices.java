package pi.esprit.projectpi.Services;

import pi.esprit.projectpi.Entities.Evenement;
import pi.esprit.projectpi.Entities.Utilisateur;

import java.util.List;

public interface IUtilisateurServices {

    List<Utilisateur> getAllUsers();

    void addUser(Utilisateur utilisateur);

    void updateUser(Utilisateur utilisateur);

    Utilisateur getById(Integer idUser);

}
