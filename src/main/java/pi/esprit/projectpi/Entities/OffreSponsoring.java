package pi.esprit.projectpi.Entities;
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
@Table (name = "OffreSponsoring")
public class OffreSponsoring {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int idOffre;
    String description;
    Float prix;
    String adresseSponsor;
    @ManyToMany
    Set<Pack> packSet;
    @OneToOne
    Utilisateur user;
}
