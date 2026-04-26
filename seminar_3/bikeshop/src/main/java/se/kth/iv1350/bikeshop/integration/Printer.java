package se.kth.iv1350.bikeshop.integration;

import se.kth.iv1350.bikeshop.dto.RepairOrderDTO;
import se.kth.iv1350.bikeshop.dto.RepairTaskDTO;

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

    /**
     * Prints the specified repair order to {@link System#out}.
     *
     * @param repairOrder The {@link RepairOrderDTO} to print.
     */
    public void printRepairOrder(RepairOrderDTO repairOrder) {
        System.out.println("\n=== REPAIR ORDER ===");
        System.out.println("Order ID  : " + repairOrder.getRepairOrderId());
        System.out.println("Customer  : " + repairOrder.getCustomer().getName());
        System.out.println("Phone     : " + repairOrder.getCustomer().getPhoneNr());
        System.out.println("Bike      : " + repairOrder.getBike().getBrand()
                + " " + repairOrder.getBike().getModel()
                + " (S/N: " + repairOrder.getBike().getSerialNr() + ")");
        System.out.println("Problem   : " + repairOrder.getProblemDescription());
        System.out.println("--- Tasks ---");
        for (RepairTaskDTO task : repairOrder.getRepairTasks()) {
            System.out.println("  " + task.getName()
                    + " - " + task.getDescription()
                    + " : " + task.getCost() + " kr");
        }
        System.out.println("Total cost: " + repairOrder.getTotalCost() + " kr");
        System.out.println("State     : " + repairOrder.getState());
        System.out.println("====================\n");
    }
}