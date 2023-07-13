package pi.esprit.projectpi.Entities;

import lombok.*;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
import javax.persistence.OneToOne;
import lombok.experimental.FieldDefaults;
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@FieldDefaults (level = AccessLevel.PRIVATE)
@Table (name = "Evenement")

public class Evenement {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    public int idEvent ;
    public String nom ;
    public Date date ;
    public String lieu ;
    public String description ;

    @Enumerated(EnumType.STRING)
    private  TypeEvent typeEvent;
    @Enumerated(EnumType.STRING)
    private  ThemeEvent themeEvent;
    public Boolean PossibiliteStaff;
    public float horaireStaff ;
    public String lienAcces;



}
