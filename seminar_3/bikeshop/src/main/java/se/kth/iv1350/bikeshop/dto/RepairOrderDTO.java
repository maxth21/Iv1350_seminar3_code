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
    private final String customersProblemDescription;    // final = problem description never changes
    private final int date;
    private int estimatedCompletionDate;
    private RepairOrderState state;                       // NOT final = changes when order is accepted/rejected
    private CustomerDTO customerDTO;
    private BikeDTO bikeDTO;
    
   
    /**
     * Creates a new instance with the specified repair order data
     *
     * @param repairOrderId             The unique ID of the repair order
     * @param customersProblemDescription A description of the reported problem
     * @param date                      The date where bike was recieved
     * @param estimatedCompletitionDate Estimated date for completing bike reparation 
     * @param RepairOrderState                  The current state of the repair order
     */

    public RepairOrderDTO(String repairOrderId, String customersProblemDescription, int date, int estimatedCompletitionDate, RepairOrderState STATE) {
        this.repairOrderId = repairOrderId;         // Store the unique order ID
        this.customersProblemDescription = customersProblemDescription; // Store the reported problem
        this.date = date;
        this.estimatedCompletionDate = estimatedCompletitionDate;
        this.customerDTO = customerDTO;
        this.bikeDTO = bikeDTO;
        this.state = state;

    }

    /** @return The unique repair order ID. */
    public String getRepairOrderId(){
        return repairOrderId;
    }

    /** @return The problem description. */
    public String getCustomersProblemDescription(){
        return customersProblemDescription;
    }
    
    /** @return The date. */
    public int getDate() {
        return date;
    }

     /** @return The total cost of all repair tasks. */
    public int getEstimatedCompletionDate() {
        return estimatedCompletionDate;
    }

}