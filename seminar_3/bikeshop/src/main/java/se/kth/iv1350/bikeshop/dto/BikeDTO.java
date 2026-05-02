package se.kth.iv1350.bikeshop.dto;

/**
 * This is a DTO for information about the Bike
 */

public class BikeDTO{
    private final String brand;
    private final String model;
    private final String serialNr;

    /**
     * Constructor for class BikeDTO
     * @param brand The company that makes the bike
     * @param model The model created by the company
     * @param serialNr An identifying number for specific bike
     */

    public BikeDTO(String brand, String model, String serialNr){
        this.brand = brand;
        this.model = model;
        this.serialNr = serialNr;
    }

    /**
     * Get method for returning the brand
     * @return brand
     */

    public String getBrand(){
        return brand;
    }

    /**
     * Get method for returning the model
     * @return model
     */

    public String getModel(){
        return model;
    }

    /**
     * Get method for returning the serial number
     * @return serialNr
     */

    public String getSerialNr(){
        return serialNr;
    }
}