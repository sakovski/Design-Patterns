package com.srutkowski.templatemethod.example1;

public abstract class ReportSender {

    final void send() {
        var data = gatherData();
        var cutData = cutUnnecessaryData(data);
        var report = prepareReport(cutData);
        sendReport(report);
    }

    final String gatherData() {
        return "GATHERED DATA: 12 12 3 4 5 6 7";
    }

    String cutUnnecessaryData(String data) {
        return data;
    }

    abstract String prepareReport(String data);

    final void sendReport(String report) {
        System.out.printf("Sending Report: ".concat(report).concat(System.lineSeparator()));
    }
}
