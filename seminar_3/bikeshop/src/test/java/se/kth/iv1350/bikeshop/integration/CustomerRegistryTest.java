package se.kth.iv1350.bikeshop.integration;

import org.junit.jupiter.api.AfterEach;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import se.kth.iv1350.bikeshop.dto.CustomerDTO;


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
    public void testIfAddsSampleData(){
        CustomerRegistry customers = new CustomerRegistry();
        Object ob = null;
        assertNotEquals(customers, ob, "should not be equal");
    }

    @Test
    public void testIfContainsCorrectSampleData(){       
        CustomerRegistry customers = new CustomerRegistry();
        customers.
        List<String> customerData = new ArrayList<>();
        customerData.add("Anna Svensson");
        customerData.add("0701234567");
        customerData.add("anna@mail.com");
        assertEquals(customers, customerData);

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