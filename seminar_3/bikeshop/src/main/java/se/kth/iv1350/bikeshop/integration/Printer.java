package se.kth.iv1350.bikeshop.integration;

import se.kth.iv1350.bikeshop.dto.RepairOrderDTO;
import se.kth.iv1350.bikeshop.dto.RepairTaskDTO;

/**
 * Handles printing of repair orders.
 * Represents the external printer system.
 */
public class Printer{

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
    public void printRepairOrder(PrinterParameters param) { //behöver skapa ett objekt av param i controllern där man vet vilka inparametrar som ska in.
        
            System.out.println("\n=== REPAIR ORDER ===");
            System.out.println("Order ID  : " + param.getRepairOrderDTO().getRepairOrderId());
            System.out.println("Customer  : " + param.getCustomerDTO().getName());
            System.out.println("Phone     : " + param.getCustomerDTO().getPhoneNr());
            System.out.println("Bike      : " + param.getBikeDTO().getBrand()
                    + " " + param.getBikeDTO().getModel()
                    + " (S/N: " + param.getBikeDTO().getSerialNr() + ")");
            System.out.println("Problem   : " + param.getDiagnosticReportDTO().getProblemDescription());
            System.out.println("--- Tasks ---");
            
            for (RepairTaskDTO task : param.getRepairTasksList()) {
                System.out.println("  " + task.getName()
                        + " - " + task.getDescription() 
                        + " : " + task.getCost() + " kr");
            }
            
            System.out.println("Total cost: " + param.getRepairOrder().getTotalCostOfRepairTasks() + " kr");
            System.out.println("State     : " + param.getRepairOrder().getState());
            System.out.println("====================\n");
    
    }
}
