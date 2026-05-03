package se.kth.iv1350.bikeshop.integration;

import se.kth.iv1350.bikeshop.dto.BikeDTO;
import se.kth.iv1350.bikeshop.dto.CustomerDTO;
import se.kth.iv1350.bikeshop.dto.RepairOrderDTO;
import se.kth.iv1350.bikeshop.dto.RepairTaskDTO;
import se.kth.iv1350.bikeshop.model.RepairOrder.RepairOrderState;

/**
 * Handles printing of repair orders.
 * Represents the external printer system.
 */
public class Printer {

    /**
     * Creates a new instance of the printer.
     */
    public Printer() {
    }

    PrinterParameters param = new PrinterParameters(null, null, null, null, false)
    /**
     * Prints the specified repair order to {@link System#out}.
     *
     * @param repairOrder The {@link RepairOrderDTO} to print.
     */
    public void printRepairOrder(RepairOrderDTO repairOrder, CustomerDTO customer, BikeDTO bike, RepairTaskDTO repairTask, boolean accepted) {
        if(RepairOrderState = ACCEPTED){
            System.out.println("\n=== REPAIR ORDER ===");
            System.out.println("Order ID  : " + repairOrder.getRepairOrderId());
            System.out.println("Customer  : " + customer.getName());
            System.out.println("Phone     : " + customer.getPhoneNr());
            System.out.println("Bike      : " + bike.getBrand()
                    + " " + bike.getModel()
                    + " (S/N: " + bike.getSerialNr() + ")");
            System.out.println("Problem   : " + repairOrder.getProblemDescription());
            System.out.println("--- Tasks ---");
            for (RepairTaskDTO task : repairOrder.getRepairTasks()) {
                System.out.println("  " + task.getName()
                        + " - " + task.getDescription()
                        + " : " + task.getTotalCost() + " kr");
            }
            System.out.println("Total cost: " + repairOrder.getTotalCost() + " kr");
            System.out.println("State     : " + repairOrder.getAccepted());
            System.out.println("====================\n");
        }
    }
}