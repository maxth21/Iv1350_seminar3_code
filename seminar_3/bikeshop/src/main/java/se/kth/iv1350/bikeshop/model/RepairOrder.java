import java.util.List;

package se.kth.iv1350.bikeshop.model;

import se.kth.iv1350.bikeshop.dto.RepairOrderDTO;
import se.kth.iv1350.bikeshop.dto.RepairTaskDTO;
import se.kth.iv1350.bikeshop.dto.BikeDTO; 
import se.kth.iv1350.bikeshop.controller.Controller;

/**
 * RepairOrders are handled in this class.
 * Needs to import all DTO classes, RepairTask, registries! check how to import 
 */

public class RepairOrder{ 

    private double totalCost = 0;
    private String repairOrderInfo = " "; 
    private List<RepairOrderDTO> RepairOrder;
    
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
        cost += getTotalCost(totalCost);
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