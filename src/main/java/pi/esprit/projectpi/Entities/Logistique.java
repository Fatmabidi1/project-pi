package pi.esprit.projectpi.Entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Logistique implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idLogistique;
    private String description;
    @OneToMany(mappedBy = "logistique")
    private Set<OffreFrs> listeOffres;

}
