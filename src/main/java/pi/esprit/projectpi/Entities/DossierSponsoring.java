package pi.esprit.projectpi.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@FieldDefaults (level = AccessLevel.PRIVATE)
@Table (name = "DossierSponsoring")
public class DossierSponsoring {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int idDossier;
    String description;


    private String titre;

    private String publicCible;
    private String planVisibilite;
    private String optionsPartenariat;
    private String contactCoordonnees;

    @OneToMany(cascade = CascadeType.ALL)
    Set<Pack> pack_list;

    @OneToOne
    Evenement evenement;

}
