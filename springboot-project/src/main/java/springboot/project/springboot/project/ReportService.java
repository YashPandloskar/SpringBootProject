package springboot.project.springboot.project;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;


@Service
public class ReportService {

    private final databaseService databaseService;

    public ReportService(databaseService databaseService) {
        this.databaseService = new databaseService();
    }

    @Cacheable(value = "reportCache", key = "{#reportName, #year}")
    public ReportData getReportData(String reportName, int year) {

        ReportData reportData = databaseService.fetchReportData(reportName, year);
        return reportData;
    }
}