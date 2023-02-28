package com.schneider.invoiceapi.model;

import java.util.List;

public class RefDtls {
    private String invRm;

    private DocPerdDtls docPerdDtls;
    private List<PrecDocDetails> precDocDtls;
    private List<ContrDetails> contrDtls;
    public String getInvRm() {
        return invRm;
    }

    public void setInvRm(String invRm) {
        this.invRm = invRm;
    }

    public DocPerdDtls getDocPerdDtls() {
        return docPerdDtls;
    }

    public void setDocPerdDtls(DocPerdDtls docPerdDtls) {
        this.docPerdDtls = docPerdDtls;
    }

    public List<PrecDocDetails> getPrecDocDtls() {
        return precDocDtls;
    }

    public void setPrecDocDtls(List<PrecDocDetails> precDocDtls) {
        this.precDocDtls = precDocDtls;
    }

    public List<ContrDetails> getContrDtls() {
        return contrDtls;
    }

    public void setContrDtls(List<ContrDetails> contrDtls) {
        this.contrDtls = contrDtls;
    }
}
