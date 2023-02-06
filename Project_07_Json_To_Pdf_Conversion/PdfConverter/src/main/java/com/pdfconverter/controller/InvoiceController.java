package com.pdfconverter.controller;

import com.pdfconverter.entity.InvoiceDto;
import com.pdfconverter.service.InvoiceServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
@RequestMapping(value = "/api")
public class InvoiceController {

    @Autowired
    InvoiceServiceImpl invoiceServiceImpl;

    @GetMapping(value = "/createpdf")
    public void generatePdf(@RequestBody final InvoiceDto invoiceDto) throws IOException {
        invoiceServiceImpl.generatePdf(invoiceDto);
    }

    @GetMapping(value = "/jsonpdf")
    public void jsonFileToPdf(@RequestBody final MultipartFile file) throws IOException {
        invoiceServiceImpl.jsonFileToPdf(file);
    }
//
//    @GetMapping(value = "/createtable")
//    public void creteTablePdf(@RequestBody final InvoiceDto invoiceDto) throws IOException {
//        invoiceServiceImpl.creteTablePdf(invoiceDto);
//    }



}
