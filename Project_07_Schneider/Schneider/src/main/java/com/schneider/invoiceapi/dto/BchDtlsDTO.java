package com.schneider.invoiceapi.dto;

import java.util.Date;

public class BchDtlsDTO {
    private String nm;
    private String expDt;
    private String wrDt;

    public String getNm() {
        return nm;
    }

    public void setNm(String nm) {
        this.nm = nm;
    }

    public String getExpDt() {
        return expDt;
    }

    public void setExpDt(String expDt) {
        this.expDt = expDt;
    }

    public String getWrDt() {
        return wrDt;
    }

    public void setWrDt(String wrDt) {
        this.wrDt = wrDt;
    }
}
