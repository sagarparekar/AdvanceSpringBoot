package com.schneider.invoiceapi.model;

import java.util.Date;

public class DocPerdDtls {

    private Date invStDt;
    private Date invEndDt;

    public Date getInvStDt() {
        return invStDt;
    }

    public void setInvStDt(Date invStDt) {
        this.invStDt = invStDt;
    }

    public Date getInvEndDt() {
        return invEndDt;
    }

    public void setInvEndDt(Date invEndDt) {
        this.invEndDt = invEndDt;
    }
}
