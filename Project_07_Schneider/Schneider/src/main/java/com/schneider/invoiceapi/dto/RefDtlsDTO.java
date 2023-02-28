package com.schneider.invoiceapi.dto;

import java.util.List;

public class RefDtlsDTO {
    private String invRm;

    private DocPerdDtlsDTO docPerdDtlsDTO;
    private List<PrecDocDetailsDTO> precDocDtls;
    private List<ContrDetailsDTO> contrDtls;
    public String getInvRm() {
        return invRm;
    }

    public void setInvRm(String invRm) {
        this.invRm = invRm;
    }

    public DocPerdDtlsDTO getDocPerdDtls() {
        return docPerdDtlsDTO;
    }

    public void setDocPerdDtls(DocPerdDtlsDTO docPerdDtlsDTO) {
        this.docPerdDtlsDTO = docPerdDtlsDTO;
    }

    public List<PrecDocDetailsDTO> getPrecDocDtls() {
        return precDocDtls;
    }

    public void setPrecDocDtls(List<PrecDocDetailsDTO> precDocDtls) {
        this.precDocDtls = precDocDtls;
    }

    public List<ContrDetailsDTO> getContrDtls() {
        return contrDtls;
    }

    public void setContrDtls(List<ContrDetailsDTO> contrDtls) {
        this.contrDtls = contrDtls;
    }
}
