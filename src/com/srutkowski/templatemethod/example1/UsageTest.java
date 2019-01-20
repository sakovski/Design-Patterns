package com.srutkowski.templatemethod.example1;

public class UsageTest {

    public static void main(String... args) {
        var excelReportSender = new ExcelReportSender();
        excelReportSender.send();

        var pdfReportSender = new PdfReportSender();
        pdfReportSender.send();
    }

}
