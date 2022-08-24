var a=10;
a=20;           // re-initialization 
var a=30;       // no error , re-declaration 
let b=10;
b=20;
//let b=30;           //Error we can't do re-declaration 
for(var i=0;i<10000;i++){

}
document.write("i "+i);     // we can access 
for(let j=0;j<10000;j++){

}
//document.write("j "+j);     // we can't access 
var m=100;
m=200;
let n=300;
n=400;
const o=500;
//o=600;        cant change the value 