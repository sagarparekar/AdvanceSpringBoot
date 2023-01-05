import { HttpEvent, HttpHandler, HttpInterceptor, HttpRequest } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class AuthHttpInterceptorService implements HttpInterceptor {

  constructor() { }

  intercept(req: HttpRequest<any>, next: HttpHandler): Observable<HttpEvent<any>> {
    let tokenstr = localStorage.getItem('token');

    if(localStorage.getItem('token')){
      req =req.clone({
        headers: req.headers.set('Authorization', ''+tokenstr)
      });
    }
    return next.handle(req);
  }


}
