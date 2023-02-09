package emsi.ma.studentservices.service;

import emsi.ma.studentservices.entities.Etudiant;

import java.util.List;

public interface IStudentservice {

    List<Etudiant> getStudents();
    Etudiant getStudent(Long id);

}
