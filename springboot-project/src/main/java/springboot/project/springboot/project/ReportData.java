package springboot.project.springboot.project;

//ReportData.java (Simple POJO representing the report data)
public class ReportData {
 private String reportName;
 private int year;
 private String data;

 // Default constructor (required for caching)
 public ReportData() {
 }

 // Additional constructor with parameters
 public ReportData(String reportName, int year, String data) {
     this.reportName = reportName;
     this.year = year;
     this.data = data;
 }

 // Getters and setters (required for caching)
 public String getReportName() {
     return reportName;
 }

 public void setReportName(String reportName) {
     this.reportName = reportName;
 }

 public int getYear() {
     return year;
 }

 public void setYear(int year) {
     this.year = year;
 }

 public String getData() {
     return data;
 }

 public void setData(String data) {
     this.data = data;
 }
}
