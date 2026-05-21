package se.kth.iv1350.bikeshop.integration;

public class UnknownPhoneNrException extends Exception{
    public UnknownPhoneNrException(){
        super("Message to developer: The phone number does not exist in the system");
    }
}