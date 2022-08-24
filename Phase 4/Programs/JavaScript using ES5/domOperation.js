function addElements(){
    //alert("Event generated");
    var name = document.getElementById("uname").value;
    var age = document.getElementById("age").value
    var myPTag = document.createElement("p");       // create p tag 
    var myPTagContent = document.createTextNode("Name "+name+" Age "+age);   // create content for p tag 
 
    myPTag.appendChild(myPTagContent);      // add contents inside a p tag 

    if(age>25 && age <50){
        myPTag.setAttribute("class","firstClass");
    }else if(age>50 && age <75){
        myPTag.setAttribute("class","secondClass");
    }else {
        myPTag.setAttribute("class","thirdClass");
    }

    document.getElementById("result").appendChild(myPTag);  // add p tag inside a div tag
    document.getElementById("uname").value=""
    document.getElementById("age").value=""
}