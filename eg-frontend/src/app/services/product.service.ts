import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Product } from '../common/product';
import { Observable, of } from 'rxjs';
import {map} from 'rxjs/operators';


@Injectable({
  providedIn: 'root'
})
export class ProductService {

  // Springboot rest api
  private baseUrl = 'http://localhost:8080/api/products';

  constructor(private httpClient: HttpClient) { // inject HttpClient


  }
  getProductList(): Observable<Product[]>{
    // Map JSON data from Spring Data Rest to product array
    return this.httpClient.get<GetResponse>(this.baseUrl).pipe(
      map(r=> r._embedded.products)
    )
  }
}

interface GetResponse { //unwrap the JSON from spring DataRest
  _embedded:{
    products: Product[];
  }
}
