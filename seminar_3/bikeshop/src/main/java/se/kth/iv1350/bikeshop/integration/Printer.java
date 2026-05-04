package se.kth.iv1350.bikeshop.integration;

import se.kth.iv1350.bikeshop.dto.RepairOrderDTO;
import se.kth.iv1350.bikeshop.dto.RepairTaskDTO;
import se.kth.iv1350.bikeshop.model.RepairOrder.RepairOrderState;

/**
 * Handles printing of repair orders to System.out.
 * Represents the external printer system.
 */
public class Printer {

    /**
     * Creates a new instance of the printer.
     */
    public Printer() {
    }

    /**
     * Prints the specified repair order if its state is ACCEPTED.
     *
     * @param repairOrder The {@link RepairOrderDTO} to print.
     * @param state       The current state of the repair order.
     */
    public void printRepairOrder(RepairOrderDTO repairOrder, RepairOrderState state) {
        if (state == RepairOrderState.ACCEPTED) {
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
            System.out.println("Status    : " + state);
            System.out.println("====================\n");
        }
    }
}
