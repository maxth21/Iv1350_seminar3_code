package se.kth.iv1350.bikeshop.integration;
                                              
import java.util.ArrayList;
import java.util.List;

import se.kth.iv1350.bikeshop.dto.BikeDTO;

/**
 * Handles all communication with the bike database.
 * Stores bikes in memory since no real database is used.
 */
public class BikeRegistry { // Representerar cykel-databasen
                             // I verkligheten skulle den anropa en riktig databas

/**
* Creates a new instance of BikeRegistry.
*/
private final List<BikeDTO> bikes;

public BikeRegistry() {
        bikes = new ArrayList<>();
        bikes.add(new BikeDTO("Trek", "FX3", "SN-001"));
    }

    /**
    * Finds a bike registered to the customer with the specified phone number.
    *
    * @param phoneNr The phone number of the customer.
    * @return The found {@link BikeDTO}, or <code>null</code> if no bike
    *         was found for the given phone number.
    */
    public BikeDTO findBike(String phoneNr) {
            if (phoneNr.equals("0701234567")) {
                return bikes.get(0);
            } 
            return null;
        }

}
