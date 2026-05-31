package se.kth.iv1350.bikeshop.integration; // Integration layer — handles all "external system" communication

/**
 * Creates and provides access to all registries in the system.
 * Ensures that only one instance of each registry exists.
 */
public class RegistryCreator {

    private final CustomerRegistry customerRegistry;       // final = created once, never replaced
    private final RepairOrderRegistry repairOrderRegistry; // final = same reason, ensures consistency
    private final BikeRegistry bikeRegistry;

    /**
     * Creates a new instance and initializes all registries.
     */
    public RegistryCreator() {
        customerRegistry = new CustomerRegistry();             // Create the one CustomerRegistry for the whole program
        repairOrderRegistry = new RepairOrderRegistry();       // Create the one RepairOrderRegistry for the whole program
        bikeRegistry = new BikeRegistry();
    }
    // Why RegistryCreator exists:
    // Controller should not create registries itself (that would be high coupling).
    // Instead, Main creates RegistryCreator and passes it to Controller — low coupling!

    /**
     * Returns the {@link CustomerRegistry}.
     *
     * @return The customer registry.
     */
    public CustomerRegistry getCustomerRegistry() {
        return customerRegistry; // Give caller access to customer registry (read-only reference)
    }

    /**
     * Returns the {@link RepairOrderRegistry}.
     *
     * @return The repair order registry.
     */
    public RepairOrderRegistry getRepairOrderRegistry() {
        return repairOrderRegistry; // Give caller access to repair order registry (read-only reference)
    }
       /**
     * Returns the {@link BikeRegistry}.
     *
     * @return The bike registry.
     */
    public BikeRegistry getBikeRegistry() {
        return bikeRegistry;
    }
}    
