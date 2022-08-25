import { Component } from '@angular/core';

@Component({
  selector: 'app-root',   // <app-root></app-root>
  templateUrl: './app.component.html',      // connected html page 
  styleUrls: ['./app.component.css']      // connected css page 
})
export class AppComponent {
 // title = 'welcome-app';
 
 id:number = 100;
 name:string ="Raj Deep";
 age : number = 21;

}
