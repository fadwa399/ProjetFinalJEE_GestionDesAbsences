package emsi.ma.absenceservice.entities;

import emsi.ma.absenceservice.models.Cours;
import emsi.ma.absenceservice.models.Etudiant;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor @AllArgsConstructor
public class Absence {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    @Transient
    private Etudiant etudiant;

    private Long studentID;

    @Transient
    private Cours cours;

    private Long courID;

    private int nbrAbsence;






}
