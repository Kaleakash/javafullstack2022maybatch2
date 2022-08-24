// Normal function 
function display1() {
    document.write("<br/> Display1 function")
}
display1();
// Expression style function 
let display2 = function() {
    document.write("<br/> Expression style function")
}
display2();
// arrow style function 
let display3 = ()=>document.write("<br/> Arrow style function");
display3();
// expression style function with parameter 
let addNumber1= function(a,b){
    var sum  = a+b;
    return sum;
}
document.write("<br/>sum of two number using expression style "+addNumber1(10,20));
// arrow style function with parameter arrow style function by default return value without return keyword. 
let addNumber2= (a,b)=>a+b;
document.write("<br/> Sum of two number using arrow style "+addNumber2(100,200));
// arrow function with multi line statement 

let findLargest = (a,b)=> {
    if(a>b){
        return "a is largest"
    }else {
        return "b is largest"
    }
}
document.write("<br/> Find largest "+findLargest(10,5));

function greeting(fname,callback){
    return "Welcome "+callback(fname);
}

let maleInfo = function(fname){
    return "Mr "+fname;
}
let femaleInfo = (fname)=>"Miss "+fname;

document.write("<br/>"+greeting("Raj",maleInfo));
document.write("<br/>"+greeting("Seeta",femaleInfo));
document.write("<br/>"+greeting("Ravi",function(fname){
    return "Mr "+fname;
}));
document.write("<br/>"+greeting("Veeta",(fname)=>"Miss "+fname));







