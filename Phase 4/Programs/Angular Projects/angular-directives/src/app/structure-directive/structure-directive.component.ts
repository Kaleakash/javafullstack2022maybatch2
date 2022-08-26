import { Component, OnInit } from '@angular/core';
import { Employee } from '../employee';
@Component({
  selector: 'app-structure-directive',
  templateUrl: './structure-directive.component.html',
  styleUrls: ['./structure-directive.component.css']
})
export class StructureDirectiveComponent implements OnInit {
  f1:boolean = true;
  f2:boolean  = false;
  f3:boolean = false;
  msg:string ="show"
  f4:boolean = false;
  names:Array<string>=["Ravi","ajay","Vijay","Lokesh","Rajesh"];
  employees:Array<Employee>=[];   // created employee array object. 
  constructor() { }

  // it is life cycle method it will call only once 
  ngOnInit(): void {
    let emp1 = new Employee(100,"Ravi",21);
    let emp2 = new Employee(101,"Ajay",26);
    let emp3 = new Employee(102,"Vijay",28);
    this.employees.push(emp1);
    this.employees.push(emp2);
    this.employees.push(emp3);
  }

  info(): void {
    this.f3=true;
  }
  toggle() : void {
    if(this.f4){
        this.f4=false;
        this.msg="show"
    }else {
        this.msg="hide";
        this.f4=true;
    }
  }

  addEmployee(idRef:any,nameRef:any,ageRef:any): void {
    let id = idRef.value;
    let name = nameRef.value;
    let age= ageRef.value;
    let emp = new Employee(id,name,age);
    this.employees.push(emp);
  }

  
}
