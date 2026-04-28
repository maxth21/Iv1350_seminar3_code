package se.kth.iv1350.bikeshop.dto; // DTO layer — only holds data, no business logic

import java.util.ArrayList; // ArrayList = resizable list, used to store repair tasks
import java.util.List;      // List = interface type (good practice: program to interface)

/**
 * Data transfer object for a repair order.
 * Used to transfer repair order data between layers without
 * exposing the internal {@link se.kth.iv1350.bikeshop.model.RepairOrder} object.
 */
public class RepairOrderDTO {

    private final String repairOrderId;        // final = ID never changes after creation
    private final CustomerDTO customer;         // final = customer never changes on this order
    private final BikeDTO bike;                 // final = bike never changes on this order
    private final String problemDescription;    // final = problem description never changes
    private double totalCost;                   // NOT final = changes when repair tasks are added
    private String state;                       // NOT final = changes when order is accepted/rejected
    private final List<RepairTaskDTO> repairTasks; // final = list reference never changes, only its contents

    /**
     * Creates a new instance with the specified repair order data.
     *
     * @param repairOrderId      The unique ID of the repair order.
     * @param customer           The {@link CustomerDTO} for the customer.
     * @param bike               The {@link BikeDTO} for the bike.
     * @param problemDescription A description of the reported problem.
     * @param totalCost          The total cost of all repair tasks.
     * @param state              The current state of the repair order.
     */
    public RepairOrderDTO(String repairOrderId, CustomerDTO customer, BikeDTO bike,
                          String problemDescription, double totalCost, String state) {
        this.repairOrderId = repairOrderId;         // Store the unique order ID
        this.customer = customer;                    // Store customer data (as DTO, not model object)
        this.bike = bike;                            // Store bike data (as DTO, not model object)
        this.problemDescription = problemDescription; // Store the reported problem
        this.totalCost = totalCost;                  // Store initial cost (usually 0.0 at creation)
        this.state = state;                          // Store initial state (e.g. "created")
        this.repairTasks = new ArrayList<>();        // Start with empty task list — tasks added later
    }


    /**
     * Adds a repair task to this repair order DTO.
     *
     * @param repairTask The {@link RepairTaskDTO} to add.
     */
    public void addRepairTask(RepairTaskDTO repairTask) {
        repairTasks.add(repairTask);          // Add task to the list
        totalCost += repairTask.getCost();    // Automatically update total cost when task is added
    }


    /** @return The unique repair order ID. */
    public String getRepairOrderId() { return repairOrderId; }

    /** @return The customer data. */
    public CustomerDTO getCustomer() { return customer; }

    /** @return The bike data. */
    public BikeDTO getBike() { return bike; }

    /** @return The problem description. */
    public String getProblemDescription() { return problemDescription; }

    /** @return The total cost of all repair tasks. */
    public double getTotalCost() { return totalCost; }

    /** @return The current state of the repair order. */
    public String getState() { return state; }

    /** @return A list of all repair tasks added to this order. */
    public List<RepairTaskDTO> getRepairTasks() {
        return new ArrayList<>(repairTasks); // Return a COPY — protects encapsulation, caller cannot modify our list
    }

    /**
     * Updates the state of this repair order.
     *
     * @param newState The new state to set.
     */
    public void setState(String newState) {
        this.state = newState; // Update state, e.g. "accepted" or "rejected"
    }
}