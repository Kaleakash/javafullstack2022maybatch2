import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup } from '@angular/forms';
import { MedicineService } from '../medicine.service';
@Component({
  selector: 'app-medicine-add',
  templateUrl: './medicine-add.component.html',
  styleUrls: ['./medicine-add.component.css']
})
export class MedicineAddComponent implements OnInit {
  medicineRef = new FormGroup({
    mname:new FormControl(),
    price:new FormControl(),
    quantity:new FormControl(),
    url:new FormControl()
  });
  msg:string ="";
  constructor(public ms:MedicineService) { }
  ngOnInit(): void {
  }

  storeMedicineDetails() {
    let medicine = this.medicineRef.value;
    this.ms.storeMedicineDetails(medicine).subscribe({
      next:(result:any)=>this.msg=result,
      error:(error:any)=>console.log(error),
      complete:()=>console.log("completed")
    })
    this.medicineRef.reset();
  }

  
}
