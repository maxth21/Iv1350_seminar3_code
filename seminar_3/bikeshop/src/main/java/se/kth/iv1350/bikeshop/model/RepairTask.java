package se.kth.iv1350.bikeshop.model;

import se.kth.iv1350.bikeshop.dto.RepairTaskDTO;
import se.kth.iv1350.bikeshop.dto.RepairOrderDTO;


import java.util.List;
import java.util.ArrayList;

public class RepairTask{

    private double cost;
    private double newCost;

    //constructor: empty
    public RepairTask(){
        RepairTask repairTask = new RepairTask();
        private List<RepairTaskDTO> repairTasks;
    }
    
    //createReapritask behövs men kasnke ska den vara i RepairOrderRegisrty
    
    /**
     * Adds a repair task cost to this repair order DTO and updates cost.
     * totalCost from RepairORderDto adds the cost of several RepairOrderTasks  
     * 
     * OBS Instansmetoder måste anropas på instanser, inte på klasser.
     * 
     * We want to set the individual cost to a chosen value.
     * We can create a list of costs in integration and save them in RepairOrderRegistry
     * This method can be used in the creation of a repairorder
     * @param newCost is taken and refernced
     * @return
     */
    public void setTaskCost(double newCost){
        this.cost = newCost;
    }
    
    //här behöver vi en testmetod som lägger till kostnaden etc.
}


