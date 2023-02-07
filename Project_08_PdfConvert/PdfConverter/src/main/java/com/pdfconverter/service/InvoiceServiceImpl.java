package com.pdfconverter.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.type.MapType;
import com.pdfconverter.entity.InvoiceDto;
import org.apache.commons.text.WordUtils;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.PageLayout;
import org.apache.pdfbox.pdmodel.common.PDRectangle;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.awt.*;
import java.awt.print.PageFormat;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

@Service
public class InvoiceServiceImpl implements InvoiceService {

    @Override
    public void generatePdf(InvoiceDto invoiceDto) throws IOException {

        PDDocument document = new PDDocument();

        PDPage page2 = new PDPage(PDRectangle.A4);
        PDPage page1 = new PDPage(PDRectangle.A4);
        document.addPage(page1);
        document.addPage(page2);

        PDPageContentStream contentStream = new PDPageContentStream(document, page1,true, false);
        contentStream.setFont(PDType1Font.COURIER, 10.5f);
        contentStream.beginText();
        contentStream.setLeading(14.5f);
        contentStream.newLineAtOffset(30, 750);
        contentStream.showText(String.valueOf("AckNo :  " + invoiceDto.getAckNo()));
        contentStream.newLine();

        contentStream.showText("AckDt : " + invoiceDto.getAckDt());
        contentStream.newLine();

        contentStream.showText("Irn : " + invoiceDto.getIrn());
        contentStream.newLine();


        String sign = "SignedInvoice : " + invoiceDto.getSignedInvoice();
        //i=0;i<3070;;
        String[] s1 = sign.split("(?<=\\G.{85})");
        Arrays.asList(s1).stream().forEach(s -> {
            try {
                contentStream.showText(s);
                contentStream.newLine();

            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });

        contentStream.endText();
        contentStream.close();
        PDPageContentStream contentStream1 = new PDPageContentStream(document, page2);
        contentStream1.setFont(PDType1Font.COURIER, (float) 10.5f);
        contentStream1.beginText();
        contentStream1.setLeading(14.5f);
        contentStream1.newLineAtOffset(30, 750);
//        contentStream.showText("SignedInvoice : " + invoiceDto.getSignedInvoice());
//        contentStream.newLine();
        String signQRCode = "SignedQRCode : " + invoiceDto.getSignedQRCode();
        String[] qrcode = signQRCode.split("(?<=\\G.{83})");
        Arrays.asList(qrcode).stream().forEach(code -> {
            try {
                contentStream1.showText(code);
                contentStream1.newLine();

            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });

        contentStream1.showText("Status : " + invoiceDto.getStatus());
        contentStream1.newLine();

        contentStream1.showText("EwbNo : " + String.valueOf(invoiceDto.getEwbNo()));
        contentStream1.newLine();

        contentStream1.showText("EwbDt : " + invoiceDto.getEwbDt());
        contentStream1.newLine();

        contentStream1.showText("EwbValidTill : " + invoiceDto.getEwbValidTill());
        contentStream1.newLine();

        contentStream1.showText("Remarks : " + invoiceDto.getRemarks());
        contentStream1.newLine();

        contentStream1.endText();
        contentStream1.close();

        document.save("D:\\JsonbodyToPdf.pdf");
        document.close();

    }

    @Override
    public void jsonFileToPdf(MultipartFile file) throws IOException {

        File jsonFile = new File("C:\\Users\\2236833\\Documents\\Test.json").getAbsoluteFile();

        ObjectMapper mapper = new ObjectMapper();

        mapper.enable(SerializationFeature.INDENT_OUTPUT);

        MapType mapType = mapper.getTypeFactory().constructMapType(Map.class, String.class, Object.class);
        Map<String, Object> map = mapper.readValue(jsonFile, mapType);

        String json = mapper.writeValueAsString(map);

        String[] strings = json.split(System.lineSeparator());

        PDDocument document = new PDDocument();
        PDPage page = new PDPage();
        document.addPage(page);

        PDPageContentStream contentStream = new PDPageContentStream(document, page);

        contentStream.setFont(PDType1Font.COURIER, 12);
        contentStream.beginText();
        contentStream.setLeading(14.5f);
        contentStream.newLineAtOffset(25, 725);


        for (String text : strings) {
            contentStream.showText(text);
            contentStream.newLine();
        }

        contentStream.endText();
        contentStream.close();
        document.save("C:\\Users\\2236833\\Documents\\jsonFileToPdf.pdf");
        document.close();
    }

}
