package com.pdfconverter.service;

import com.pdfconverter.entity.InvoiceDto;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

public interface InvoiceService {

    public void generatePdf(InvoiceDto invoiceDto) throws IOException;

    public void jsonFileToPdf(MultipartFile invoiceDto) throws IOException;

//    public void creteTablePdf(InvoiceDto invoiceDto) throws IOException;
}
