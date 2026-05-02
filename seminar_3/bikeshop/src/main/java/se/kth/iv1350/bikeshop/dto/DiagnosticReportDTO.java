package se.kth.iv1350.bikeshop.dto;

/**
 * DTO for the DiagnosticReport
 */

public class DiagnosticReportDTO {
    private String problemDescription;

    public DiagnosticReportDTO(String problemDescription){
        this.problemDescription = problemDescription;
    }

    public String getProblemDescription() {
        return problemDescription;
    }   
}
