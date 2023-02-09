package com.example.subjectservice;

import com.example.subjectservice.entities.Cours;
import com.example.subjectservice.repos.CoursRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

@SpringBootApplication
public class MatiereServiceApplication implements CommandLineRunner {

    @Autowired
    CoursRepo coursRepo;
    public static void main(String[] args) {
        SpringApplication.run(MatiereServiceApplication.class, args);
    }

    @Autowired
    RepositoryRestConfiguration repositoryRestConfiguration;

    @Override
    public void run(String... args) throws Exception {
        repositoryRestConfiguration.exposeIdsFor(Cours.class);

        coursRepo.save(new Cours(null,"big data","5IIR",24));
        coursRepo.save(new Cours(null,"jee","5IIR",24));
        coursRepo.save(new Cours(null,"erp","5IIR",24));
    }
}
