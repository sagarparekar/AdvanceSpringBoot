package com.schneider.invoiceapi.dto;

public class ValDtlsDTO {

    private double assVal;
    private double cgstVal;
    private double sgstVal;
    private double igstVal;
    private double cesVal;
    private double stCesVal;
    private double discount;
    private double othChrg;
    private double rndOffAmt;
    private double totInvVal;
    private double totInvValFc;

    public double getAssVal() {
        return assVal;
    }

    public void setAssVal(double assVal) {
        this.assVal = assVal;
    }

    public double getCgstVal() {
        return cgstVal;
    }

    public void setCgstVal(double cgstVal) {
        this.cgstVal = cgstVal;
    }

    public double getSgstVal() {
        return sgstVal;
    }

    public void setSgstVal(double sgstVal) {
        this.sgstVal = sgstVal;
    }

    public double getIgstVal() {
        return igstVal;
    }

    public void setIgstVal(double igstVal) {
        this.igstVal = igstVal;
    }

    public double getCesVal() {
        return cesVal;
    }

    public void setCesVal(double cesVal) {
        this.cesVal = cesVal;
    }

    public double getStCesVal() {
        return stCesVal;
    }

    public void setStCesVal(double stCesVal) {
        this.stCesVal = stCesVal;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getOthChrg() {
        return othChrg;
    }

    public void setOthChrg(double othChrg) {
        this.othChrg = othChrg;
    }

    public double getRndOffAmt() {
        return rndOffAmt;
    }

    public void setRndOffAmt(double rndOffAmt) {
        this.rndOffAmt = rndOffAmt;
    }

    public double getTotInvVal() {
        return totInvVal;
    }

    public void setTotInvVal(double totInvVal) {
        this.totInvVal = totInvVal;
    }

    public double getTotInvValFc() {
        return totInvValFc;
    }

    public void setTotInvValFc(double totInvValFc) {
        this.totInvValFc = totInvValFc;
    }
}
