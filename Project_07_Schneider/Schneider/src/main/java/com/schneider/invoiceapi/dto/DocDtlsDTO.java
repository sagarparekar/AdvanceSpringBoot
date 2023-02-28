package com.schneider.invoiceapi.dto;

import java.util.Date;

public class DocDtlsDTO {

    private String typ;

    private String no;

    private String dt;

    public String getTyp() {
        return typ;
    }

    public void setTyp(String typ) {
        this.typ = typ;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getDt() {
        return dt;
    }

    public void setDt(String dt) {
        this.dt = dt;
    }
}
