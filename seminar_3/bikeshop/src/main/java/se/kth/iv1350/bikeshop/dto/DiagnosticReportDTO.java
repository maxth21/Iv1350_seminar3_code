package se.kth.iv1350.bikeshop.dto;

/**
 * DTO for the DiagnosticReport
 */

public class DiagnosticReportDTO {
    private String problemDescription;

    /**
     * Constructor for the diagnostic report dto
     * @param problemDescription description of problem with the bike.
     */

    public DiagnosticReportDTO(String problemDescription){
        this.problemDescription = problemDescription;
    }

    /**
     * Get method for problem description
     * @return the description of the problem with the bike
     */
    public String getProblemDescription() {
        return problemDescription;
    }   
}
