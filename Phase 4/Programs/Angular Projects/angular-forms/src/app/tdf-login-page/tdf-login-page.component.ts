import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { MyCustomService } from '../custom.service';
import { LoginService } from '../login.service';
@Component({
  selector: 'app-tdf-login-page',
  templateUrl: './tdf-login-page.component.html',
  styleUrls: ['./tdf-login-page.component.css']
})
export class TdfLoginPageComponent implements OnInit {
  msg:string="";
  constructor(public lg:LoginService) { }     // pull object from container using DI 

  ngOnInit(): void {
  }

  checkUser(loginRef:NgForm){
    let login = loginRef.value;
    
    //console.log(login);
    // if(login.emailid=="raj@gmail.com" && login.password=="123"){
    //     this.msg = "Successfully login"
    // }else {
    //     this.msg = "Faliute try once again";
    // }
    
    //let cs = new MyCustomService();
    //this.msg  = cs.checkLoginDetails(login);
    
    this.msg = this.lg.checkUser(login);
    loginRef.reset();
  }

}
