import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-string-interpolation',
  templateUrl: './string-interpolation.component.html',
  styleUrls: ['./string-interpolation.component.css']
})
export class StringInterpolationComponent implements OnInit {
  fname:string ="Ajay Kumar";
  constructor() { }

  ngOnInit(): void {
  }

  display() {
    return "Welcome to Angular Framework";
  }

  addNumber(a:number,b:number):number {
    let sum = a+b;
    return sum;
  }
}
