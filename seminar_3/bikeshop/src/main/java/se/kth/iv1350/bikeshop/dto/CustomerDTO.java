package se.kth.iv1350.bikeshop.dto;
import java.util.List;
/**
 * DTO with details about customer
 */

public class CustomerDTO{

    private String name;
    private String phoneNr;
    private String email;

    public CustomerDTO(String name, String phoneNr, String email){
        this.name = name;
        this.phoneNr = phoneNr;
        this.email = email;
    }

    public String getName(){
        return name;
    }

    public String getPhoneNr(){
        return phoneNr;
    }

    public String getEmail(){
        return email;
    }

}