// @ts-ignore
import { NgModule } from '@angular/core';
// @ts-ignore
import { RouterModule, Routes } from '@angular/router';
import {AbsenceComponent} from "./absence/absence.component";
import {EtudiantComponent} from "./etudiant/etudiant.component";
import {ProfesseurComponent} from "./professeur/professeur.component";

const routes: Routes = [
  {path:"Abcenses",component : AbsenceComponent},
  {path:"Students",component:EtudiantComponent },
  {path:"Teachers",component:ProfesseurComponent },

];

// @ts-ignore
@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
