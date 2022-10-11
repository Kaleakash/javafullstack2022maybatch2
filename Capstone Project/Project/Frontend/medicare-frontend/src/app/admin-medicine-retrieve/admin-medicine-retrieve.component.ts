import { Component, OnInit } from '@angular/core';
import { Medicine } from '../medicine';
import { MedicineService } from '../medicine.service';

@Component({
  selector: 'app-admin-medicine-retrieve',
  templateUrl: './admin-medicine-retrieve.component.html',
  styleUrls: ['./admin-medicine-retrieve.component.css']
})
export class AdminMedicineRetrieveComponent implements OnInit {
  medicines:Array<Medicine>=[];
  flag:boolean = false;
  mid:number =0;
  price:number =0;
  quantity:number =0;
  constructor(public ms:MedicineService) { }

  ngOnInit(): void {
    this.loadAllMedicineDetails();
  }

  loadAllMedicineDetails(){
    this.ms.getAllMedicineDetails().subscribe({
      next:(result:any)=>this.medicines=result,
      error:(error:any)=>console.log(error),
      complete:()=>console.log("completed")
    })
  }
  
  deleteMedicine(mid:any){
    //console.log(mid);
    this.ms.deleteMedicineDetals(mid).subscribe({
      next:(result:any)=>console.log(result),
      error:(error:any)=>console.log(error),
      complete:()=>{
        this.loadAllMedicineDetails()
      }
    })
  }

  updateMedicine(mm:any){
    this.flag=true;
    this.mid = mm.mid;
    console.log(this.mid)
    this.price=mm.price;
    this.quantity=mm.quantity;
  }

  updateMedicineInfo(){
    let mm = {mid:this.mid,quantity:this.quantity,price:this.price};
    this.ms.updateMedicineDetails(mm).subscribe({
      next:(result:any)=>console.log(result),
      error:(error:any)=>console.log(error),
      complete:()=>{
        this.loadAllMedicineDetails()
        this.flag=false;
      }
    })
  }
}
