package se.kth.iv1350.bikeshop.dto; // DTO layer — only holds data, no business logic

import java.util.ArrayList; // ArrayList = resizable list, used to store repair tasks
import java.util.List;      // List = interface type (good practice: program to interface)

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
    private final int date = 0;
    private int estimatedCompletionDate;
    private double totalCost;                   // NOT final = changes when repair tasks are added
    private boolean accepted;                       // NOT final = changes when order is accepted/rejected
   
    /**
<<<<<<< HEAD
     * Creates a new instance with the specified repair order data.
     * Initializes boolean accepted as false.
     * Uses CURRENT_DATE as hardcoded value so that we cannot change the date after the object has been created.
     * 
=======
     * Creates a new instance with the specified repair order data
>>>>>>> 0665f50bc70ef9cf30c837d97746139113a0f4f0
     *
     * @param repairOrderId             The unique ID of the repair order
     * @param problemDescription        A description of the reported problem
     * @param date                      The date where bike was recieved
     * @param estimatedCompletitionDate Estimated date for completing bike reparation
     * @param accepted                  The current state of the repair order
     * @param totalCost                 The total cost of all repair tasks
     */
<<<<<<< HEAD
    public RepairOrderDTO(String repairOrderId, CustomerDTO customer, BikeDTO bike,
                          String problemDescription, double totalCost, boolean accepted) {
}

    public RepairOrderDTO(String repairOrderId, String problemDescription, int date, int estimatedCompletitionDate, boolean accepted, double totalCost) {
>>>>>>> 0665f50bc70ef9cf30c837d97746139113a0f4f0
        this.repairOrderId = repairOrderId;         // Store the unique order ID
        this.problemDescription = problemDescription; // Store the reported problem
        this.date = date;
        this.estimatedCompletionDate = estimatedCompletitionDate;
        this.accepted = accepted;                       // Store initial state (e.g. "created")
        this.totalCost = totalCost;                  // Store initial cost (usually 0.0 at creation)
<<<<<<< HEAD
        this.accepted = false;                          // Store initial state (e.g. "created")
=======
>>>>>>> 0665f50bc70ef9cf30c837d97746139113a0f4f0
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
    public boolean getAccepted() {
        return accepted;
    }

}