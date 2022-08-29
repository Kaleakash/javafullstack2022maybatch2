import { Component, OnInit } from '@angular/core';
import { Product } from '../product';
import { ProductService } from '../product.service';

@Component({
  selector: 'app-product',
  templateUrl: './product.component.html',
  styleUrls: ['./product.component.css']
})
export class ProductComponent implements OnInit {

  products:Array<Product>=[];
  constructor(public ps:ProductService) { } // DI for ProductService 

  // it is life cycle method will call only once 
  ngOnInit(): void {
     this.ps.loadJsonData().subscribe((data:any)=>this.products=data.products,error=>console.log(error),()=>console.log("completed"))

     //this.ps.loadJsonData().subscribe({next:(data:Product)=>this.products=data,(error:error:any)=>console.log(error),()=>console.log("completed")})
  }

}
