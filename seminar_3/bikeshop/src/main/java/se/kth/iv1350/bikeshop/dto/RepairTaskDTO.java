package se.kth.iv1350.bikeshop.dto;

/**
 * This is a DTO holding information about Repair Task
 */

public class RepairTaskDTO{
    private String name;
    private String description;
    private double cost;
    private boolean state;

    public RepairTaskDTO(String name, String description, double cost, boolean state){
        this.name = name;
        this.description = description;
        this.cost = cost;
        this.state = state;
    }

    public String getName(){
        return name;
    }

    public String getDescription(){
        return description;
    }

    public double getCost(){
        return cost;
    }

    public boolean getState(){
        return state;
    }
}