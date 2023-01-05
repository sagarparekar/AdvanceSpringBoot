import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Company } from '../company/company';
import { Stock } from './stock';

@Injectable({
  providedIn: 'root'
})
export class StockService {

  constructor(private http:HttpClient) { }

  stockList: Stock[]|any;

  // private apiGetStock:string=`https://ynssvrfb44.execute-api.us-west-2.amazonaws.com/deploy2/jwtcompany`;
  // private apiPostStock:string=` https://ynssvrfb44.execute-api.us-west-2.amazonaws.com/Stage1`;

  private apiGetStock:string=`http://localhost:8081/api/stock/getAllStocks`;
  private apiPostStock:string=`http://localhost:8081/api/stock/addStock`;



  

  addStock(companyCode:number, stock:Stock):Observable<Stock>
  {
    
    return this.http.post<Stock>(`${this.apiPostStock}/${companyCode}`,stock);
  }

  getAllStocks(companyCode:number):Observable<Array<Stock>>
  {
    
    return this.http.get<Array<Stock>>(`${this.apiGetStock}`);
  }


}
