package com.schneider.invoiceapi.model;

import java.util.Date;

public class ContrDetails {
    private String recAdvRefr;
    private Date recAdvDt;
    private String tendRefr;
    private String contrRefr;
    private String extRefr;
    private String projRefr;
    private String poRefr;
    private Date poRefDt;

    public String getRecAdvRefr() {
        return recAdvRefr;
    }

    public void setRecAdvRefr(String recAdvRefr) {
        this.recAdvRefr = recAdvRefr;
    }

    public Date getRecAdvDt() {
        return recAdvDt;
    }

    public void setRecAdvDt(Date recAdvDt) {
        this.recAdvDt = recAdvDt;
    }

    public String getTendRefr() {
        return tendRefr;
    }

    public void setTendRefr(String tendRefr) {
        this.tendRefr = tendRefr;
    }

    public String getContrRefr() {
        return contrRefr;
    }

    public void setContrRefr(String contrRefr) {
        this.contrRefr = contrRefr;
    }

    public String getExtRefr() {
        return extRefr;
    }

    public void setExtRefr(String extRefr) {
        this.extRefr = extRefr;
    }

    public String getProjRefr() {
        return projRefr;
    }

    public void setProjRefr(String projRefr) {
        this.projRefr = projRefr;
    }

    public String getPoRefr() {
        return poRefr;
    }

    public void setPoRefr(String poRefr) {
        this.poRefr = poRefr;
    }

    public Date getPoRefDt() {
        return poRefDt;
    }

    public void setPoRefDt(Date poRefDt) {
        this.poRefDt = poRefDt;
    }
}
