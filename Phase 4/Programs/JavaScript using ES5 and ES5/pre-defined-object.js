let obj1 = "Welcome to JavaScript";     // literal style object creation 
let obj2 = new String("Welcome to JavaScript"); // using new keyword. 
document.write("<br/>"+obj1);
document.write("<br/>"+obj2);
document.write("<br/>"+obj1.toLowerCase());
document.write("<br/>"+obj1.toUpperCase());
document.write("<br/>"+obj1.indexOf('e'));
document.write("<br/>"+obj1.substring(2));
document.write("<br/>"+obj1.substring(2,6));
let dd = new Date();
document.write("<br/>"+dd);
document.write("<br/>Date "+dd.getDate())
document.write("<br/> Month "+dd.getMonth())
document.write("<br/>Year "+dd.getFullYear())
document.write("<br/>Time "+dd.getTime())
document.write("<br/> Hour"+dd.getHours())
document.write("<br/> Second"+dd.getMinutes())
let num1 = [];      // literal style memory creation 
let num2 = new Array(); // using new keyword 
document.write("<br/> "+num1.length);
document.write("<br/> "+num2.length);
num1.push(100);
num1.push(200);
num1.push(300);         // add the element at last 
num1.unshift(1);
num1.unshift(2);
num1.unshift(3);            // add the element at the begining 
document.write('<br/> '+num1);
num1.pop();     // remove from a last 
num1.shift();      // remove from the begining 
document.write('<br/> '+num1);
//num1.splice(2,1);       // 1st parameter index position, 2nd of element to delete 
//num1.splice(2,1,1000);      // 2nd index position element replace by 1000
num1.splice(2,0,1000);      // 1000 element add in 2nd index position 
document.write('<br/> '+num1);

