package se.kth.iv1350.bikeshop.model;

import se.kth.iv1350.bikeshop.dto.RepairTaskDTO;
import se.kth.iv1350.bikeshop.dto.RepairOrderDTO;


import java.util.List;
import java.util.ArrayList;

/*
RepairTask.java
Problem/Errors:

totalCost användes men var aldrig deklarerad som field
addRepairTask() — lade till i repairTasks men listan var aldrig initialiserad (NullPointerException vid körning)
addRepairTask() — returnerade ingenting trots RepairTaskDTO returtyp
calculateTaskCost() — anropade getCost(RepairTaskDTO) med typ som argument (ogiltig syntax)
calculateTaskCost() — returnerade RepairTaskDTO (typen) istället för ett objekt
createRepairTask() — tom metod utan return-sats trots RepairTaskDTO returtyp
*/
public class RepairTask{

    private List<RepairTaskDTO> repairTasks;

    RepairTask RepairTasks = new RepairTask();
    RepairOrderDTO repairOrderDTO = new RepairOrderDTO(null, null, 0, 0, false, 0);

    //behöver lägga till privat variabel i repairtask-diagrammet
    private double totalCost;
    
    /**
     * Adds a repair task cost to this repair order DTO and updates cost.
     * totalCost from RepairORderDto adds the cost of several RepairOrderTasks  
     * 
     * OBS Instansmetoder måste anropas på instanser, inte på klasser.
     *
     * @param repairTask The {@link RepairTaskDTO} to add.
     */
    public void addRepairTaskCost(RepairTaskDTO repairTask) {
        this.totalCost = repairOrderDTO.getTotalCost();
        repairTasks.add(repairTask);          // Add task to the list
        totalCost += repairTask.getCost();    // Automatically update total cost when task is added
    }

    /**
     * Adds a repair task to the repair order with the specified ID.
     *
     * @param repairOrderId The ID of the repair order to update.
     * @param repairTask    The {@link RepairTaskDTO} to add.
     * @return The added {@link RepairTaskDTO}.
     */
    public RepairTaskDTO addRepairTask(String repairOrderId, RepairTaskDTO repairTask) {
        RepairOrderDTO existing = findRepairOrder(repairOrderId); // Reuse findRepairOrder — avoids duplicated code (kap 6.4)
        if (existing != null) {           // Only add if the repair order actually exists
            existing.addRepairTask(repairTask); // Delegate to RepairOrderDTO to add the task
        }
        return repairTask; // Return the task so the caller can confirm what was added
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
        //get repairtasks and 
        return dto;
    }

    //här behöver vi en testmetod som lägger till kostnaden etc.
}


