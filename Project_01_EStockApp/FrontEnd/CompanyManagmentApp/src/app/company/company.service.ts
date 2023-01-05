import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Company } from './company';

@Injectable({
  providedIn: 'root'
})
export class CompanyService {

  constructor(private http:HttpClient) { }

  companys:Company[]|any;


  // private apiGet:string=`https://ynssvrfb44.execute-api.us-west-2.amazonaws.com/Stage1/company-getallcompany`;
  // private apiPost:string=`https://ynssvrfb44.execute-api.us-west-2.amazonaws.com/Stage1/company-addcompany`;
  // private apidelete:string=`https://ynssvrfb44.execute-api.us-west-2.amazonaws.com/Stage1`;
  // private apiUpdate:string=`https://ynssvrfb44.execute-api.us-west-2.amazonaws.com/Stage1/updatecompany`;
  // private apiGetById:string=`https://ynssvrfb44.execute-api.us-west-2.amazonaws.com/Stage1`;

  private apiGet:string=`http://localhost:8081/api/v1/getAllCompanies`;
  private apiPost:string=`http://localhost:8081/api/v1/addCompany`;
  private apidelete:string=`http://localhost:8081/api/v1/deleteCompany`;
  private apiUpdate:string=`http://localhost:8081/api/v1/updateCompanyDetails`;
  private apiGetById:string=`http://localhost:8081/api/v1/getCompanyByCode`;

  addCompany(companyObj:Company):Observable<Company>
  {
                
                                   
    return this.http.post<Company>(this.apiPost,companyObj);
  }

  getAllCompanies():Observable<Array<Company>>
  {
   
       return this.http.get<Array<Company>>(this.apiGet);
  }

  deleteCompany(companyCode:number):Observable<Company>
  {
    
    alert('Deleted');
    return this.http.delete<Company>(`${this.apidelete}/${companyCode}`);
  }

  getCompanyBycode(companyCode:number):Observable<Company>
  {
   
    return this.http.get<Company>(`${this.apiGetById}/${companyCode}`);
  }

  updateCompany(companyObj:Company):Observable<Company>
  {
    
    return this.http.put<Company>(this.apiUpdate, companyObj);
  }

}
