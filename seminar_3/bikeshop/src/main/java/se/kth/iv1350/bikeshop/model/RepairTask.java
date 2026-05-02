package se.kth.iv1350.bikeshop.model;

import se.kth.iv1350.bikeshop.dto.RepairTaskDTO;
import java.util.List;
import java.util.ArrayList;


public class RepairTask{

    private List<RepairTaskDTO> repairTasks;
    

    /**
     * Adds a repair task to this repair order DTO and updates cost.
     *
     * @param repairTask The {@link RepairTaskDTO} to add.
     */
    public RepairTaskDTO addRepairTask(RepairTaskDTO repairTask) {
        repairTasks.add(repairTask);          // Add task to the list
        totalCost += repairTask.getCost();    // Automatically update total cost when task is added
    }

    /**
     * We want to set the individual cost 
     * @param individualTaskCost
     * @return
     */
     public RepairTaskDTO calculateTaskCost(RepairTaskDTO individualTaskCost){
        double indTaskCost = getCost(RepairTaskDTO);
        return RepairTaskDTO;
    }
    


    /**
     * Constructor?
     * @param createdRepairOrder
     * @return
     */
    public RepairTaskDTO createRepairTask(RepairTaskDTO createdRepairOrder){

    }

    //här behöver vi en testmetod som lägger till kostnaden etc.
}


