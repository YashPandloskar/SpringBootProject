package springboot.project.springboot.project;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

@SpringBootTest 
public class ReportServiceTest {

    @Test
    public void testCaching() {
        // Create a new instance of DatabaseService (for simulation purposes)
        databaseService databaseService = new databaseService();

        // Create a new instance of ReportService and inject the databaseService
        ReportService reportService = new ReportService(databaseService);

        // First call, data will be fetched from the database and cached
        ReportData reportData1 = reportService.getReportData("report1", 2022);

        // Second call with the same parameters, data will be retrieved from the cache
        ReportData reportData2 = reportService.getReportData("report1", 2022);

        // Add your assertions here to verify the caching behavior
        // For example, you can check if the two reportData objects are the same.
        assertSame(reportData1, reportData2); // Assert that the same object is retrieved from the cache

        // Or you can assert specific properties of the reportData objects
        assertEquals("report1", reportData1.getReportName());
        assertEquals(2022, reportData1.getYear());
        assertEquals("Sample data for report1 in year 2022", reportData1.getData());
    }
}