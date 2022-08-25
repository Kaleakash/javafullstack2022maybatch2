function add(a, b) {
    console.log(a + " " + b);
}
add(10, 20);
add("A", "B");
//add(1);
//add();
function empInfo(id, name, result) {
    console.log("id " + id + " name " + name + " result " + result);
}
empInfo(1, "Ravi", true);
//empInfo("1",1000,"Abc");
function sayHello(name) {
    return "Welcome " + name;
}
function getNumber() {
    return 100;
}
function info() {
    console.log("hello");
    //return 100;   
}
function abc() {
    //return 100;
    return false;
}
//optional parameter  
// optional parameter declaration right to left 
// function stdInfo(sid?:number,sname?:string,sage?:number):void {
//     console.log("sid "+sid+" sname "+sname+" age "+sage);
// }
// default intialization 
function stdInfo(sid, sname, sage) {
    if (sid === void 0) { sid = 123; }
    if (sname === void 0) { sname = "Unkonwn"; }
    if (sage === void 0) { sage = 18; }
    console.log("sid " + sid + " sname " + sname + " age " + sage);
}
stdInfo(1, "Ravi", 21);
stdInfo(2, "Raju");
stdInfo(3);
stdInfo();
