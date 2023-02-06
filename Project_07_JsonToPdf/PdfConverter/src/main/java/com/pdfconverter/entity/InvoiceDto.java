package com.pdfconverter.entity;

public class InvoiceDto {

    private long ackNo;

    private String ackDt;

    private String irn;

    private String signedInvoice;

    private String signedQRCode;

    private String status;

    private long ewbNo;

    private String ewbDt;

    private String ewbValidTill;

    private String remarks;

    public long getAckNo() {
        return ackNo;
    }

    public void setAckNo(long ackNo) {
        this.ackNo = ackNo;
    }

    public String getAckDt() {
        return ackDt;
    }

    public void setAckDt(String ackDt) {
        this.ackDt = ackDt;
    }

    public String getIrn() {
        return irn;
    }

    public void setIrn(String irn) {
        this.irn = irn;
    }

    public String getSignedInvoice() {
        return signedInvoice;
    }

    public void setSignedInvoice(String signedInvoice) {
        this.signedInvoice = signedInvoice;
    }

    public String getSignedQRCode() {
        return signedQRCode;
    }

    public void setSignedQRCode(String signedQRCode) {
        this.signedQRCode = signedQRCode;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public long getEwbNo() {
        return ewbNo;
    }

    public void setEwbNo(long ewbNo) {
        this.ewbNo = ewbNo;
    }

    public String getEwbDt() {
        return ewbDt;
    }

    public void setEwbDt(String ewbDt) {
        this.ewbDt = ewbDt;
    }

    public String getEwbValidTill() {
        return ewbValidTill;
    }

    public void setEwbValidTill(String ewbValidTill) {
        this.ewbValidTill = ewbValidTill;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
}
