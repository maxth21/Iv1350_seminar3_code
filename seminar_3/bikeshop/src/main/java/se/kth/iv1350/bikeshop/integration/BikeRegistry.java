package se.kth.iv1350.bikeshop.integration;

import java.util.ArrayList;
import java.util.List;
import se.kth.iv1350.bikeshop.dto.BikeDTO;

/**
 * Handles all communication with the bike database.
 * Stores bikes in memory since no real database is used.
 */
public class BikeRegistry {

    private final List<BikeDTO> bikes;

    /**
     * Creates a new instance and populates it with sample bike data.
     */
    public BikeRegistry() {
        bikes = new ArrayList<>();
        addSampleData();
    }

    /**
     * Finds the bike registered to the customer with the specified phone number.
     *
     * @param phoneNr The phone number of the customer.
     * @return The found {@link BikeDTO}, or {@code null} if no bike was found.
     */
    public BikeDTO findBike(String phoneNr) {
        for (BikeDTO bike : bikes) {
            if (bike.getOwnerPhoneNr().equals(phoneNr)) {
                return bike;
            }
        }
        return null;
    }

    private void addSampleData() {
        bikes.add(new BikeDTO("Trek", "FX3", "SN-001", "0701234567"));
        bikes.add(new BikeDTO("Giant", "Escape", "SN-002", "0739876543"));
    }
}
