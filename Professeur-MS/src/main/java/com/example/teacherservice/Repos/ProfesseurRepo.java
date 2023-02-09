package com.example.teacherservice.Repos;

import com.example.teacherservice.entities.Professeur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ProfesseurRepo extends JpaRepository<Professeur,Long> {

}
