package se.kth.iv1350.bikeshop.view;

import java.time.LocalDate;

import se.kth.iv1350.bikeshop.controller.Controller;
import se.kth.iv1350.bikeshop.controller.PhoneNrNotFoundException;
import se.kth.iv1350.bikeshop.dto.BikeDTO;
import se.kth.iv1350.bikeshop.dto.CustomerDTO;
import se.kth.iv1350.bikeshop.dto.DiagnosticReportDTO;
import se.kth.iv1350.bikeshop.dto.RepairOrderDTO;
import se.kth.iv1350.bikeshop.dto.RepairTaskDTO;
import se.kth.iv1350.bikeshop.model.RepairOrder.RepairOrderState;
import se.kth.iv1350.bikeshop.util.Logger;




/**
 * The application's only view.
 * Simulates the user interface by making hard-coded calls to the controller
 * and printing every value returned.
 */
public class View {

    private final Controller controller;

    /**
     * Creates a new instance that delegates all calls to the specified controller.
     *
     * @param controller The controller to use.
     */
    public View(Controller controller) {
        this.controller = controller;
    }

    private Logger logger;

    /**
     * Logger client that prints messages to the logger
     */

    public void setLogger(Logger logger) {
        this.logger = logger;
    }

    /**
     * Runs the simulated basic flow for the "Repair Electric Bike" use case.
     * Prints everything returned by the controller.
     */
    public void run() {
        System.out.println("--- Step 1: Search for customer ---");

        CustomerDTO customer; 

        try{controller.searchCustomer("0701234567");
        }   catch(PhoneNrNotFoundException ex){
            
            logger.log(2 + "    User was notified ");
            System.out.println(ex.getMessage());
            return;
        }
        //client.searchCustomer("0701234567");

        try{customer = controller.searchCustomer("0701234567");
        }   catch (PhoneNrNotFoundException exc){
            System.out.println(exc.getMessage());
            return;
        }

        System.out.println("Customer name  : " + customer.getName());
        System.out.println("Customer phone : " + customer.getPhoneNr());
        System.out.println("Customer email : " + customer.getEmail());
 
        System.out.println("\n--- Step 2: Search for bike ---");
        BikeDTO bike = controller.searchBike("0701234567");
        System.out.println("Bike brand  : " + bike.getBrand());
        System.out.println("Bike model  : " + bike.getModel());
        System.out.println("Serial nr   : " + bike.getSerialNr());
 
        System.out.println("\n--- Step 3: Create repair order ---");
        String problemDescription = "Battery does not charge";
        LocalDate currentDate = LocalDate.now();
        RepairOrderDTO order = controller.createRepairOrder(customer, bike, problemDescription, currentDate);
        System.out.println("Order ID    : " + order.getRepairOrderId());
        System.out.println("Problem     : " + order.getProblemDescription());
        System.out.println("Date        : " + currentDate);

        
        System.out.println("\n--- Step 4: Add Diagnostic Report ---");
        DiagnosticReportDTO report = controller.addDiagnosticReport("Battery has faulty cells");
        System.out.println("Diagnostic Report : " + report.getDiagnosticReport());

        System.out.println("\n--- Step 5: Add repair tasks ---");
        RepairTaskDTO task1 = controller.addRepairTask(
                "Battery replacement", "Replace battery module", 500.0);
        System.out.println("Task added  : " + task1.getName());
        System.out.println("Description : " + task1.getDescription());
        System.out.println("Cost        : " + task1.getCost() + " kr");

        RepairTaskDTO task2 = controller.addRepairTask(
                "Cable inspection", "Inspect and replace faulty cables", 150.0);
        System.out.println("Task added  : " + task2.getName());
        System.out.println("Description : " + task2.getDescription());
        System.out.println("Cost        : " + task2.getCost() + " kr");

        System.out.println("\n--- Step 6: Customer accepts repair order ---");
        //Jag har i alla fall tittat på koden, och ett fel jag såg var att vyn aldrig ska importera något från modellen och integrationslagret, 
        // annat än DTO:er. I den här koden importeras dock både RepairOrder och RepairOrderRegistry.
        //move to registry ?
        controller.setOrderStatus(RepairOrderState.ACCEPTED);
        System.out.println("Order accepted.");
    }
 
}
