package emsi.ma.absenceservice.service;

import emsi.ma.absenceservice.models.Etudiant;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name="STUDENTS-SERVICE")
public interface EtudiantRestClient {

    @GetMapping(path="/students/{id}")
    Etudiant getStudentById(@PathVariable Long id);

    @GetMapping(path="/students")
    List<Etudiant> getStudents();

}
