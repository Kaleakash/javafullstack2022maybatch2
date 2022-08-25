// user-defined object in ES6 class style 
// class Employee {
//         id:number=100;
//         name:string ="Ravi";
//         age:number=21;
//         display(): void {
//             console.log("id is "+this.id);
//             console.log("name is "+this.name);
//             console.log("age is "+this.age);
//         }
// }

// let emp1 = new Employee();
// emp1.display();
// let emp2 = new Employee();
// emp2.display();
// object creation with constructor 
// class Employee {
//     id:number;
//     name:string;
//     age:number;
//     constructor(id:number,name:string,age:number){
//         this.id = id;
//         this.name = name;
//         this.age = age;
//     }
//     display(): void {
//         console.log("id is "+this.id);
//         console.log("name is "+this.name);
//         console.log("age is "+this.age);
//     }
// }
// let emp1 = new Employee(1,"Ravi",21);
// emp1.display();
// let emp2 = new Employee(2,"Ramesh",32);
// emp2.display();

// // short cut constructor intialization 
// class Employee {
//     //id:number;              // instance variable 
//     //name:string;
//     //age:number;
//     constructor(private id:number,public name:string,private age:number){
//         //this.id = id;                               // assign the value 
//         //this.name = name;
//        // this.age = age;
//     }
//     display(): void {
//         console.log("id is "+this.id);
//         console.log("name is "+this.name);
//         console.log("age is "+this.age);
//     }
// }
// let emp1 = new Employee(1,"Ravi",21);
// emp1.display();
// let emp2 = new Employee(2,"Ramesh",32);
// emp2.display();


// short cut constructor intialization 
class Employee {
    constructor(private id:number,public name:string,private age:number){
    }
    display(): void {
        console.log("id is "+this.id);
        console.log("name is "+this.name);
        console.log("age is "+this.age);
    }
}
let emp1 = new Employee(1,"Ravi",21);
emp1.display();
let emp2 = new Employee(2,"Ramesh",32);
emp2.display();

