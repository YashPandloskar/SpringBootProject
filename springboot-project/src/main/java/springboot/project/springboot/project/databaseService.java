package springboot.project.springboot.project;

public class databaseService {

    public ReportData fetchReportData(String reportName, int year) {

        ReportData reportData = new ReportData();
        reportData.setReportName(reportName);
        reportData.setYear(year);
        reportData.setData("Sample data for " + reportName + " in year " + year);
        return reportData;
    }
}