import java.util.ArrayList;
import java.util.List;

import se.kth.iv1350.bikeshop.dto.RepairOrderDTO;
import se.kth.iv1350.bikeshop.model.RepairTask;

package se.kth.iv1350.bikeshop.model;

import se.kth.iv1350.bikeshop.dto.RepairTaskDTO;
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
    
    //konstruktor av RO
    public RepairOrder objOfRepairOrder(){

        RepairTask RepairTasks = new RepairTask();

        //skapa en lista med repairtasks
        List<RepairTask> repairTasks = new ArrayList<>();

    }


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
        *
        *No parameters.
        */
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

    //ska den verkligen returnera  boolean? eller ska den ändra state?
    public boolean acceptedRepairOrder(String repairOrderID) {
        /**
         *Changes the state of the repairOrder to accepted 
         *  
         * Marks accepted order as true,
         * alternative flow as false or handled via exception later
         */

        //RepairOrderDTO acceptRepairOrderDTO = new RepairOrderDTO(repairOrderID repairOrderID);

        //skapa en lista av ett objekt
        List<RepairOrderDTO> repairOrders = new ArrayList<>();
        
        //loopa igenom repairorders och sätt den med sökt ID till acceppted
        for(RepairOrderDTO foundMatchingRepairOrderID : repairOrders){
            if(foundMatchingRepairOrderID.getRepairOrderId().equals(repairOrderID)){
                //set accepted to true
                repairOrders.getAccepted();
            }
        }
    }
/*        boolean acceptOrder = getAccepted(repairOrderDTO);
        this.acceptOrder = true;4


       return this.acceptOrder(repairOrderID);
    }

 */

    public createRepairOrder (repairOrderID, customerDTO) {
        /**
        * Creates a new repairorder linked to customer and stores in DTO
        */
    }
    
}