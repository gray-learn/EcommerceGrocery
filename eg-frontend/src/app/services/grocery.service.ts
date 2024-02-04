import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Grocery } from '../common/grocery';
import { Observable, of } from 'rxjs';
import {map} from 'rxjs/operators';


@Injectable({
  providedIn: 'root'
})
export class GroceryService {

  // Springboot rest api @OneToMany ###
  private baseUrl = 'http://localhost:8080/api/groceries';

  constructor(private httpClient: HttpClient) { // inject HttpClient
  }
  getGroceryList(): Observable<Grocery[]>{
    // Map JSON data from Spring Data Rest to grocery array
    return this.httpClient.get<GetResponse>(this.baseUrl).pipe(
      map(r=> r._embedded.groceries)
    )
  }
}

interface GetResponse { //unwrap the JSON from spring DataRest
  _embedded:{
    groceries: Grocery[];
  }
}
