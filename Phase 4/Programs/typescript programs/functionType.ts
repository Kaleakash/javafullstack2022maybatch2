function add(a,b){
    console.log(a+" "+b);
}
add(10,20);
add("A","B");
//add(1);
//add();
function empInfo(id:number,name:string,result:boolean){
    console.log("id "+id+" name "+name+" result "+result);
}
empInfo(1,"Ravi",true);
//empInfo("1",1000,"Abc");
function sayHello(name:string ): string {
    return "Welcome "+name;
}
function getNumber() :number {
    return 100;
}
function info(): void {
    console.log("hello");
    //return 100;   
}
function abc() : any {
    //return 100;
    return false;
}
//optional parameter  
// optional parameter declaration right to left 
// function stdInfo(sid?:number,sname?:string,sage?:number):void {
//     console.log("sid "+sid+" sname "+sname+" age "+sage);
// }

// default intialization 
function stdInfo(sid:number=123,sname:string="Unkonwn",sage:number=18):void {
    console.log("sid "+sid+" sname "+sname+" age "+sage);
}
stdInfo(1,"Ravi",21);
stdInfo(2,"Raju");
stdInfo(3)
stdInfo();







