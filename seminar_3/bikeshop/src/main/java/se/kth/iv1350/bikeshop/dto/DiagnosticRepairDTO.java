package se.kth.iv1350.bikeshop.dto;

/**
 * DTO for the DiagnosticReport
 */

public class DiagnosticRepairDTO {
    private String problemDescription;

    public DiagnosticRepairDTO(String problemDescription){
        this.problemDescription = problemDescription;
    }

    public String getProblemDescription() {
        return problemDescription;
    }   
}
