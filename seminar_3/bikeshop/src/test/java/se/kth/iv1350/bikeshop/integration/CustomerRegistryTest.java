package se.kth.iv1350.bikeshop.integration;

import org.junit.jupiter.api.AfterEach;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import se.kth.iv1350.bikeshop.dto.CustomerDTO;

public class CustomerRegistryTest {

    private CustomerRegistry registry;

    @BeforeEach
    public void setUp() {
        registry = new CustomerRegistry();
    }

    @Test
    public void testIfObjectIsCreated() {
        assertNotNull(registry, "CustomerRegistry object should be created.");
    }

    @Test
    public void testFindExistingCustomerReturnsNotNull() {
        CustomerDTO result = registry.findCustomer("0701234567");
        assertNotNull(result, "Should find existing customer.");
    }

    @Test
    public void testFindExistingCustomerReturnsCorrectName() {
        CustomerDTO result = registry.findCustomer("0701234567");
        assertEquals("Anna Svensson", result.getName(), "Name should match sample data.");
    }

    @Test
    public void testFindExistingCustomerReturnsCorrectPhoneNr() {
        CustomerDTO result = registry.findCustomer("0701234567");
        assertEquals("0701234567", result.getPhoneNr(), "Phone number should match sample data.");
    }

    @Test
    public void testFindExistingCustomerReturnsCorrectEmail() {
        CustomerDTO result = registry.findCustomer("0701234567");
        assertEquals("anna@mail.com", result.getEmail(), "Email should match sample data.");
    }

    @Test
    public void testFindSecondExistingCustomer() {
        CustomerDTO result = registry.findCustomer("0739876543");
        assertNotNull(result, "Should find second sample customer.");
    }

    @Test
    public void testFindNonExistingCustomerReturnsNull() {
        CustomerDTO result = registry.findCustomer("0000000000");
        assertNull(result, "Should return null for unknown phone number.");
    }

    @AfterEach
    void tearDown() {
        registry = null;
    }
}