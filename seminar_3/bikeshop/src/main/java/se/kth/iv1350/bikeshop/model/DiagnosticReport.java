package se.kth.iv1350.bikeshop.model;

import se.kth.iv1350.bikeshop.dto.DiagnosticReportDTO;

/**
 * Represents a diagnostic report for a repair order.
 * Contains information about the problem found during diagnosis.
 * 
 * 1)skapa en instans av objektet "genom" dto
 * 2)
 * 3)
 */
public class DiagnosticReport {

    //ska den här stringen finnas här eller i DTO egentligen?
    private String problemDescription;

    /**
     * Creates a new instance of DiagnosticReport. 
     * Empty constructor because the report will be handled by the program flow at a later stage.
     */
    public DiagnosticReport() {
    }
    /**
     * Adds a diagnostic report with the specified problem description.
     * An object is created using an reference to DiagnosticRepairDTO. 
     * The data is stored by the model layer and stored 
     *
     * @param problemDescription A description of the diagnosed problem (from the user?).
     * @return A {@link DiagnosticReportDTO} containing the diagnostic data.
     */
    public DiagnosticReportDTO addDiagnosticReport(String problemDescription) {
        this.problemDescription = problemDescription;
        return new DiagnosticReportDTO(problemDescription);
    }

   
}
