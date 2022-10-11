import { Component, OnInit } from '@angular/core';
import {FormGroup,FormControl} from '@angular/forms';
import { LoginService } from '../login.service';
@Component({
  selector: 'app-signup',
  templateUrl: './signup.component.html',
  styleUrls: ['./signup.component.css']
})
export class SignupComponent implements OnInit {

  loginRef = new FormGroup({
    emailid:new FormControl(),
    password:new FormControl(),
    typeOfUser:new FormControl()
  })
  errorMsg:string=""
  constructor(public ls:LoginService) { }

  ngOnInit(): void {
  }

  signUp() {
    let login= this.loginRef.value;
      this.ls.signUp(login).subscribe({
        next:(result:any)=> this.errorMsg=result,
        error:(error:any)=>this.errorMsg=error,
        complete:()=>console.log("completed")
      })
  }
}
