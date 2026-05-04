package se.kth.iv1350.bikeshop.view;

import se.kth.iv1350.bikeshop.controller.Controller;
import se.kth.iv1350.bikeshop.dto.BikeDTO;
import se.kth.iv1350.bikeshop.dto.CustomerDTO;
import se.kth.iv1350.bikeshop.dto.RepairOrderDTO;
import se.kth.iv1350.bikeshop.dto.RepairTaskDTO;
import se.kth.iv1350.bikeshop.model.RepairOrder.RepairOrderState;

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

    /**
     * Runs the simulated basic flow for the Repair Electric Bike use case.
     * Prints everything returned by the controller.
     */
    public void run() {
        System.out.println("--- Step 1: Search for customer ---");
        CustomerDTO customer = controller.searchCustomer("0701234567");
        System.out.println("Customer name  : " + customer.getName());
        System.out.println("Customer phone : " + customer.getPhoneNr());
        System.out.println("Customer email : " + customer.getEmail());

        System.out.println("\n--- Step 2: Search for bike ---");
        BikeDTO bike = controller.searchBike("0701234567");
        System.out.println("Bike brand  : " + bike.getBrand());
        System.out.println("Bike model  : " + bike.getModel());
        System.out.println("Serial nr   : " + bike.getSerialNr());

        System.out.println("\n--- Step 3: Create repair order ---");
        RepairOrderDTO order = controller.createRepairOrder(customer, bike, "Battery does not charge");
        System.out.println("Order ID    : " + order.getRepairOrderId());
        System.out.println("Problem     : " + order.getProblemDescription());
        System.out.println("Total cost  : " + order.getTotalCost() + " kr");
        System.out.println("Status      : " + order.getSTATE());

        System.out.println("\n--- Step 4: Add repair tasks ---");
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

        System.out.println("Total cost so far: " + order.getTotalCost() + " kr");

        System.out.println("\n--- Step 5: Customer accepts repair order ---");
        controller.setOrderStatus(RepairOrderState.ACCEPTED);
        System.out.println("Status set to: ACCEPTED");
    }
}
