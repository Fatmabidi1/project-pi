package pi.esprit.projectpi.Controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import pi.esprit.projectpi.Entities.Logistique;
import pi.esprit.projectpi.Entities.OffreFrs;
import pi.esprit.projectpi.Services.IOffreFrsServices;

import javax.persistence.ManyToOne;
import java.util.Set;

@RestController
@RequestMapping("/OffreFrs")
@RequiredArgsConstructor
@CrossOrigin("*")
public class OffreFrsController {
    private final IOffreFrsServices iOffreFrsServices;

    @PostMapping("add")
    public OffreFrs ajouterOffreFrs(@RequestBody OffreFrs o){
       return  iOffreFrsServices.ajouterOffreFrs(o);
    }
    @PutMapping("update")
    public OffreFrs modifierOffreFrs(@RequestBody OffreFrs o){
        return iOffreFrsServices.modifierOffreFrs(o);
    }

    @GetMapping("get/{idOffreFrs}")
    public OffreFrs getOffreFrsById(@PathVariable int idOffreFrs){
        return iOffreFrsServices.getOffreFrsById(idOffreFrs);
    }

    @DeleteMapping("delete/{idOffreFrs}")
    public void supprimerOffreFrs(@PathVariable int idOffreFrs){
        iOffreFrsServices.supprimerOffreFrs(idOffreFrs);
    }

    @GetMapping("getall")
    public Set<OffreFrs> getAllOffresFrs(){
        return iOffreFrsServices.getAllOffresFrs();
    }

    @GetMapping("getallSeuil/{seuil}")
    public Set<OffreFrs> getAllOffresLessThanValue(@PathVariable float seuil){
        return iOffreFrsServices.getAllOffresLessThanValue(seuil);
    }


}
