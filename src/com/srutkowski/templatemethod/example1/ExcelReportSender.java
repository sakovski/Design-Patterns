package com.srutkowski.templatemethod.example1;

public class ExcelReportSender extends ReportSender {

    @Override
    String prepareReport(String data) {
        return "Excel report of: ".concat(data);
    }

    @Override
    String cutUnnecessaryData(String data) {
        return data.replaceAll("1", "");
    }
}
