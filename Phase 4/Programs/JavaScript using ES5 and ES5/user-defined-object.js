// literal style 
let emp1 = {id:100,name:"ravi kumar",age:21};
document.write("<br/> Object creation in literal style <br/>")
document.write("<br/> Id is "+emp1.id);
document.write("<br/> Name is "+emp1.name);
document.write("<br/> Age is "+emp1.age);
// function style object creation ES5 style 
function Employee() {
    this.id = 101;
    this.name = "Ramesh";
    this.age = 34;              // instance variable 
    this.displayInfo= function() {      // behaviour or functions 
        document.write("<br/> display info function<br/>")
        document.write("<br> id is "+this.id);
        document.write("<br> name is "+this.name);
        document.write("<br> age is "+this.age);
    }
}
//Employee();
var emp2 = new Employee();
emp2.displayInfo();
// class style object creation ES6 style 
class Customer {
    cid = 102;
    cname="Lokesh";
    cage = 36;
    displayCustInfo() {
        document.write("<br/><br/>Customer details");
        document.write("<br/> Customer Id is "+this.cid);
        document.write("<br/> Customer Name is "+this.cname);
        document.write("<br/> Customer Age is "+this.cage);
    }
}
let cust1 = new Customer();
cust1.displayCustInfo();