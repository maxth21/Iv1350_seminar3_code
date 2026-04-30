package se.kth.iv1350.bikeshop.integration;

import se.kth.iv1350.bikeshop.dto.CustomerDTO;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;


public class CustomerRegistryTest {
    
    //Test that the list is created 
    //Test that the list is empty
    //Test that addSampleData adds sample data
    private CustomerRegistry registry;
    
    @BeforeEach
    public void setUp() {
        registry = new CustomerRegistry();
    }
    

    @Test
    void testFindExistingCustomer() {
        CustomerDTO result = registry.findCustomer("0701234567");
        assertNotNull(result, "Should find existing customer.");
    }

    @Test
    void testFindNonExistingCustomerReturnsNull() {
        CustomerDTO result = registry.findCustomer("0000000000");
        assertNull(result, "Should return null for unknown customer.");
    }


    @AfterEach
    void tearDown() {
        registry = null;
    }
}