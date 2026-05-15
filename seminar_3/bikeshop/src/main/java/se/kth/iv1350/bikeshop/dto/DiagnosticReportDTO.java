package se.kth.iv1350.bikeshop.dto;

/**
 * DTO for the DiagnosticReport
 */


public class DiagnosticReportDTO {
    private String diagnosticReport;

    //what tasks to be fixed.

    /**
     * Constructor for the diagnostic report dto
     * @param diagnosticReport description of problem with the bike.
     */

    public DiagnosticReportDTO(String diagnosticReport){
        this.diagnosticReport = diagnosticReport;
    }

    /** 
     * Get method for problem description
     * @return the description of the problem with the bike
     */
    public String getDiagnosticReport() {
        return this.diagnosticReport;
    }   
}
