import { Component, OnInit } from '@angular/core';

import { CompanyService } from '../company/company.service';
import { Router, ActivatedRoute, ParamMap } from '@angular/router';
import { StockService } from '../stock/stock.service';
import { Stock } from '../stock/stock';
import { Injectable, Pipe, PipeTransform } from '@angular/core';


@Component({
  selector: 'app-companydetails',
  templateUrl: './companydetails.component.html',
  styleUrls: ['./companydetails.component.css']
})


export class CompanydetailsComponent implements OnInit {
  stockdetails: any;
  min: any;
  max: any;
  avg: any;

  constructor(private companyService: CompanyService, private route: ActivatedRoute, private stockService: StockService) { }

  

  filterStock:Array<Stock>=[];
  show:boolean=true;
  showByFilter:boolean=false;

  AvgStockPrice: number | any;
  maxStockPrice: number | any;
  minStockPrice: number | any;
  stockList: Array<Stock> = [];
  companyDetails: any;
  idd: number | any;
  stockObj: Stock = new Stock();
  updatedstockList: Array<Stock> = [];
  
  data: {} | any;
  ngOnInit(): void {

    this.route.params.subscribe(params => {
      let id = params['id'];
      this.companyDetails = this.companyService.getCompanyBycode(id).subscribe(
        data => {
          this.companyDetails = data;
          console.log("data is", this.companyDetails);
          this.getAvgStockPrice();
        }
      );
    })
  }

  getAvgStockPrice():void {
    let total = 0;
    let max = 0, min = this.companyDetails.stockList[0].stockPrice;
    for (let index = 0; index < this.companyDetails.stockList.length; index++) {
      const stockObj = this.companyDetails.stockList[index];

      if (stockObj.stockPrice > max) {
        max = stockObj.stockPrice;
        console.log("max"+max);
      }
      if (stockObj.stockPrice < min) {
        min = stockObj.stockPrice;
        console.log("min"+min);
      }
      total = total + stockObj.stockPrice;
      console.log("total"+total);
    }
    this.AvgStockPrice = total / this.companyDetails.stockList.length;
    this.maxStockPrice = max;
    this.minStockPrice = min;
    console.log("Avg stock"+this.AvgStockPrice);
  } 
 
     stockFilter(filterterm: string){
    filterterm=filterterm.substring(0,10);
    let count=0;
    let len=this.companyDetails.stockList.length;
    this.companyDetails.stockList.filter(()=>{
      for(let d of this.companyDetails.stockList){
        let time=d.timeStamp.substring(0,10);
        count=count +1;
        if(time===filterterm && count<=len){
          this.filterStock.push(d);
        }
      }
      this.show=false;
      this.showByFilter=true;
      this.getstockpricebyfilter();
    })

  }

  
  getstockpricebyfilter():void {
    let total = 0;
    let max = 0, min = this.filterStock[0].stockPrice;
    for (let index = 0; index < this.filterStock.length; index++) {
      const stockObj = this.filterStock[index];

      if (stockObj.stockPrice > max) {
        max = stockObj.stockPrice;
        console.log("max"+max);
      }
      if (stockObj.stockPrice < min) {
        min = stockObj.stockPrice;
        console.log("min"+min);
      }
      total = total + stockObj.stockPrice;
      console.log("total"+total);
    }
    this.AvgStockPrice = total / this.filterStock.length;
    this.maxStockPrice = max;
    this.minStockPrice = min;
    console.log("Avg stock"+this.AvgStockPrice);
  } 

}
