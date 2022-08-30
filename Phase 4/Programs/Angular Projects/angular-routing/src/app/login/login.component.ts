import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup } from '@angular/forms';
import { Router } from '@angular/router';
@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  loginRef = new FormGroup({
    emailid:new FormControl(),
    password:new FormControl()
  });
  msg:string ="";
  constructor(public router:Router) { }  // DI for Router API

  ngOnInit(): void {
  }

  checkUserDetails(){
    let login = this.loginRef.value;
    console.log(login);
    if(login.emailid=="raj@gmail.com" && login.password=="123"){
        sessionStorage.setItem("user",login.emailid);         // hs.setAttribute("user",login.emailid); 
        this.router.navigate(["home"],{skipLocationChange:true});   
    }else {
        this.msg="emailid or password is wrong";
    }

    this.loginRef.reset();
  }

}
