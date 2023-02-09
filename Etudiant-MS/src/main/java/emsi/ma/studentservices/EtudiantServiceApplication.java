package emsi.ma.studentservices;

import emsi.ma.studentservices.entities.Etudiant;
import emsi.ma.studentservices.repository.EtudiantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import java.text.SimpleDateFormat;

@SpringBootApplication

public class EtudiantServiceApplication implements CommandLineRunner  {

    public static void main(String[] args) {
        SpringApplication.run(EtudiantServiceApplication.class, args);
    }

    @Autowired
    EtudiantRepository etudiantRepository;
    @Autowired
    RepositoryRestConfiguration repositoryRestConfiguration;

    @Override
    public void run(String... args) throws Exception {
        repositoryRestConfiguration.exposeIdsFor(Etudiant.class);
        etudiantRepository.save(new Etudiant(null,"Fadoua Jabilou","bwdhk3","syy",new SimpleDateFormat("dd-MM-yyyy").parse("05-05-1212"),"xxx@gmail.com"));
        etudiantRepository.save(new Etudiant(null,"Houda Mouttaqui","hkgk","sbb",new SimpleDateFormat("dd-MM-yyyy").parse("05-05-1212"),"yyy@gmail.com"));
        etudiantRepository.save(new Etudiant(null,"Sara Hmamsi","plfkg","spp",new SimpleDateFormat("dd-MM-yyyy").parse("05-05-1212"),"zzz@gmail.com"));
    }
}
