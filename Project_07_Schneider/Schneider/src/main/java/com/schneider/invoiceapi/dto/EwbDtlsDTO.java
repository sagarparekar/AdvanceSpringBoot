package com.schneider.invoiceapi.dto;



public class EwbDtlsDTO {
    private String transId;
    private String transName;
    private int distance;
    private String transDocNo;
    private String transDocDt;
    private String vehNo;
    private String vehType;
    private String transMode;

    public String getTransId() {
        return transId;
    }

    public void setTransId(String transId) {
        this.transId = transId;
    }

    public String getTransName() {
        return transName;
    }

    public void setTransName(String transName) {
        this.transName = transName;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public String getTransDocNo() {
        return transDocNo;
    }

    public void setTransDocNo(String transDocNo) {
        this.transDocNo = transDocNo;
    }

    public String getTransDocDt() {
        return transDocDt;
    }

    public void setTransDocDt(String transDocDt) {
        this.transDocDt = transDocDt;
    }

    public String getVehNo() {
        return vehNo;
    }

    public void setVehNo(String vehNo) {
        this.vehNo = vehNo;
    }

    public String getVehType() {
        return vehType;
    }

    public void setVehType(String vehType) {
        this.vehType = vehType;
    }

    public String getTransMode() {
        return transMode;
    }

    public void setTransMode(String transMode) {
        this.transMode = transMode;
    }
}
