import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CompanyComponent } from './company/company.component';
import { CompanydetailsComponent } from './companydetails/companydetails.component';
import { LoginComponent } from './login/login.component';
import { AuthGuard } from './shared/auth.guard';
import { StockComponent } from './stock/stock.component';
import { UserComponent } from './user/user.component';

const routes: Routes = [
 
  {path:'', component:LoginComponent},
  {path:'register', component:UserComponent},
  {path:'home', canActivate:[AuthGuard], component:CompanyComponent},
  {path:'company/:id', canActivate:[AuthGuard], component:CompanydetailsComponent},
  {path:'putstock/:id',component:StockComponent},
  {path:'getcompanybyid/:id',component:CompanyComponent},
  {path:'stockdata/:id',component:StockComponent}
  
  
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
