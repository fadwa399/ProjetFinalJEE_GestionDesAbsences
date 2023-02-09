import {Student} from "./Etudiant.model";
import {Subject} from "./Matiere.model";

export interface Absence{

  id	:number;
  student: Student;
studentID: number;
cours	:Subject;
courID:number
nbrAbsence:number;


}
