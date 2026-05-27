package se.kth.iv1350.bikeshop.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import se.kth.iv1350.bikeshop.dto.CustomerDTO;

public class PhoneNrNotFoundExceptionTest{

    private CustomerDTO customer;
    private Controller controller;
    

    @BeforeEach
    public void setUp(){
       // controller = new Controller();
    }
    

    @Test
    public void testNoExceptionDuringSuccesfulExecution()throws PhoneNrNotFoundException{

        customer = controller.searchCustomer("0701234567");
    }

    @Test
    public void testIfExceptionIsThrownWhenFailureOccurs(){

    }
    
    @Test
    public void testCorrectMessageIsStored() {
        PhoneNrNotFoundException instance = new PhoneNrNotFoundException();
        String result = instance.getMessage();
        assertEquals("Message to user: The searched phone number is not found", result);
    }

    @Test
    public void testIfCatchBlocksAreHandledCorrectly(){

    }
}