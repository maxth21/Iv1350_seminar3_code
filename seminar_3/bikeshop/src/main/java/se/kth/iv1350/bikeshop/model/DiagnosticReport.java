package se.kth.iv1350.bikeshop.model;

import se.kth.iv1350.bikeshop.dto.DiagnosticReportDTO;

/**
 * Represents a diagnostic report for a repair order.
 * Contains information about the problem found during diagnosis.
 */
public class DiagnosticReport {

    private String problemDescription;

    /**
     * Creates a new instance of DiagnosticReport.
     */
    public DiagnosticReport() {
    }

    /**
     * Adds a diagnostic report with the specified problem description.
     *
     * @param problemDescription A description of the diagnosed problem.
     * @return A {@link DiagnosticReportDTO} containing the diagnostic data.
     */
    public DiagnosticReportDTO addDiagnosticReport(String problemDescription) {
        this.problemDescription = problemDescription;
        return new DiagnosticReportDTO(problemDescription);
    }

    /**
     * Returns a DTO representation of this diagnostic report.
     *
     * @return A {@link DiagnosticReportDTO} containing the diagnostic data.
     */
    public DiagnosticReportDTO showDiagnosticReport() {
        return new DiagnosticReportDTO(problemDescription);
    }
}
