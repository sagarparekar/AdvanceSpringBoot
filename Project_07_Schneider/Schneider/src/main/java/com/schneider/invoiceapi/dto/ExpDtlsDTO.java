package com.schneider.invoiceapi.dto;



public class ExpDtlsDTO {

    private String shipBNo;
    private String shipBDt;
    private String port;
    private String refClm;
    private String forCur;
    private String cntCode;
    private String expDuty;

    public String getShipBNo() {
        return shipBNo;
    }

    public void setShipBNo(String shipBNo) {
        this.shipBNo = shipBNo;
    }

    public String getShipBDt() {
        return shipBDt;
    }

    public void setShipBDt(String shipBDt) {
        this.shipBDt = shipBDt;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public String getRefClm() {
        return refClm;
    }

    public void setRefClm(String refClm) {
        this.refClm = refClm;
    }

    public String getForCur() {
        return forCur;
    }

    public void setForCur(String forCur) {
        this.forCur = forCur;
    }

    public String getCntCode() {
        return cntCode;
    }

    public void setCntCode(String cntCode) {
        this.cntCode = cntCode;
    }

    public String getExpDuty() {
        return expDuty;
    }

    public void setExpDuty(String expDuty) {
        this.expDuty = expDuty;
    }
}
