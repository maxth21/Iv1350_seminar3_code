package se.kth.iv1350.bikeshop.dto;

/**
 * This is a DTO for information about the Bike
 */

public class BikeDTO{
    private String brand;
    private String model;
    private String serialNr;

    public BikeDTO(String brand, String model, String serialNr){
        this.brand = brand;
        this.model = model;
        this.serialNr = serialNr;
    }

    public String getBrand(){
        return brand;
    }

    public String getModel(){
        return model;
    }

    public String getSerialNr(){
        return serialNr;
    }
}