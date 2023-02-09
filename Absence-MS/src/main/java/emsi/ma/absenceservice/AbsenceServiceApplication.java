package emsi.ma.absenceservice;

import emsi.ma.absenceservice.entities.Absence;
import emsi.ma.absenceservice.models.Cours;
import emsi.ma.absenceservice.models.Etudiant;
import emsi.ma.absenceservice.repos.AbsenceRepo;
import emsi.ma.absenceservice.service.CoursRestClient;
import emsi.ma.absenceservice.service.EtudiantRestClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class AbsenceServiceApplication implements CommandLineRunner {

	@Autowired
	AbsenceRepo absenceRepo;
	@Autowired

	CoursRestClient coursRestClient;
	@Autowired
	EtudiantRestClient etudiantRestClient;


	public static void main(String[] args) {
		SpringApplication.run(AbsenceServiceApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {

		for (int i = 0; i < 5; i++) {
			Etudiant etudiant = etudiantRestClient.getStudentById(1L);
			Cours cours =coursRestClient.getCoursById(1L);
			Absence absence=new Absence();
			absence.setCourID(cours.getId());
			absence.setStudentID(etudiant.getId());
			absenceRepo.save(absence);
		}




	}
}
