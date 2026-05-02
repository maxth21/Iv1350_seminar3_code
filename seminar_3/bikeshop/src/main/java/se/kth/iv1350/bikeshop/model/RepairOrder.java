import java.util.List;

package se.kth.iv1350.bikeshop.model;

import se.kth.iv1350.bikeshop.dto.RepairTaskDTO;
import se.kth.iv1350.bikeshop.dto.RepairOrderDTO;
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

    public void updateRepairOrder(RepairOrderDTO repairOrderID) {    
        /**
        * updateRepairOrder is used when the RO needs to be updated and saved.
        * method addRepairTasks is using this method in order to be able to add tasks. 
        **/
    }

    public void calculateTotalCost(){ 
        /**
        * Calculates total cost depending in on the repairTasks, which have separate costs
        * The field represetning totalCost needs to be updated, and remembered inside this object
        * This is void because the method is a command and changes the state of the field,
        * and store data inside the object
        * 
        *Cost is stored in totalCost
        *newCost = summan av kostnaderna för alla RepairTasks som hör till denna RepairOrder

        No parameters.
        */
       //lägg till repairstask
       //uppdatera total cost
       //ändra status
        double sum = 0.0;

        //calculate
        for(RepairTask newVariableTask : RepairTasks;)
            task.getCost();
            sum += task.getCost();


            this.totalCost = sum; 
        //save status with this.
    }

    public boolean acceptedRepairOrder(String repairOrderID) {
        /**
        * Marks accepted order as true,
        * alternative flow as false or handel via exception later
        */

       boolean acceptOrder = getAccepted();
       acceptOrder = true;
    }


    public createRepairOrder (repairOrderID, customerDTO) {
        /**
        * Creates a new repairorder linked to customer and stores in DTO
        */
    }
}