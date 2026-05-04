package se.kth.iv1350.bikeshop.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import se.kth.iv1350.bikeshop.dto.DiagnosticReportDTO;

public class DiagnosticReportTest {

    private DiagnosticReport report;

    @BeforeEach
    public void setUp() {
        report = new DiagnosticReport();
    }

    @Test
    public void testIfObjectIsCreated() {
        assertNotNull(report, "DiagnosticReport object should be created.");
    }

    @Test
    public void testAddDiagnosticReportReturnsNotNull() {
        DiagnosticReportDTO result = report.addDiagnosticReport("Brakes not working");
        assertNotNull(result, "addDiagnosticReport should return a DiagnosticReportDTO.");
    }

    @Test
    public void testAddDiagnosticReportStoresProblemDescription() {
        String expected = "Battery draining fast";
        DiagnosticReportDTO result = report.addDiagnosticReport(expected);
        assertEquals(expected, result.getProblemDescription(),
                "The returned DTO should contain the problem description that was passed in.");
    }

    @Test
    public void testAddDiagnosticReportWithEmptyString() {
        DiagnosticReportDTO result = report.addDiagnosticReport("");
        assertEquals("", result.getProblemDescription(),
                "An empty problem description should be stored as an empty string.");
    }

    @AfterEach
    void tearDown() {
        report = null;
    }
}
