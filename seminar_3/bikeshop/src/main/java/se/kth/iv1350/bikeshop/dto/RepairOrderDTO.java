package se.kth.iv1350.bikeshop.dto; // DTO layer — only holds data, no business logic

import se.kth.iv1350.bikeshop.model.RepairOrder.RepairOrderState; // ArrayList = resizable list, used to store repair tasks


/**
 * Data transfer object for a repair order.
 * Used to transfer repair order data between layers without
 * exposing the internal {@link se.kth.iv1350.bikeshop.model.RepairOrder} object.
 */
public class RepairOrderDTO {

    /**
     * Hard-coded value for date in order to test the program
    */
    //public final int CURRENT_DATE = 260504;

    private final String repairOrderId;        // final = ID never changes after creation
    private final String problemDescription;    // final = problem description never changes
    private final int date;
    private int estimatedCompletionDate;
    private double totalCost;                   // NOT final = changes when repair tasks are added
    private RepairOrderState STATE;                       // NOT final = changes when order is accepted/rejected
   
    /**
     * Creates a new instance with the specified repair order data
     *
     * @param repairOrderId             The unique ID of the repair order
     * @param problemDescription        A description of the reported problem
     * @param date                      The date where bike was recieved
     * @param estimatedCompletitionDate Estimated date for completing bike reparation
     * @param RepairOrderState                  The current state of the repair order
     * @param totalCost                 The total cost of all repair tasks
     */

    public RepairOrderDTO(CustomerDTO customerDTO, BikeDTO bikeDTO, String repairOrderId, String problemDescription, int date, int estimatedCompletitionDate, RepairOrderState STATE, double totalCost) {
        this.repairOrderId = repairOrderId;         // Store the unique order ID
        this.problemDescription = problemDescription; // Store the reported problem
        this.date = date;
        this.estimatedCompletionDate = estimatedCompletitionDate;
        //this.ACCEPTED = ACCEPTED;                       // Store initial state (e.g. "created")
        this.totalCost = totalCost;                  // Store initial cost (usually 0.0 at creation)
    }


    /** @return The unique repair order ID. */
    public String getRepairOrderId(){
        return repairOrderId;
    }

    /** @return The problem description. */
    public String getProblemDescription(){
        return problemDescription;
    }
    
    /** @return The date. */
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
       public RepairOrderState getSTATE() {
        return STATE;
    }

}