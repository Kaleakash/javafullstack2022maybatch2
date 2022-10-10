import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Login } from './login';

@Injectable({
  providedIn: 'root'
})
export class LoginService {

  constructor(public http:HttpClient) { } //DI for HttpClient 

  // by default all httpClient method return type json consider 
  // by if we return string value then we have use responsetype
  signIn(login:any):Observable<string>{
    return this.http.post("http://localhost:8080/login/signIn",login,{responseType:'text'});
  }

  signUp(login:any):Observable<string>{
    return this.http.post("http://localhost:8080/login/signUp",login,{responseType:'text'});
  }


}
