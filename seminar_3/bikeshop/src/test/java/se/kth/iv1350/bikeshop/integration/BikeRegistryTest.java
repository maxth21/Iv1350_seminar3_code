package se.kth.iv1350.bikeshop.integration;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BikeRegistryTest {

    private BikeRegistry registry;

    @BeforeEach
    public void setUp() {
        registry = new BikeRegistry();
    }

    @Test
    public void testIfObjectIsCreated() {
        assertNotNull(registry, "BikeRegistry object should be created.");
    }

    @Test
    public void testFindExistingBikeReturnsNotNull() {
        assertNotNull(registry.findBike("0701234567"),
                "findBike should return a BikeDTO for a known phone number.");
    }

    @Test
    public void testFindBikeWithUnknownPhoneNumberReturnsNull() {
        assertNull(registry.findBike("0000000000"),
                "findBike should return null for an unknown phone number.");
    }

    @AfterEach
    void tearDown() {
        registry = null;
    }
}
