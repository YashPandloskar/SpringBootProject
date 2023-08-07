package springboot.project.springboot.project;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest 
public class ReportServiceTest {

    @Autowired
    private ReportService reportService;

    @Test
    public void testCaching() {
        // First call, data will be fetched from the database and cached
        ReportData reportData1 = reportService.getReportData("report1", 2022);

        // Second call with the same parameters, data will be retrieved from the cache
        ReportData reportData2 = reportService.getReportData("report1", 2022);
        
        // Add your assertions here to verify the caching behavior
        // For example, you can check if the two reportData objects are the same.
    }
}