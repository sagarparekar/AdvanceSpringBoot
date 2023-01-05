import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { HttpClientModule, HTTP_INTERCEPTORS } from '@angular/common/http';
import { AppRoutingModule } from './app-routing.module';
import { StockComponent } from './stock/stock.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { MatButtonModule } from '@angular/material/button';
import { MatToolbarModule } from '@angular/material/toolbar';
import { MatSidenavModule } from '@angular/material/sidenav';
import { MatIconModule } from '@angular/material/icon';
import { MatListModule } from '@angular/material/list';
import { MatTableModule} from '@angular/material/table';
import { MatExpansionModule } from '@angular/material/expansion';
import { MatInputModule } from '@angular/material/input';
import { MatCardModule } from '@angular/material/card';
import {MatSelectModule} from '@angular/material/select';
import {MatDialogModule} from '@angular/material/dialog';
import { RouterModule } from '@angular/router';
import { CompanydetailsComponent } from './companydetails/companydetails.component';
import { SortGridPipeService } from './companydetails/sort-grid-pipe.service';
import { MatSliderModule } from '@angular/material/slider';
import {MatFormFieldModule} from '@angular/material/form-field';

import { UserComponent } from './user/user.component';
import { LoginComponent } from './login/login.component';
import { AppComponent } from './app.component';
import { CompanyComponent } from './company/company.component';
import { AuthHttpInterceptorService } from './auth-http-interceptor.service';


@NgModule({
  declarations: [
    AppComponent,
    CompanyComponent,
    StockComponent,
    CompanydetailsComponent,
    SortGridPipeService,
    UserComponent,
    LoginComponent,

  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    MatButtonModule,
    HttpClientModule,
    BrowserAnimationsModule,
    ReactiveFormsModule,
MatFormFieldModule,MatToolbarModule,MatSidenavModule,
MatIconModule,MatListModule,MatTableModule,
MatExpansionModule,MatInputModule,MatCardModule,
MatSelectModule,MatDialogModule,RouterModule,MatSliderModule
  ],
  providers: [
    
    CompanyComponent,
    {
      provide: HTTP_INTERCEPTORS,
      useClass:AuthHttpInterceptorService,
      multi:true
    }
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
