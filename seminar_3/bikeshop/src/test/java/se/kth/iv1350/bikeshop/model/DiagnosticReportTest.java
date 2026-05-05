package se.kth.iv1350.bikeshop.model;
import org.junit.jupiter.api.AfterEach;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import se.kth.iv1350.bikeshop.dto.DiagnosticReportDTO;


public class DiagnosticReportTest {
    
    //Test that addSampleData adds sample data
    private DiagnosticReport report;
    
    @BeforeEach
    public void setUp() {
        report = new DiagnosticReport();
    }
    
    //Test that the state has been changed after a report is added
    //assertEquals can be used for asserting that expected objects have been created
    /*
    I detta projekt:

        problemDescription / accepted / totalCost → state
        addDiagnosticReport / acceptOrder → command - 
        publik metod eller retur‑DTO → observation
        assertEquals(expected, actual) → state‑verifiering 
        private String problemDescription; är mitt STATE1
        actual väred: en string inuti DTo, hämtad m getter
        */
    @Test
    public void testIfObjectContainsReport(){
       //addDiagnosticReport(String problemDescription)
    
        StrDiagnosticReport expectedObjectVerifier = new DiagnosticReport;
        DiagnosticReport actualObject = new DiagnosticReport;

        DiagnosticReportDTO expectedObjectCreated = new DiagnosticReportDTO("adding a string");
        actualObject.addDiagnosticReport("adding a string");
        actualObject.getProblemDescription();

        expectedObjectVerifier = expectedObjectCreated.getProblemDescription();


        assertEquals(expectedObjectCreated, actualObject, "A state should have been saved");
       
     
    }

 

    @AfterEach
    void tearDown() {
        report = null;
    }
}