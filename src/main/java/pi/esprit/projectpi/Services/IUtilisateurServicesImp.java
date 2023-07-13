package pi.esprit.projectpi.Services;


import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;
import pi.esprit.projectpi.Entities.Utilisateur;
import pi.esprit.projectpi.Repositories.UtilisateurRepository;
import java.util.List;

@Service
@RequiredArgsConstructor
@Getter
@Setter
public class IUtilisateurServicesImp implements IUtilisateurServices {

    private final UtilisateurRepository utilisateurRepository;

    @Override
    public List<Utilisateur> getAllUsers() {
        return  utilisateurRepository.findAll();
    }

    @Override
    public void addUser(Utilisateur utilisateur) {
        utilisateurRepository.save(utilisateur);
    }

    @Override
    public Utilisateur getById(Integer idUser) {
        return utilisateurRepository.findById(idUser).get() ;
    }

    @Override
    public void updateUser(Utilisateur utilisateur) {

        utilisateurRepository.save(utilisateur);
    }

}
