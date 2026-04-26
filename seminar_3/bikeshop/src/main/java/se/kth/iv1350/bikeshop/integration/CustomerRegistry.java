package se.kth.iv1350.bikeshop.integration; // Package = integration layer (handles "database" communication)

import se.kth.iv1350.bikeshop.dto.CustomerDTO; // Import our DTO class for passing customer data between layers
import java.util.ArrayList; // ArrayList = a resizable list, used as our "in-memory database"
import java.util.List;      // List = the interface type we use (good practice: program to interface)

/**
 * Handles all communication with the customer database.
 * Stores customers in memory since no real database is used.
 */
public class CustomerRegistry {

    private final List<CustomerDTO> customers; // final = the list reference never changes, only its contents
                                               // private = encapsulation, no other class can access this directly

    /**
     * Creates a new instance and populates it with sample customer data.
     */
    public CustomerRegistry() {
        customers = new ArrayList<>(); // Initialize the list (empty at first)
        addSampleData();               // Fill with fake customers (replaces a real database)
    }

    /**
     * Searches for a customer with the specified phone number.
     *
     * @param phoneNr The phone number to search for.
     * @return The found {@link CustomerDTO}, or <code>null</code> if no customer
     *         with the given phone number exists (alternative flow 5a).
     */
    public CustomerDTO findCustomer(int phoneNr) {
        for (CustomerDTO customer : customers) {        // Loop through every customer in the list
            if (customer.getPhoneNr() == phoneNr) {    // Check if this customer's phone matches
                return customer;                        // Match found — return it immediately
            }
        }
        return null; // No match found — return null (triggers alternative flow 5a in View)
    }

    /**
     * Registers a new customer in the registry.
     *
     * @param customer A {@link CustomerDTO} containing the new customer's data.
     * @return The registered {@link CustomerDTO}.
     */
    public CustomerDTO registerCustomer(CustomerDTO customer) {
        customers.add(customer); // Add the new customer to our in-memory list
        return customer;         // Return it so the caller can confirm what was saved
    }

    // Private helper — not part of public interface, no Javadoc needed
    private void addSampleData() {
        // Hard-coded test data — replaces a real database
        customers.add(new CustomerDTO("Anna Svensson", 701234567, "anna@mail.com"));
        customers.add(new CustomerDTO("Erik Lindgren", 739876543, "erik@mail.com"));
    }
}