import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup } from '@angular/forms';
import { MyCustomService } from '../custom.service';
import { LoginService } from '../login.service';
@Component({
  selector: 'app-mdf-login-page',
  templateUrl: './mdf-login-page.component.html',
  styleUrls: ['./mdf-login-page.component.css']
})
export class MdfLoginPageComponent implements OnInit {
  loginRef = new FormGroup({
    emailid:new FormControl(),
    password:new FormControl()
  });
  msg:string="";
  constructor(public ls:LoginService) { } // DI for LoginService
  ngOnInit(): void {
  }
  checkUser() {
    let login = this.loginRef.value;
    //console.log(login);
    // if(login.emailid=="raj@gmail.com" && login.password=="123"){
    //     this.msg = "Successfully login";
    // }else {
    //     this.msg = "Failure try once again";
    // }
  
    // let cs = new MyCustomService();
    // this.msg  = cs.checkLoginDetails(login);
  
    this.msg = this.ls.checkUser(login);
    this.loginRef.reset();
  }
}
