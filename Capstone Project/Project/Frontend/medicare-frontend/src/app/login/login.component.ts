import { Component, OnInit } from '@angular/core';
import { LoginService } from '../login.service';
import {FormGroup,FormControl} from '@angular/forms';
import { Router } from '@angular/router';
@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  loginRef = new FormGroup({
    emailid:new FormControl(),
    password:new FormControl(),
    typeOfUser:new FormControl()
  })
  errorMsg:string=""
  constructor(public ls:LoginService,public router:Router) { }

  ngOnInit(): void {
  }

  signIn(){
      let login = this.loginRef.value;
      console.log(login);
      this.ls.signIn(login).subscribe({
        next:(result:any)=> {
            //console.log(result);
            if(result=="Admin login successfully"){
              sessionStorage.setItem("userInfo",login.emailid);
              this.router.navigate(["adminhome"]);
            }else if(result=="User login successfully"){
              sessionStorage.setItem("userInfo",login.emailid);
              this.router.navigate(["userhome"]);
            }else {
                this.errorMsg=result;
            }
        },
        error:(error:any)=>console.log(error),

        complete:()=>console.log("done")
        
      });

  }
  
}
