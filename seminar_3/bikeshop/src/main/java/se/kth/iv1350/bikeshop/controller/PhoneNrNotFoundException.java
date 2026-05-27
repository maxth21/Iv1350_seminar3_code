package se.kth.iv1350.bikeshop.controller;

/**
 * Exception class handling when phone number is missing. Extends the superclass Exception. 
 */
public class PhoneNrNotFoundException extends Exception{
    public PhoneNrNotFoundException(){
        super("The searched phone number is not found");
    }
}
