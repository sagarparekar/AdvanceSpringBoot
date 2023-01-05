import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { User } from './user';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  constructor(private http:HttpClient) { }

  private apiPostUser:string=`http://localhost:8082/register`;
 // private apiPostUser:string=`https://ynssvrfb44.execute-api.us-west-2.amazonaws.com/Stage1/consume-register`;
  

  addUser(user:User):Observable<User>
  {
   // alert("User Added");
    return this.http.post<User>(this.apiPostUser,user);
  }

}
