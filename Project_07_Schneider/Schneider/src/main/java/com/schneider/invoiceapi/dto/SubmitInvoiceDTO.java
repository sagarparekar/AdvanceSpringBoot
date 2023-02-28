package com.schneider.invoiceapi.dto;

import java.util.List;

public class SubmitInvoiceDTO {

    private String version;
    private TranDtlsDTO tranDtlsDTO;
    private DocDtlsDTO docDtlsDTO;
    private SellerDtlsDTO sellerDtlsDTO;
    private BuyerDtlsDTO buyerDtlsDTO;
    private DispDtlsDTO dispDtlsDTO;
    private ShipDtlsDTO shipDtlsDTO;
    private List<IteamDTO> itemList;
    private ValDtlsDTO valDtlsDTO;
    private PayDtlsDTO payDtlsDTO;
    private RefDtlsDTO refDtlsDTO;
    private List<AddlDocDetailsDTO> addlDocDtls;
    private ExpDtlsDTO expDtlsDTO;
    private EwbDtlsDTO ewbDtlsDTO;

    public String getVersion() {
        return version;
    }

    public void setVersion(String Version) {
        this.version = Version;
    }

    public TranDtlsDTO getTranDtls() {
        return tranDtlsDTO;
    }

    public void setTranDtls(TranDtlsDTO tranDtlsDTO) {
        this.tranDtlsDTO = tranDtlsDTO;
    }

    public DocDtlsDTO getDocDtls() {
        return docDtlsDTO;
    }

    public void setDocDtls(DocDtlsDTO docDtlsDTO) {
        this.docDtlsDTO = docDtlsDTO;
    }

    public SellerDtlsDTO getSellerDtls() {
        return sellerDtlsDTO;
    }

    public void setSellerDtls(SellerDtlsDTO sellerDtlsDTO) {
        this.sellerDtlsDTO = sellerDtlsDTO;
    }

    public BuyerDtlsDTO getBuyerDtls() {
        return buyerDtlsDTO;
    }

    public void setBuyerDtls(BuyerDtlsDTO buyerDtlsDTO) {
        this.buyerDtlsDTO = buyerDtlsDTO;
    }

    public DispDtlsDTO getDispDtls() {
        return dispDtlsDTO;
    }

    public void setDispDtls(DispDtlsDTO dispDtlsDTO) {
        this.dispDtlsDTO = dispDtlsDTO;
    }

    public ShipDtlsDTO getShipDtls() {
        return shipDtlsDTO;
    }

    public void setShipDtls(ShipDtlsDTO shipDtlsDTO) {
        this.shipDtlsDTO = shipDtlsDTO;
    }

    public List<IteamDTO> getItemList() {
        return itemList;
    }

    public void setItemList(List<IteamDTO> itemList) {
        this.itemList = itemList;
    }

    public ValDtlsDTO getValDtls() {
        return valDtlsDTO;
    }

    public void setValDtls(ValDtlsDTO valDtlsDTO) {
        this.valDtlsDTO = valDtlsDTO;
    }

    public PayDtlsDTO getPayDtls() {
        return payDtlsDTO;
    }

    public void setPayDtls(PayDtlsDTO payDtlsDTO) {
        this.payDtlsDTO = payDtlsDTO;
    }

    public RefDtlsDTO getRefDtls() {
        return refDtlsDTO;
    }

    public void setRefDtls(RefDtlsDTO refDtlsDTO) {
        this.refDtlsDTO = refDtlsDTO;
    }

    public List<AddlDocDetailsDTO> getAddlDocDtls() {
        return addlDocDtls;
    }

    public void setAddlDocDtls(List<AddlDocDetailsDTO> addlDocDtls) {
        this.addlDocDtls = addlDocDtls;
    }

    public ExpDtlsDTO getExpDtls() {
        return expDtlsDTO;
    }

    public void setExpDtls(ExpDtlsDTO expDtlsDTO) {
        this.expDtlsDTO = expDtlsDTO;
    }

    public EwbDtlsDTO getEwbDtls() {
        return ewbDtlsDTO;
    }

    public void setEwbDtls(EwbDtlsDTO ewbDtlsDTO) {
        this.ewbDtlsDTO = ewbDtlsDTO;
    }
}
