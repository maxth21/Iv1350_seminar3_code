package se.kth.iv1350.bikeshop.dto;

/**
 * DTO with details about customer
 */

public class CustomerDTO{

    private final String name;
    private String phoneNr;
    private String email;

    /**
     * Constructor for CustomerDTO
     * @param name the name of the customer
     * @param phoneNr the phone number of the customer
     * @param email the email of the customer
     */

    public CustomerDTO(String name, String phoneNr, String email){
        this.name = name;
        this.phoneNr = phoneNr;
        this.email = email;
    }

    /**
     * Get method for returning the name
     * @return name
     */

    public String getName(){
        return name;
    }

    /**
     * Get method for returning the phone number
     * @return phoneNr
     */

    public String getPhoneNr(){
        return phoneNr;
    }

    /**
     * Get method for returning the email
     * @return email
     */

    public String getEmail(){
        return email;
    }

}