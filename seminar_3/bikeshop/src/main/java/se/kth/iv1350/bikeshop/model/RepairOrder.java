package se.kth.iv1350.bikeshop.model;

import java.util.ArrayList;
import java.util.List;

import se.kth.iv1350.bikeshop.dto.RepairOrderDTO;
import se.kth.iv1350.bikeshop.dto.RepairTaskDTO;
import se.kth.iv1350.bikeshop.model.RepairTask;
import se.kth.iv1350.bikeshop.dto.BikeDTO;
import se.kth.iv1350.bikeshop.dto.CustomerDTO;
import se.kth.iv1350.bikeshop.controller.Controller;

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

      
    //konstruktor av RO
    public RepairOrder (List<RepairOrderDTO> repairOrderList){
        this.repairTasks = new ArrayList<>();
        //ska den initeras som 0?
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


        /**
        * updateRepairOrder is used when the RO needs to be updated and saved.
        * method addRepairTasks is using this method in order to be able to add tasks. 
        **/
    public void updateRepairOrder(RepairOrderDTO repairOrderID) {    
       
    }
    /**
        * Calculates total cost depending in on the repairTasks, which have separate costs
        * The field represetning totalCost needs to be updated, and remembered inside this object
        * This is void because the method is a command and changes the state of the field,
        * and store data inside the object
        * 
        *Cost is stored in totalCost
        *newCost = summan av kostnaderna för alla RepairTasks som hör till denna RepairOrder
        *
        *No parameters.
        */
    public void calculateTotalCost(){ 
       //lägg till repairstask
       //uppdatera total cost
       //ändra status
        double sum = 0.0;
        
        //ReoairTasks cannot be reached like this - variable is private. Should we use a getter method?
        for(RepairTask newVariableTask : repairTasks;)
            task.getCost();
            sum += task.getCost();


            this.totalCost = sum; 
        //save status with this.
    }

        /**
         *Changes the state of the repairOrder to accepted 
         *  
         * Marks accepted order as true,
         * alternative flow as false or handled via exception later
         */

    //ska den verkligen returnera  boolean? eller ska den ändra state?
    public boolean acceptedRepairOrder(String repairOrderID) {
      
        //RepairOrderDTO acceptRepairOrderDTO = new RepairOrderDTO(repairOrderID repairOrderID);
        //skapa en lista av ett objekt
        //loopa igenom repairorders och sätt den med sökt ID till acceppted
        for(RepairOrderDTO foundMatchingRepairOrderID : repairOrders){
            if(foundMatchingRepairOrderID.getRepairOrderId().equals(repairOrderID)){
                //set accepted to true
                setState(RepairOrderState);
                //this.acceptOrder = true;
            }
        }
    }
    

    /**
     * adds a cost to the task 
     * @param addedRepairTask
     */
    public void addRepairTaskCost(RepairTaskDTO addedRepairTask) {
        totalCostInModel += addedRepairTask.getCost();    // Automatically update total cost when task is added
    }

}