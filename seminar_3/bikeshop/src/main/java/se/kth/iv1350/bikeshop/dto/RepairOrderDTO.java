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
    private final String problemDescription;    // final = problem description never changes
    private final int date;
    private int EstimatedCompletionDate;
    private double totalCost;                   // NOT final = changes when repair tasks are added
    private boolean accepted;                       // NOT final = changes when order is accepted/rejected
   
    /**
     * Creates a new instance with the specified repair order data.
     *
     * @param repairOrderId      The unique ID of the repair order.
     * @param 
     * @param problemDescription A description of the reported problem.
     * @param totalCost          The total cost of all repair tasks.
     * @param accepted           The current state of the repair order.
     */
    public RepairOrderDTO(String repairOrderId, CustomerDTO customer, BikeDTO bike,
                          String problemDescription, double totalCost, String accepted) {
        this.repairOrderId = repairOrderId;         // Store the unique order ID
        this.problemDescription = problemDescription; // Store the reported problem
        this.totalCost = totalCost;                  // Store initial cost (usually 0.0 at creation)
        this.accepted = accepted;                          // Store initial state (e.g. "created")
    }

    /** @return The unique repair order ID. */
    public String getRepairOrderId(){
        return repairOrderId;
    }

    /** @return The problem description. */
    public String getProblemDescription(){
        return problemDescription;
    }
    
    /** @return The total cost of all repair tasks. */
    public int getDate() {
        return date;
    }

    /** @return The total cost of all repair tasks. */
    public double getTotalCost() {
        return totalCost;
    }

     /** @return The total cost of all repair tasks. */
    public int getEstimatedCompletionDate() {
        return estimatedCompletionDate;
    }
    /** @return The current state of the repair order. */
    public String getAccepted() {
        return accepted;
    }

}