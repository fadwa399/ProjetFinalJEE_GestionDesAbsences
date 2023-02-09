import {Component, OnInit} from '@angular/core';
import {Student} from "../models/Etudiant.model";
import {EtudiantService} from "../services/etudiant.service";
import {Teacher} from "../models/Professeur.model";
import {ProfesseurService} from "../services/professeur.service";

@Component({
  selector: 'app-teacher',
  templateUrl: './professeur.component.html',
  styleUrls: ['./professeur.component.css']
})
export class ProfesseurComponent implements OnInit {
  erreurMessage!: object;

  teachers !: Array<Teacher> ;

  constructor( private teacherService:ProfesseurService){}
  ngOnInit(): void {
    this.teacherService.getTeachers().subscribe({
      next:(data)=>{
        console.log(data)

        this.teachers=data._embedded.teachers
        console.log(this.teachers)

      },error:(err)=>{
        this.erreurMessage=err.message;
        console.log(err)
      }
    })
  }


  handelDeleteTeacher(teacher: Teacher) {

  }

  handelUpdateTeacher(teacher: Teacher) {

  }
}
