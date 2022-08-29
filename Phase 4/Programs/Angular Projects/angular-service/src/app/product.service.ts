import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import { Observable } from 'rxjs';
import { Product } from './product';
@Injectable({
  providedIn: 'root'  // it is equal to provider attribute in app.module.ts file 
})
export class ProductService {

  constructor(public http:HttpClient) { }     // DI for HttpClient 
 
  // converting all json data to product model class and return Observable. 

  loadJsonData() :Observable<Product[]> {
    return this.http.get<Product[]>("/assets/products.json");
  }

}
