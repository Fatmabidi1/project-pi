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
@Table (name = "Pack")
public class Pack {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int idPack;
    @Enumerated(EnumType.STRING)
    type_pack typePack;
    String descritpion;
    @ManyToOne
            @JsonIgnore
    DossierSponsoring dossier;
    @ManyToMany(mappedBy = "packSet")
    Set<OffreSponsoring> offreSponsoringSet;
}
