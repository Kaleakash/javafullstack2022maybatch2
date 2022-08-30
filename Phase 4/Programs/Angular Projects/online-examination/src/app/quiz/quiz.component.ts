import { Component, OnInit } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import { Questions } from '../questions';
import { Answers } from '../answers';
@Component({
  selector: 'app-quiz',
  templateUrl: './quiz.component.html',
  styleUrls: ['./quiz.component.css']
})
export class QuizComponent implements OnInit {
  questions:Array<Questions>=[]
  answers:Array<Answers>=[];
  quizAns=new Map();          // it allow store in the key-value pairs key is unique and value may be duplicate.
  f1:boolean = true;
  f2:boolean = false; 
  f3:boolean = false;
  f4:boolean = false;
  count:number =0;
  constructor(public http:HttpClient) { }
  ngOnInit(): void {
      this.startExam();
  }
  startExam() {
    this.http.get("/assets/questions.json").subscribe((data:any)=>this.questions=data.questions);
    this.http.get("/assets/answers.json").subscribe((data:any)=>this.answers=data.answers);
  }
  yourAns(qid:any,ans:any){
    //console.log("event generated...");
    //console.log(qid+" "+ans);
    //this.quizAns.size;
    this.quizAns.set(qid,ans);
    console.log(this.quizAns);
  }
  submitExam(){
    this.f2=true;
    this.f1 = false;
  }
  yourReview(){
      this.f3=true;
  }
  yourResult() {
    for(let i=0;i<this.questions.length;i++){
        console.log(this.answers[i].correctAns+" "+this.quizAns.get(i+1))
        if(this.answers[i].correctAns==this.quizAns.get(i+1)){
            this.count++;
        }
    }
    this.f4=true;
    this.f3=false;
  }
}
