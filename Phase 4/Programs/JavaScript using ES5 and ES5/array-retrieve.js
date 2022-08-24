let num1 = [10,20,30,40,50];
document.write("<br/> Retrieve the element from array using for loop<br/>")
for(let i=2;i<num1.length;i++){
    document.write("<br/> "+num1[i]);
}
document.write("<br/> Retrieve the element from array using of loop<br/>")
for(let n of num1){
    document.write("<br/> "+n);
}
document.write("<br/> Retrieve the element from array using in loop<br/>")
for(let i in num1){
    document.write("<br/> "+i+" "+num1[i]);
}
document.write("<br/> Retrieve the element using callback <br/>")
num1.forEach(v=>document.write("<br/>"+v));