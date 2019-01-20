package com.srutkowski.templatemethod.example1;

public class PdfReportSender extends ReportSender {

    @Override
    String prepareReport(String data) {
        return "PDF report of: ".concat(data);
    }
}
