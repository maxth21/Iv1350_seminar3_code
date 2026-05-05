package se.kth.iv1350.bikeshop.integration; // Tillhör integration-lagret
                                              // integration = kommnicerar med externa system

import se.kth.iv1350.bikeshop.dto.BikeDTO; // Importerar BikeDTO eftersom
                                            // findBike returnerar en BikeDTO

/**
 * Handles all communication with the bike database.
 * Stores bikes in memory since no real database is used.
 */
public class BikeRegistry { // Representerar cykel-databasen
                             // I verkligheten skulle den anropa en riktig databas

/**
* Creates a new instance of BikeRegistry.
*/
public BikeRegistry() { // Tom konstruktor — ingen data behövs vid skapandet 
                        // Tom konstruktor — krävs för att RegistryCreator
                        // ska kunna skapa objektet med "new BikeRegistry()"
    }                        // RegistryCreator skapar denna klass

/**
* Finds a bike registered to the customer with the specified phone number.
*
* @param phoneNr The phone number of the customer.
* @return The found {@link BikeDTO}, or <code>null</code> if no bike
*         was found for the given phone number.
*/
public BikeDTO findBike(String phoneNr) { // Tar telefonnummer som parameter
                                               // eftersom cykeln är kopplad till kunden
        return null; // Returnerar null tills riktig databas finns
                     // I verkligheten skulle den söka i databasen
    }
}
