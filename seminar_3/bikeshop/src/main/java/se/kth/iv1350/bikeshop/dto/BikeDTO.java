package se.kth.iv1350.bikeshop.dto;

/**
 * Data transfer object for a bike.
 * Used to pass bike data between layers without exposing model internals.
 */
public class BikeDTO {

    private final String brand;
    private final String model;
    private final String serialNr;
    private final String ownerPhoneNr;

    /**
     * Creates a new bike DTO.
     *
     * @param brand        The manufacturer of the bike.
     * @param model        The model name.
     * @param serialNr     The unique serial number.
     * @param ownerPhoneNr The phone number of the customer who owns the bike.
     */
    public BikeDTO(String brand, String model, String serialNr, String ownerPhoneNr) {
        this.brand = brand;
        this.model = model;
        this.serialNr = serialNr;
        this.ownerPhoneNr = ownerPhoneNr;
    }

    /** @return The manufacturer of the bike. */
    public String getBrand() {
        return brand;
    }

    /** @return The model name. */
    public String getModel() {
        return model;
    }

    /** @return The unique serial number. */
    public String getSerialNr() {
        return serialNr;
    }

    /** @return The phone number of the customer who owns this bike. */
    public String getOwnerPhoneNr() {
        return ownerPhoneNr;
    }
}
