package com.schneider.invoiceapi.controller;

import com.schneider.invoiceapi.dto.SubmitInvoiceDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.security.RolesAllowed;
import javax.validation.Valid;
import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
@RequestMapping("/schneider")
public class SubmitInvoiceController {

    private static final Logger log = LoggerFactory.getLogger(SubmitInvoiceController.class);
    @PostMapping("/submitinvoice")
    @PreAuthorize("hasAuthority('AR_ANALYST')")
    public ResponseEntity submitInvoice(@Valid @RequestBody SubmitInvoiceDTO submitInvoiceDTO){
        Date dNow = new Date();
        SimpleDateFormat ft = new SimpleDateFormat("yyMMddhhmmssMs");
        String datetime = ft.format(dNow);
        return ResponseEntity.ok("Acknowledgement token : "+datetime);
    }

}
