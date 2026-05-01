package se.kth.iv1350.bikeshop.model;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class DiagnosticReportTest {
    
    //Test that the list is created 
    //Test that the list is empty
    //Test that addSampleData adds sample data
    private DiagnosticReport report;
    
    @BeforeEach
    public void setUp() {
        report = new DiagnosticReport();
    }
    
    @Test
    public void test(){
        
    }

    @Test
    public void testIfContainsCorrectSampleData(){
       
    }

    @Test
    void testFindExistingReport() {
        
    }

    @AfterEach
    void tearDown() {
        report = null;
    }
}