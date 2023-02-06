package com.pdfconverter.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.type.MapType;
import com.pdfconverter.entity.InvoiceDto;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.common.PDRectangle;
import org.apache.pdfbox.pdmodel.font.PDFont;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class InvoiceServiceImpl implements InvoiceService {



    @Override
    public void generatePdf(InvoiceDto invoiceDto) throws IOException {


        PDDocument document = new PDDocument();
        PDRectangle pageSize=new PDRectangle(1800,600);
        PDPage page = new PDPage(pageSize);
        document.addPage(page);
        PDPageContentStream contentStream = new PDPageContentStream(document, page);
        contentStream.setFont(PDType1Font.COURIER, 12);
        contentStream.beginText();
        contentStream.setLeading(20f);
        contentStream.newLineAtOffset(25, 500);


        contentStream.showText(String.valueOf("AckNo :  " + invoiceDto.getAckNo()));
        contentStream.newLine();

        contentStream.showText("AckDt : " + invoiceDto.getAckDt());
        contentStream.newLine();

        contentStream.showText("Irn : " + invoiceDto.getIrn());
        contentStream.newLine();

        contentStream.showText("SignedInvoice : " + invoiceDto.getSignedInvoice());
        contentStream.newLine();

        contentStream.showText("SignedQRCode : " + invoiceDto.getSignedQRCode());
        contentStream.newLine();

        contentStream.showText("Status : " + invoiceDto.getStatus());
        contentStream.newLine();

        contentStream.showText("EwbNo : " + String.valueOf(invoiceDto.getEwbNo()));
        contentStream.newLine();

        contentStream.showText("EwbDt : " + invoiceDto.getEwbDt());
        contentStream.newLine();

        contentStream.showText("EwbValidTill : " + invoiceDto.getEwbValidTill());
        contentStream.newLine();

        contentStream.showText("Remarks : " + invoiceDto.getRemarks());
        contentStream.newLine();

        contentStream.endText();
        contentStream.close();

        document.save("D:\\mypdf.pdf");
        document.close();

    }

    @Override
    public void jsonFileToPdf(MultipartFile file) throws IOException {

        File jsonFile = new File("D:\\Test.json").getAbsoluteFile();

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
        document.save("D:\\JsonFilePdf.pdf");
        document.close();
    }
//
//    @Override
//    public void creteTablePdf(InvoiceDto invoiceDto) throws IOException {
//        PDDocument document = new PDDocument();
//        PDPage page = new PDPage();
//        document.addPage(page);
//
//        int pageWidth = (int)page.getTrimBox().getWidth(); //get width of the page
//        int pageHeight = (int)page.getTrimBox().getHeight(); //get height of the page
//
//        PDPageContentStream contentStream = new PDPageContentStream(document,page);
//      //  contentStream.setStrokingColor(Color.DARK_GRAY);
//        contentStream.setLineWidth(1);
//
//        int initX = 50;
//        int initY = pageHeight-50;
//        int cellHeight = 30;
//        int cellWidth = 150;
//
//        int colCount = 2;
//        int rowCount = 10;
//
//        for(int i = 1; i<=rowCount;i++){
//            for(int j = 1; j<=colCount;j++){
//                if(j == 2){
//                    contentStream.addRect(initX,initY,cellWidth+30,-cellHeight);
//
//                    contentStream.beginText();
//                    contentStream.newLineAtOffset(initX+30,initY-cellHeight+10);
//                    contentStream.setFont(PDType1Font.TIMES_ROMAN,10);
//                    contentStream.showText("Signed Invoice ");
//                    contentStream.endText();
//
//                    initX+=cellWidth+30;
//                }else{
//                    contentStream.addRect(initX,initY,cellWidth,-cellHeight);
//
//                    contentStream.beginText();
//                    contentStream.newLineAtOffset(initX+10,initY-cellHeight+10);
//                    contentStream.setFont(PDType1Font.TIMES_ROMAN,10);
//                    contentStream.showText("kkkkk");
//                    contentStream.endText();
//
//                    initX+=cellWidth;
//                }
//            }
//            initX = 50;
//            initY -=cellHeight;
//        }
//
//        contentStream.stroke();
//        contentStream.close();
//
//
//        document.save("C:\\Users\\2236833\\Documents\\table.pdf");
//        document.close();
//        System.out.println("table pdf created");
//    }

}
