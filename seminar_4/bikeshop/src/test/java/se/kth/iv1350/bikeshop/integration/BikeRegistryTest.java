package se.kth.iv1350.bikeshop.integration;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class BikeRegistryTest {
    
    private CustomerRegistry registry;
    
    @BeforeEach
    public void setUp() {
        registry = new CustomerRegistry();
    }
    
    @Test
    public void test (){
      
    }
 


    @AfterEach
    void tearDown() {
        registry = null;
    }
}