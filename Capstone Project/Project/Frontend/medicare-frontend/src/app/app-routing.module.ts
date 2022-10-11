import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AdminMedicineRetrieveComponent } from './admin-medicine-retrieve/admin-medicine-retrieve.component';
import { AdmindashboardComponent } from './admindashboard/admindashboard.component';
import { LoginComponent } from './login/login.component';
import { MedicineAddComponent } from './medicine-add/medicine-add.component';
import { SignupComponent } from './signup/signup.component';
import { UserdashboardComponent } from './userdashboard/userdashboard.component';

const routes: Routes = [
  {path:"login",component:LoginComponent},
  {path:"adminhome",component:AdmindashboardComponent},
  {path:"userhome",component:UserdashboardComponent},
  {path:"login/signUp",component:SignupComponent},
  {path:"addMedicine",component:MedicineAddComponent},
  {path:"adminRetrieveMedicine",component:AdminMedicineRetrieveComponent},
  {path:"",redirectTo:"login",pathMatch:"full"}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
