package pi.esprit.projectpi.Controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import pi.esprit.projectpi.Entities.Evenement;
import pi.esprit.projectpi.Services.IEventServices;


import java.util.List;

@RestController
@RequestMapping("evenement")
@RequiredArgsConstructor
@CrossOrigin("*")
public class EventController {
    private final IEventServices iEventServices;

    @GetMapping("/getAll")
    @CrossOrigin(origins = "http://localhost:4200")
    public List<Evenement> getAll(){
        return  iEventServices.getAll();
    }

    @GetMapping("{idEvent}")
    public Evenement getById(@PathVariable int idEvent){
        return iEventServices.getById(idEvent);
    }

    @PostMapping("/addEvent")
    public void addEvent(@RequestBody Evenement evenement){
        iEventServices.addEvent(evenement);
    }
	

    @PostMapping("/UpdateEvent")
    public void upadteEvent(@RequestBody Evenement evenement){
        iEventServices.updateEvent(evenement);
    }
}
