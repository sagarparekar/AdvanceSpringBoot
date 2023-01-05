import { Injectable } from '@angular/core';
import { map, Observable } from 'rxjs';
import { Login } from './login';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { User } from '../user/user';


const httpOptions = {
  headers: new HttpHeaders({ 'Content-Type': 'application/json' })
};
@Injectable({
  providedIn: 'root'
})
export class LoginService {

  constructor(private http:HttpClient) { }

//  private apiPostLogin:string='https://ynssvrfb44.execute-api.us-west-2.amazonaws.com/Stage1/consume-login';
  private apiPostLogin:string='http://localhost:8081/login';
  addLogin(login:Login):Observable<any>
  {
    
    return this.http.post<any>(`${this.apiPostLogin}`,login).pipe(
          map(
            userData=>{
              localStorage.setItem('username',login.username);
              let tokenStr='Bearer '+userData.token;
              localStorage.setItem('token',tokenStr);
              return userData;
            }
          )
    )
  }

  

 


}
