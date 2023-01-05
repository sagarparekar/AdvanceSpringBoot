import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';

import { Login } from './login';
import { LoginService } from './login.service';
import {FormControl, Validators} from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  check: string |any;
  email: any;
  isLoggedIn = false;
  isLoginFailed = false;
  errorMessage = '';

  constructor(private http:HttpClient,private loginService:LoginService, private router:Router) { }

  ngOnInit(): void {
  }
  loginObj:Login=new Login();
  loginarr: Array<Login> = [];
  data: {} | any;
  

  addLogin() {
    this.loginService.addLogin(this.loginObj).subscribe((response:any)=> {         
     console.log(response);
     alert("User Logged In Successfully");   
    this.router.navigate(['/home']);
    },
      error => {
        alert("Please enter valid credentials");
        console.log("Please enter valid credentials "+error);
      })
  }
  


}
