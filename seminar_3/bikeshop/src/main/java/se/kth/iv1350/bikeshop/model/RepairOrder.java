import java.util.List;

import se.kth.iv1350.bikeshop.dto.RepairOrderDTO;

/**
 * RepairOrders are handled in this class.
 * Needs to import all DTO classes, RepairTask, registries!
 */


//import se.kth.iv1350.bikeshop.controller.Controller;
//import se.kth.iv1350.bikeshop.dto; 

public class RepairOrder{ 

    private double totalCost = 0;
    private String repairOrderInfo = " "; 
    private List<RepairOrderDTO> repairTasks;
    
    RepairTask RepairTasks = new RepairTask();

    public void updateRepairOrder(repairOrderID RepairOrderDTO) {    
        /**
        * updateRepairOrder is used when the RO needs to be updated and saved.
        * method addRepairTasks is using this method in order to be able to add tasks. 
        **/
    }

    public double calculateTotalCost(double cost){ 
        /**
        * Calculates total cost depending on the repairTasks
        */
    }

    public boolean acceptedRepairOrder(String repairOrderID) {
        /**
        * Marks accepted order as true,
        * alternative flow as false
        */
    }


    public createRepairOrder (repairOrderID, customerDTO) {
        /**
        * Creates a new repairorder linked to customer and stores in DTO
        */
    }
}