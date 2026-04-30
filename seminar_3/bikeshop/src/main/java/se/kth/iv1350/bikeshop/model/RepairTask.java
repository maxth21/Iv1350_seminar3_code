package se.kth.iv1350.bikeshop.model;

import se.kth.iv1350.bikeshop.dto.RepairTaskDTO;
import java.util.List;
import java.util.ArrayList;


public class RepairTask{

    private List<RepairTaskDTO> addRepairTasks;
    

    /**
     * Adds a repair task to this repair order DTO.
     *
     * @param repairTask The {@link RepairTaskDTO} to add.
     */
    public RepairTaskDTO addRepairTask(RepairTaskDTO repairTask) {
        repairTasks.add(repairTask);          // Add task to the list
        totalCost += repairTask.getCost();    // Automatically update total cost when task is added
    }

    
    public RepairTaskDTO calculateTaskCost(){
        return RepairTaskDTO;
    }

    public RepairTaskDTO createRepairTask(RepairTaskDTO createdRepairOrder){

    }

    public double calculateTotalCost(){

    }

}


