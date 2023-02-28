package com.schneider.invoiceapi.model;

import java.util.Date;

public class BchDtls {
    private String nm;
    private Date expDt;
    private Date wrDt;

    public String getNm() {
        return nm;
    }

    public void setNm(String nm) {
        this.nm = nm;
    }

    public Date getExpDt() {
        return expDt;
    }

    public void setExpDt(Date expDt) {
        this.expDt = expDt;
    }

    public Date getWrDt() {
        return wrDt;
    }

    public void setWrDt(Date wrDt) {
        this.wrDt = wrDt;
    }
}
