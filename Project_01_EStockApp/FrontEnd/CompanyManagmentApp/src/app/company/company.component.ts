import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Company } from './company';
import { CompanyService } from './company.service';

@Component({
  selector: 'app-company',
  templateUrl: './company.component.html',
  styleUrls: ['./company.component.css']
})
export class CompanyComponent implements OnInit {
  route: any;
  
 


  constructor(private companyService: CompanyService, private http: HttpClient, private _router: Router) { }

  ngOnInit(): void {
    window.location.reload;
  }

  companyObj: Company = new Company();
  companyarr: Array<Company> = [];

  data: {} | any;

  editedCompany: any = {};

  showById:boolean=false;
  show:boolean=true;
  code:number|any;
  name:string|any;
  ceo:string|any;
  tover:number|any;
  website:string|any;
  stexchange:string|any;
  sprice:number|any;
  cid:number|any;

  addCompanyDetails() {
    this.companyService.addCompany(this.companyObj).subscribe(data => {
      this.data = JSON.stringify(data);
      this.companyarr.push(this.data);
      window.location.reload();
      console.log(this.companyarr);
    },
      error => {
        console.log(error);
      })
  }

  getCompanyList() {
    this.companyService.getAllCompanies().subscribe(data => {
      this.data = JSON.stringify(data);
      console.log(data);
      this.companyarr = Object.values(data);
      console.log(this.companyarr);
      window.location.reload;
    },
      error => {
        console.log(error);
      })
  }

  deleteCompany(cCode: number) {
    this.companyService.deleteCompany(cCode).subscribe(data => {
      let companyIndex = this.companyarr.findIndex(c => c.companyCode == cCode);
      this.companyarr.splice(companyIndex, 1);
      alert("company record deleted!");
      window.location.reload();
      this.getCompanyList();
    },
      error => {
        console.log(error);
      })
  }

  companym: Company = new Company();
  companyData: Array<Company> = [];
  response: any;
  getCompanyById(companyCode: number) {
    this.companyService.getCompanyBycode(companyCode).subscribe(data => {
    
      this.companyData = Object.values(data);
      
       this.code=this.companyData[0];
       this.name=this.companyData[1];
       this.ceo=this.companyData[2];
       this.tover=this.companyData[3];
       this.website=this.companyData[4];
       this.stexchange=this.companyData[5];
       this.sprice=this.companyData[6];
       this.showById=true;
       this.show=false;
    })
  }
 
  updateCompany(companyObj: Company) {
    this.editedCompany = companyObj;
    console.log(this.editedCompany);
    this.companyService.getCompanyBycode(companyObj.companyCode).subscribe(
      (data) => {
        data.companyName = companyObj.companyName;
        data.ceoName = companyObj.ceoName;
        data.website = companyObj.website;
        data.stockExchange = companyObj.stockExchange;
        data.turnover = companyObj.turnover;
        this.companyService.updateCompany(companyObj).subscribe(
          (data) => {
            this.getCompanyList();
           
          },
          (error) => {
            console.log(error);
          })
      })

  }

      navigateToLogout() {
        localStorage.removeItem('token');
        this._router.navigate(['']);
      }

  }

 



