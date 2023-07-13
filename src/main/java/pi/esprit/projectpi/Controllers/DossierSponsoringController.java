package pi.esprit.projectpi.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pi.esprit.projectpi.Entities.DossierSponsoring;
import pi.esprit.projectpi.Entities.OffreSponsoring;
import pi.esprit.projectpi.Entities.Utilisateur;
import pi.esprit.projectpi.Services.IdossierSponsoringService;
import pi.esprit.projectpi.Services.IoffreSponsoringService;

import java.util.List;

@RestController
@RequestMapping("/DossierSponsoring")
@CrossOrigin("*")
public class DossierSponsoringController {
 @Autowired
 private IdossierSponsoringService idossierSponsoringService;
 @Autowired
 private IoffreSponsoringService ioffreSponsoringService;


    @GetMapping("/getAll")

    public List<DossierSponsoring> getAll(){
        return  idossierSponsoringService.getAllDossierSponsoring();
    }


    @PostMapping("/add")
    public void ajouterOffre(@RequestBody OffreSponsoring offreSponsoring){
        ioffreSponsoringService.ajouterOffreSponsoring(offreSponsoring);
    }

    @PostMapping("/addFolder")
    public DossierSponsoring addFolder(@RequestBody DossierSponsoring dossierSponsoring){
        System.out.println(dossierSponsoring);
        return idossierSponsoringService.ajouterDossierSponsoring(dossierSponsoring);
    }

    @GetMapping("/folderByEvent/{id}")
    public DossierSponsoring addFolder(@PathVariable int id){
        return idossierSponsoringService.findByEventId(id);
    }


}
