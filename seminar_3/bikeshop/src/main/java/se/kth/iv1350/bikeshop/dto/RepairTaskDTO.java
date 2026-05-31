package se.kth.iv1350.bikeshop.dto;

/**
 * This is a DTO holding information about Repair Task
 */

public class RepairTaskDTO{
    private String name;
    private String description;
    private double cost;

    /**
     * constructor for creating a repair task.
     * @param name          the name of the repair task.
     * @param description   description of repair task.
     * @param cost          the cost for reparation of task. 
     */

    public RepairTaskDTO(String name, String description, double cost){
        this.name = name;
        this.description = description;
        this.cost = cost;
    }

    /**
     * get method for name of task.
     * @return name of task.
     */
    public String getName(){
        return name;
    }

    /**
     * get method for problem description.
     * @return problem description.
     */
    public String getDescription(){
        return description;
    }

    /**
     * get method for cost.
     * @return the cost of the repair task.
     */
    public double getCost(){
        return cost;
    }
}