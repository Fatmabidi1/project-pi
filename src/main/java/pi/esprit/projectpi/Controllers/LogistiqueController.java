package pi.esprit.projectpi.Controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import pi.esprit.projectpi.Entities.Logistique;
import pi.esprit.projectpi.Entities.OffreFrs;
import pi.esprit.projectpi.Services.ILogistiqueServices;

import java.util.Set;

@RestController
@RequestMapping("/logistique")
@RequiredArgsConstructor
@CrossOrigin("*")
public class LogistiqueController {
    private final ILogistiqueServices logistiqueServices;

    @PostMapping("add")
    private Logistique ajouterLogistique(@RequestBody Logistique l) {
        return logistiqueServices.ajouterLogistique(l);
    }

    @PutMapping("update")
    private Logistique modifierLogistique(@RequestBody Logistique l) {
        return logistiqueServices.modifierLogistique(l);
    }

    @DeleteMapping("delete/{idLogistique}")
    private void supprimerLogistique(@PathVariable int idLogistique) {
        logistiqueServices.supprimerLogistique(idLogistique);
    }

    @GetMapping("Get/{idLogistique}")
    private Logistique getLogistiqueById(@PathVariable int idLogistique) {
        return logistiqueServices.getLogistiqueById(idLogistique);
    }

    @GetMapping("GetAll")
    private Set<Logistique> getAllLogistiques() {
        return logistiqueServices.getAllLogistiques();
    }


}
