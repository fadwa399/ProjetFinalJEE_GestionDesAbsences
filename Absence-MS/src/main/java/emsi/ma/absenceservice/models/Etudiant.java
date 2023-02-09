package emsi.ma.absenceservice.models;

import lombok.Data;

import java.util.Date;


@Data


public class Etudiant {

        private Long id;
        private String nom;
        private String cin;
        private String cne;
        private Date dateNaissance;
        private String email;

}
