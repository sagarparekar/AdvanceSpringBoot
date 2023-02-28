package com.schneider.invoiceapi.model;

import java.util.List;

public class Iteam {
    private String slNo;
    private String prdDesc;
    private String isServc;
    private String hsnCd;
    private String barcde;
    private double qty;
    private double freeQty;
    private String unit;
    private double unitPrice;
    private double totAmt;
    private int discount;
    private int preTaxVal;
    private double assAmt;
    private double gstRt;
    private double igstAmt;
    private int cgstAmt;
    private int sgstAmt;
    private int cesRt;
    private int cesNonAdvlAmt;
    private int stateCesRt;
    private double stateCesAmt;
    private int stateCesNonAdvlAmt;
    private int othChrg;
    private double totItemVal;
    private String ordLineRef;
    private String orgCntry;
    private String prdSlNo;

    private BchDtls bchDtls;

    private List<AttributeDetails> attribDtls;

    public String getSlNo() {
        return slNo;
    }

    public void setSlNo(String slNo) {
        this.slNo = slNo;
    }

    public String getPrdDesc() {
        return prdDesc;
    }

    public void setPrdDesc(String prdDesc) {
        this.prdDesc = prdDesc;
    }

    public String getIsServc() {
        return isServc;
    }

    public void setIsServc(String isServc) {
        this.isServc = isServc;
    }

    public String getHsnCd() {
        return hsnCd;
    }

    public void setHsnCd(String hsnCd) {
        this.hsnCd = hsnCd;
    }

    public String getBarcde() {
        return barcde;
    }

    public void setBarcde(String barcde) {
        this.barcde = barcde;
    }

    public double getQty() {
        return qty;
    }

    public void setQty(double qty) {
        this.qty = qty;
    }

    public double getFreeQty() {
        return freeQty;
    }

    public void setFreeQty(double freeQty) {
        this.freeQty = freeQty;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getTotAmt() {
        return totAmt;
    }

    public void setTotAmt(double totAmt) {
        this.totAmt = totAmt;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public int getPreTaxVal() {
        return preTaxVal;
    }

    public void setPreTaxVal(int preTaxVal) {
        this.preTaxVal = preTaxVal;
    }

    public double getAssAmt() {
        return assAmt;
    }

    public void setAssAmt(double assAmt) {
        this.assAmt = assAmt;
    }

    public double getGstRt() {
        return gstRt;
    }

    public void setGstRt(double gstRt) {
        this.gstRt = gstRt;
    }

    public double getIgstAmt() {
        return igstAmt;
    }

    public void setIgstAmt(double igstAmt) {
        this.igstAmt = igstAmt;
    }

    public int getCgstAmt() {
        return cgstAmt;
    }

    public void setCgstAmt(int cgstAmt) {
        this.cgstAmt = cgstAmt;
    }

    public int getSgstAmt() {
        return sgstAmt;
    }

    public void setSgstAmt(int sgstAmt) {
        this.sgstAmt = sgstAmt;
    }

    public int getCesRt() {
        return cesRt;
    }

    public void setCesRt(int cesRt) {
        this.cesRt = cesRt;
    }

    public int getCesNonAdvlAmt() {
        return cesNonAdvlAmt;
    }

    public void setCesNonAdvlAmt(int cesNonAdvlAmt) {
        this.cesNonAdvlAmt = cesNonAdvlAmt;
    }

    public int getStateCesRt() {
        return stateCesRt;
    }

    public void setStateCesRt(int stateCesRt) {
        this.stateCesRt = stateCesRt;
    }

    public double getStateCesAmt() {
        return stateCesAmt;
    }

    public void setStateCesAmt(double stateCesAmt) {
        this.stateCesAmt = stateCesAmt;
    }

    public int getStateCesNonAdvlAmt() {
        return stateCesNonAdvlAmt;
    }

    public void setStateCesNonAdvlAmt(int stateCesNonAdvlAmt) {
        this.stateCesNonAdvlAmt = stateCesNonAdvlAmt;
    }

    public int getOthChrg() {
        return othChrg;
    }

    public void setOthChrg(int othChrg) {
        this.othChrg = othChrg;
    }

    public double getTotItemVal() {
        return totItemVal;
    }

    public void setTotItemVal(double totItemVal) {
        this.totItemVal = totItemVal;
    }

    public String getOrdLineRef() {
        return ordLineRef;
    }

    public void setOrdLineRef(String ordLineRef) {
        this.ordLineRef = ordLineRef;
    }

    public String getOrgCntry() {
        return orgCntry;
    }

    public void setOrgCntry(String orgCntry) {
        this.orgCntry = orgCntry;
    }

    public String getPrdSlNo() {
        return prdSlNo;
    }

    public void setPrdSlNo(String prdSlNo) {
        this.prdSlNo = prdSlNo;
    }

    public BchDtls getBchDtls() {
        return bchDtls;
    }

    public void setBchDtls(BchDtls bchDtls) {
        this.bchDtls = bchDtls;
    }

    public List<AttributeDetails> getAttribDtls() {
        return attribDtls;
    }

    public void setAttribDtls(List<AttributeDetails> attribDtls) {
        this.attribDtls = attribDtls;
    }
}
