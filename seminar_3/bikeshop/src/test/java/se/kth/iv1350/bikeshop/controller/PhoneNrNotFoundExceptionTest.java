package se.kth.iv1350.bikeshop.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

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
        Controller controller = new Controller(null, null);
        customer = controller.searchCustomer("0701234567");
        
        assertThrows(null, executable);
    }

    @Test
    public void testIfExceptionIsThrownWhenFailureOccurs(){
        Controller controller = new Controller(null, null);
        PhoneNrNotFoundException testException = assertThrows(PhoneNrNotFoundException.controller, () -> {
            Controller.throwPhoneNrNotFoundException(); });
    }
    
    @Test
    public void testCorrectMessageIsStored() {
        PhoneNrNotFoundException instance = new PhoneNrNotFoundException();
        String result = instance.getMessage();
        assertEquals("The searched phone number is not found", result);
    }

    @Test
    public void testIfCatchBlocksAreHandledCorrectly(){

    }
}