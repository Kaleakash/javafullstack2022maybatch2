import { Component, OnInit } from '@angular/core';
@Component({
  selector: 'app-event-binding',
  templateUrl: './event-binding.component.html',
  styleUrls: ['./event-binding.component.css']
})
export class EventBindingComponent implements OnInit {
  msg:string ="Hi";
  name:string ="";
  sum:number=0;

  constructor() { }

  ngOnInit(): void {
  }

  info(){
    //alert("Event fired...");
    this.msg = "Hello";
  }

  passValue(nameRef:any){
    this.name = nameRef.value;            //nameRef is a reference of text field using value we can get the value 
    alert(this.name);
    nameRef.value=""; 
  }
  add(n1Ref:any,n2Ref:any){
    this.sum = eval(n1Ref.value)+eval(n2Ref.value);
  }
  
}


