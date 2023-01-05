import { Stock } from "../stock/stock";

export class Company {

    companyCode:number|any;
    companyName:string|any;
    ceoName:string|any;
    website:string|any;
    stockExchange:string|any;
    turnover:number|any;
    currentStockPrice:number|any;
    stockList:Array<Stock>=[];
}
