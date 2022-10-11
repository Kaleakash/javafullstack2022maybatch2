import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-admindashboard',
  templateUrl: './admindashboard.component.html',
  styleUrls: ['./admindashboard.component.css']
})
export class AdmindashboardComponent implements OnInit {
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
