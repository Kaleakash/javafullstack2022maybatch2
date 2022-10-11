import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
@Component({
  selector: 'app-userdashboard',
  templateUrl: './userdashboard.component.html',
  styleUrls: ['./userdashboard.component.css']
})
export class UserdashboardComponent implements OnInit {

  userName:string="";
  constructor(public router:Router) { }

  ngOnInit(): void {
    
    let obj = sessionStorage.getItem("userInfo");
    
    if(obj!=null){
      this.userName=obj;
    }

  }

  logout() {
    sessionStorage.removeItem("userInfo");
    this.router.navigate(["/login"]);
  }

}
