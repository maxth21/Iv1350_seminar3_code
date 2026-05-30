package se.kth.iv1350.bikeshop.integration;

import org.junit.jupiter.api.AfterEach;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
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
    public void testIfObjectIsCreated(){
        CustomerRegistry customers = new CustomerRegistry();
        Object ob = null;
        assertNotEquals(customers, ob, "Object should be created");
    }

    /* @Test
    public void testIfNotEmpty(){
        CustomerRegistry customer = new CustomerRegistry();
        List<String> customerData = new ArrayList<>();   
        assertFalse(customer.equals(customerData));
    }
        */
 
    @Test
    public void testIfContainsCorrectPhoneNr() throws UnknownPhoneNrException, DatabaseFailureException {       
        
        CustomerRegistry registry = new CustomerRegistry();
        CustomerDTO customer = registry.findCustomer("0701234567");

        assertEquals("0701234567", customer.getPhoneNr());
    }

      @Test
    public void testIfContainsCorrectName() throws UnknownPhoneNrException, DatabaseFailureException {       
        
        CustomerRegistry registry = new CustomerRegistry();
        CustomerDTO customer = registry.findCustomer("0701234567");

        assertEquals("Anna Svensson", customer.getName());
    }

         @Test
    public void testIfContainsCorrectEmail() throws UnknownPhoneNrException, DatabaseFailureException {       
        
        CustomerRegistry registry = new CustomerRegistry();
        CustomerDTO customer = registry.findCustomer("0701234567");

        assertEquals("anna@mail.com", customer.getEmail());
    }
        

    @Test
    void testFindExistingCustomer() throws UnknownPhoneNrException, DatabaseFailureException {
        CustomerDTO result = registry.findCustomer("0701234567");
        assertNotNull(result, "Should find existing customer.");
    }

    @Test
    void testFindNonExistingCustomerThrowsException() {
        assertThrows(UnknownPhoneNrException.class, () -> {
            registry.findCustomer("0000000000");
        }, "Should throw UnknownPhoneNrException for unknown phone number.");
    }

    @Test
    void testIfDatabaseFailureExceptionIsThrown() throws DatabaseFailureException, UnknownPhoneNrException {
        CustomerRegistry registry = new CustomerRegistry();
    
        DatabaseFailureException exception = assertThrows(DatabaseFailureException.class, () ->
        {
            registry.findCustomer("8888888888");
        });

        String expectedMessage = "It is not possible to call the database";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }

    @AfterEach
    void tearDown() {
        registry = null;
    }
}