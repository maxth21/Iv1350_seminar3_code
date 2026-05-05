package se.kth.iv1350.bikeshop.dto;

import se.kth.iv1350.bikeshop.model.RepairOrder.RepairOrderState;

/**
 * This is a DTO holding information about Repair Task
 */

public class RepairTaskDTO{
    private String name;
    private String description;
    private double cost;
    private RepairOrderState STATE;                       // NOT final = changes when order is accepted/rejected

    /**
     * constructor for creating a repair task
     * @param name      
     * @param description   description of repair task
     * @param cost          the cost for reparation of task
     * @param state         if the repair task is fixed or not
     */

    public RepairTaskDTO(String name, String description, double cost, boolean state){
        this.name = name;
        this.description = description;
        this.cost = cost;
    }

    /**
     * get method for 
     * @return
     */
    public String getName(){
        return name;
    }

    /**
     * get method for problem description
     * @return
     */
    public String getDescription(){
        return description;
    }

    /**
     * get method for cost
     * @return the cost of the repair task
     */
    public double getCost(){
        return cost;
    }

    /**
     * get method for state
     * @return the state of the repairtask. If it is finished or not
     */
    public boolean getState(){
        return state;
    }
}