import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { FormControl, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { User } from './user';
import { UserService } from './user.service';

@Component({
  selector: 'app-user',
  templateUrl: './user.component.html',
  styleUrls: ['./user.component.css']
})
export class UserComponent implements OnInit {

  

  constructor(private http: HttpClient, private userService:UserService, private route:Router) { }

  ngOnInit(): void {
  }



  userObj:User=new User();
  userarr: Array<User> = [];
  data: {} | any;

  addUser() {
    this.userService.addUser(this.userObj).subscribe(data => {
     // this.data = JSON.stringify(data);
     alert("registration completed");
     this.userarr.push(this.data);
     
      console.log(this.userarr);
      this.route.navigate(['']);
    },
      error => {
        console.log(error);
      })
  }

}
