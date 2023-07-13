package pi.esprit.projectpi.Controllers;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import pi.esprit.projectpi.Entities.Evenement;
import pi.esprit.projectpi.Entities.Utilisateur;
import pi.esprit.projectpi.Services.IUtilisateurServices;

import java.util.List;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
@CrossOrigin("*")
public class UtilisateurController {
    private final IUtilisateurServices iUtilisateurServices;
    @GetMapping("/getAll")
    public List<Utilisateur> getAll(){
        return  iUtilisateurServices.getAllUsers();
    }

    @PostMapping("/add")
    public void addUser(@RequestBody Utilisateur utilisateur){
        iUtilisateurServices.addUser(utilisateur);
    }


    @GetMapping("{idUser}")
    public Utilisateur getById(@PathVariable int idUser){
        return iUtilisateurServices.getById(idUser);
    }

    @PostMapping("/updateUser")
    public void updateUser(@RequestBody Utilisateur utilisateur){
        iUtilisateurServices.updateUser(utilisateur);
    }




}
