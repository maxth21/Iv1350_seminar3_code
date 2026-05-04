package se.kth.iv1350.bikeshop.model;

import java.util.ArrayList;
import java.util.List;

import se.kth.iv1350.bikeshop.dto.RepairTaskDTO;

/**
 * RepairOrders are handled in this class.
 * Needs to import all DTO classes, RepairTask, registries! check how to import 
 */

public class RepairOrder{ 

    public enum RepairOrderState {
        NEWLY_CREATED,
        READY_FOR_APPROVAL,
        REJECTED,
        ACCEPTED
    }

    //list of repairtasks
    private List<RepairTaskDTO > repairTasks;
    //totalCostInMOdel är et fält som model behöver för att det vi skapar ska kunna fortsätta existera så länge objektet finns
    private double totalCostInModel;

    private RepairOrderState state;

      
    //konstruktor av RO
    public RepairOrder (List<RepairTaskDTO> repairTaskList){
        this.repairTasks = new ArrayList<>();
        this.totalCostInModel = 0.0; 
    }

    //getter method for totalCost
    public double TotalCostInModel (){
        return totalCostInModel;
    }

    //getter for repairstasks list
    public List<RepairTaskDTO> getrepairTasks(){
        return repairTasks;
    } 
    //get method for enum
    public RepairOrderState getState(){
        return state; 
    }


    
    /**
    *Returns the total cost of repairtasks, which are calculated by addRepairTask 
    * 
    */
    public double readTotalCost(RepairTask newTask){ 
        return totalCostInModel;
    }
        
    /**
    *Changes the state of the repairOrder to accepted 
    *  
    * Marks accepted order as true,
    * alternative flow as false or handled via exception later
    */
    public void changeStateOfRepairOrder(RepairOrderState state) {
        this.state = state;
    }
    
    /**
     * adds a cost to the task 
     * @param addedRepairTask
     */
    public void addRepairTaskCost(RepairTaskDTO addedRepairTask) {
        totalCostInModel += addedRepairTask.getCost();    // Automatically update total cost when task is added
    }

}