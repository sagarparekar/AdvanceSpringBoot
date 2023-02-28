package com.schneider.invoiceapi.model;

import java.util.Date;

public class PrecDocDetails {
    private String invNo;
    private Date invDt;
    private String othRefNo;

    public String getInvNo() {
        return invNo;
    }

    public void setInvNo(String invNo) {
        this.invNo = invNo;
    }

    public Date getInvDt() {
        return invDt;
    }

    public void setInvDt(Date invDt) {
        this.invDt = invDt;
    }

    public String getOthRefNo() {
        return othRefNo;
    }

    public void setOthRefNo(String othRefNo) {
        this.othRefNo = othRefNo;
    }
}
