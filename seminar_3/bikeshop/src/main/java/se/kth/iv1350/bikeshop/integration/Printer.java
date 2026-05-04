package se.kth.iv1350.bikeshop.integration;

import se.kth.iv1350.bikeshop.dto.BikeDTO;
import se.kth.iv1350.bikeshop.dto.CustomerDTO;
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
    public void printRepairOrder(PrinterParameters param) { //behöver skapa ett objekt av param i controllern där man vet vilka inparamterar som ska in.

        if(param.accepted = true){
            System.out.println("\n=== REPAIR ORDER ===");
            System.out.println("Order ID  : " + param.getRepairOrderId());
            System.out.println("Customer  : " + param.customer.getName());
            System.out.println("Phone     : " + param.customergetPhoneNr());
            System.out.println("Bike      : " + param.getBrand()
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