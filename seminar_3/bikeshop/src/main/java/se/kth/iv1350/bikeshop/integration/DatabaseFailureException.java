package se.kth.iv1350.bikeshop.integration;

public class DatabaseFailureException extends Exception{
    public DatabaseFailureException(){
        super("It is not possible to call the database");
    }
}
