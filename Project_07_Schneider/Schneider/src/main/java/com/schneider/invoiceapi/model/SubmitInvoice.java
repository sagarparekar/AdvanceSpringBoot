package com.schneider.invoiceapi.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.List;

public class SubmitInvoice {


    private String version;
    private TranDtls tranDtls;
    private DocDtls docDtls;
    private SellerDtls sellerDtls;
    private BuyerDtls buyerDtls;
    private DispDtls dispDtls;
    private ShipDtls shipDtls;
    private List<Iteam> itemList;
    private ValDtls valDtls;
    private PayDtls payDtls;
    private RefDtls refDtls;
    private List<AddlDocDetails> addlDocDtls;
    private ExpDtls expDtls;
    private EwbDtls ewbDtls;

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public TranDtls getTranDtls() {
        return tranDtls;
    }

    public void setTranDtls(TranDtls tranDtls) {
        this.tranDtls = tranDtls;
    }

    public DocDtls getDocDtls() {
        return docDtls;
    }

    public void setDocDtls(DocDtls docDtls) {
        this.docDtls = docDtls;
    }

    public SellerDtls getSellerDtls() {
        return sellerDtls;
    }

    public void setSellerDtls(SellerDtls sellerDtls) {
        this.sellerDtls = sellerDtls;
    }

    public BuyerDtls getBuyerDtls() {
        return buyerDtls;
    }

    public void setBuyerDtls(BuyerDtls buyerDtls) {
        this.buyerDtls = buyerDtls;
    }

    public DispDtls getDispDtls() {
        return dispDtls;
    }

    public void setDispDtls(DispDtls dispDtls) {
        this.dispDtls = dispDtls;
    }

    public ShipDtls getShipDtls() {
        return shipDtls;
    }

    public void setShipDtls(ShipDtls shipDtls) {
        this.shipDtls = shipDtls;
    }

    public List<Iteam> getItemList() {
        return itemList;
    }

    public void setItemList(List<Iteam> itemList) {
        this.itemList = itemList;
    }

    public ValDtls getValDtls() {
        return valDtls;
    }

    public void setValDtls(ValDtls valDtls) {
        this.valDtls = valDtls;
    }

    public PayDtls getPayDtls() {
        return payDtls;
    }

    public void setPayDtls(PayDtls payDtls) {
        this.payDtls = payDtls;
    }

    public RefDtls getRefDtls() {
        return refDtls;
    }

    public void setRefDtls(RefDtls refDtls) {
        this.refDtls = refDtls;
    }

    public List<AddlDocDetails> getAddlDocDtls() {
        return addlDocDtls;
    }

    public void setAddlDocDtls(List<AddlDocDetails> addlDocDtls) {
        this.addlDocDtls = addlDocDtls;
    }

    public ExpDtls getExpDtls() {
        return expDtls;
    }

    public void setExpDtls(ExpDtls expDtls) {
        this.expDtls = expDtls;
    }

    public EwbDtls getEwbDtls() {
        return ewbDtls;
    }

    public void setEwbDtls(EwbDtls ewbDtls) {
        this.ewbDtls = ewbDtls;
    }
}
