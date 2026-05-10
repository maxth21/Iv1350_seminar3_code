package se.kth.iv1350.bikeshop.model;

import java.util.ArrayList;
import java.util.List;

import se.kth.iv1350.bikeshop.dto.RepairTaskDTO;

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
    //TotalCostOfRepairTasks är et fält som model behöver för att det vi skapar ska kunna fortsätta existera så länge objektet finns
    private double TotalCostOfRepairTasks;

    private RepairOrderState state;

      
    //konstruktor av RO
    public RepairOrder (List<RepairTaskDTO> repairTaskList){
        this.repairTasks = new ArrayList<>();
        this.TotalCostOfRepairTasks = 0.0; 
    }

    //getter method for totalCost
    public double TotalCostOfRepairTasks (){
        return TotalCostOfRepairTasks;
    }

    //getter for repairstasks list
    public List<RepairTaskDTO> getrepairTasks(){
        return repairTasks;
    } 
    
        
    /**
    *Changes the state of the repairOrder to accepted 
    * 
    * Marks accepted order as true,
    * alternative flow as false or handled via exception later
    *
    *FÖR ÖKAD TYDLIGHET: Ta bort setStae och ersätt med specifika metoder

    */
    //public void setState(RepairOrderState state) {
    //    this.state = state;
    //}
    
    
    /**
     * This method does not take any paramters, instead it changes the field of the repairorder,
     * so that the RepairOrdreState is marked as Accepted 
     * @param
     */
    public void setStateAccepted() {
        this.state = RepairOrderState.ACCEPTED;
    }

    public void setStateRejected() {
        this.state = RepairOrderState.REJECTED;
    }

    public void setStateNewlyCreated() {
        this.state = RepairOrderState.NEWLY_CREATED;
    }

    public void setStateReadyForApproval(){
        this.state = RepairOrderState.READY_FOR_APPROVAL;

    }

    /**
     * adds a cost to the task and calculates value each time
     * @param addedRepairTask
     */
    public void addRepairTaskCost(RepairTaskDTO addedRepairTask) {
        TotalCostOfRepairTasks += addedRepairTask.getCost();    // Automatically update total cost when task is added

       // behöver metoden köra addedRepairTask?
       // addedRepairTask;
       
    }
    public void addRepairTask(RepairTaskDTO addRepairTask) {
        //se över diagram - returnerar inget : sparar i en lista
        //kod saknas
        //behöver kollas upp, funktionalitet  med annan kod och uppdatera diagram 
    }

}