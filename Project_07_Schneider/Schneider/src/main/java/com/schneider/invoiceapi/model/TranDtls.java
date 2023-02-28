package com.schneider.invoiceapi.model;

public class TranDtls {

    private String taxSch;

    private String supTyp;

    private String regRev;

    private String ecmGstin;

    private String igstOnIntra;

    public String getTaxSch() {
        return taxSch;
    }

    public void setTaxSch(String taxSch) {
        this.taxSch = taxSch;
    }

    public String getSupTyp() {
        return supTyp;
    }

    public void setSupTyp(String supTyp) {
        this.supTyp = supTyp;
    }

    public String getRegRev() {
        return regRev;
    }

    public void setRegRev(String regRev) {
        this.regRev = regRev;
    }

    public String getEcmGstin() {
        return ecmGstin;
    }

    public void setEcmGstin(String ecmGstin) {
        this.ecmGstin = ecmGstin;
    }

    public String getIgstOnIntra() {
        return igstOnIntra;
    }

    public void setIgstOnIntra(String igstOnIntra) {
        this.igstOnIntra = igstOnIntra;
    }
}
