package com.example.teacherservice;

import com.example.teacherservice.Repos.ProfesseurRepo;
import com.example.teacherservice.entities.Professeur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.text.SimpleDateFormat;

@SpringBootApplication
public class ProfesseurServiceApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(ProfesseurServiceApplication.class, args);
    }

    @Autowired
    ProfesseurRepo professeurRepo;
    @Override
    public void run(String... args) throws Exception {
        professeurRepo.save(new Professeur(null,"Houda","s",new SimpleDateFormat("dd-MM-yyyy").parse("05-05-1212"),"test@"));
        professeurRepo.save(new Professeur(null,"Fadoua","s",new SimpleDateFormat("dd-MM-yyyy").parse("05-05-1212"),"test@"));
        professeurRepo.save(new Professeur(null,"Sara","s",new SimpleDateFormat("dd-MM-yyyy").parse("05-05-1212"),"test@"));
    }
}
