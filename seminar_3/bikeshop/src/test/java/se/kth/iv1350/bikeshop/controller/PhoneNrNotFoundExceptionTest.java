package se.kth.iv1350.bikeshop.controller;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import se.kth.iv1350.bikeshop.integration.Printer;
import se.kth.iv1350.bikeshop.integration.RegistryCreator;
import se.kth.iv1350.bikeshop.util.FileLogger;

public class PhoneNrNotFoundExceptionTest {

    private Controller controller;

    @BeforeEach
    public void setUp() {
        controller = new Controller(new RegistryCreator(), new Printer());
        controller.setLogger(new FileLogger());
    }

    @Test
    public void testNoExceptionDuringSuccessfulExecution() {
        assertDoesNotThrow(() -> controller.searchCustomer("0701234567"));
    }

    @Test
    public void testIfExceptionIsThrownWhenFailureOccurs() {
        assertThrows(PhoneNrNotFoundException.class, () -> {
            controller.searchCustomer("1111111111");
        });
    }

    @Test
    public void testCorrectMessageIsStored() {
        PhoneNrNotFoundException instance = new PhoneNrNotFoundException();
        assertEquals("The searched phone number is not found", instance.getMessage());
    }

    @Test
    public void testIfCatchBlocksAreHandledCorrectly() {
        try {
            controller.searchCustomer("9999999999");
        } catch (PhoneNrNotFoundException e) {
            assertEquals("The searched phone number is not found", e.getMessage());
        }
    }
}
