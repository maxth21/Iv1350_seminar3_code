package se.kth.iv1350.bikeshop.controller;

import se.kth.iv1350.bikeshop.dto.BikeDTO;
import se.kth.iv1350.bikeshop.dto.CustomerDTO;
import se.kth.iv1350.bikeshop.dto.DiagnosticReportDTO;
import se.kth.iv1350.bikeshop.dto.RepairOrderDTO;
import se.kth.iv1350.bikeshop.dto.RepairTaskDTO;
import se.kth.iv1350.bikeshop.integration.Printer;
import se.kth.iv1350.bikeshop.integration.RegistryCreator;
import se.kth.iv1350.bikeshop.model.RepairOrder;
import se.kth.iv1350.bikeshop.model.DiagnosticReport;


/**
 * Handles all calls between the view and the model and integration layers.
 * No business logic belongs here; it only delegates to the correct layer.
 */
public class Controller {

    private final RegistryCreator registryCreator;
    private final Printer printer;
    private RepairOrder currentRepairOrder;

    /**
     * Creates a new instance of the controller.
     *
     * @param registryCreator Provides access to all registries.
     * @param printer         The printer used to print repair orders.
     */
    public Controller(RegistryCreator registryCreator, Printer printer) {
        this.registryCreator = registryCreator;
        this.printer = printer;
    }

    /**
     * Searches for a customer with the specified phone number.
     *
     * @param phoneNr The phone number to search for.
     * @return The found {@link CustomerDTO}, or {@code null} if no match exists.
     */
    public CustomerDTO searchCustomer(String phoneNr) {
        return registryCreator.getCustomerRegistry().findCustomer(phoneNr);
    }

    /**
     * Searches for a bike registered to the customer with the specified phone number.
     *
     * @param phoneNr The customer's phone number.
     * @return The found {@link BikeDTO}, or {@code null} if no match exists.
     */
    public BikeDTO searchBike(String phoneNr) {
        return registryCreator.getBikeRegistry().findBike(phoneNr);
    }

    /**
     * Creates a new repair order and saves it to the registry.
     *
     * @param customer           The customer who owns the bike.
     * @param bike               The bike to be repaired.
     * @param problemDescription A description of the reported problem.
     * @return A {@link RepairOrderDTO} representing the created order.
     */
    public RepairOrderDTO createRepairOrder(CustomerDTO customer, BikeDTO bike,
                                            DiagnosticReportDTO problemDescription, int date) {
        currentRepairOrder = new RepairOrder(customer, bike, problemDescription, date);
        RepairOrderDTO dto = currentRepairOrder.getRepairOrderDTO();
        registryCreator.getRepairOrderRegistry().saveRepairOrder(dto);
        return dto;
    }

    /**
     * Adds a repair task to the current repair order.
     *
     * @param name        The name of the task.
     * @param description A description of the work involved.
     * @param cost        The cost of the task in SEK.
     * @return The added {@link RepairTaskDTO}.
     */
    public RepairTaskDTO addRepairTask(String name, String description, double cost, boolean state) {
        RepairTaskDTO task = new RepairTaskDTO(name, description, cost, state);
        return task;
    }

    /**
     * Marks the current repair order as accepted or rejected.
     * Sends the order to the printer if it is accepted.
     *
     * @param accepted {@code true} if the customer accepts, {@code false} if rejected.
     * @return The acceptance status that was set.
     */
    public enum setOrderStatus()) {
        currentRepairOrder.setAccepted(accepted);
        printer.printRepairOrder(currentRepairOrder.getRepairOrderDTO(), accepted);
        return accepted;
    }

    public DiagnosticReport addDiagnosticReport(){

    }

    public updateRepairOrder(){

    }

    /**
    * Prints the current repair order.
    */
    public printRepairOrder(){

    }

    
}
