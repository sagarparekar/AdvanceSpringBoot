import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { CompanyService } from '../company/company.service';
import { Stock } from './stock';
import { StockService } from './stock.service';

@Component({
  selector: 'app-stock',
  templateUrl: './stock.component.html',
  styleUrls: ['./stock.component.css']
})
export class StockComponent implements OnInit {
  AvgStockPrice: number |any;
  maxStockPrice: number | any;
  minStockPrice: number | any;
  companyDetails: any;
  stockObj: Stock=new Stock();
  stockList:Array<Stock>=[];
  data:{}|any;
 
  constructor(private http:HttpClient, public stockService:StockService, private route:ActivatedRoute, private companyService:CompanyService) { }

  ngOnInit(): void {

    this.stockObj.company_code_FK=this.route.snapshot.paramMap.get('id');
    
  }

  addStock(companyCode:number){
    this.stockService.addStock(companyCode,this.stockObj).subscribe(data=>
      {
        this.data=JSON.stringify(data);
        this.stockList.push(this.data);
        alert("Stock data added to Stock and Company Table");
        window.location.reload;
      })
  }

  getAllStocks(companyCode:number){
    this.stockService.getAllStocks(companyCode).subscribe(data=>
      {
        this.data=JSON.stringify(data);
        this.stockList=Object.values(data);
        console.log(this.stockList);
      },
      error=>{
        console.log(error);
      })
  }



}
