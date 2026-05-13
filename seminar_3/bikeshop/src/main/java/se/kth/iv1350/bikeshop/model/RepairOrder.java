package se.kth.iv1350.bikeshop.model;

import java.util.ArrayList;
import java.util.List;

import se.kth.iv1350.bikeshop.dto.BikeDTO;
import se.kth.iv1350.bikeshop.dto.CustomerDTO;
import se.kth.iv1350.bikeshop.dto.DiagnosticReportDTO;  
import se.kth.iv1350.bikeshop.dto.RepairOrderDTO;
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
    private double totalCostOfRepairTasks;
    private CustomerDTO customer;
    private BikeDTO bike;
    private String customersProblemDescription;
    private String date;
    private RepairOrderState state;

      
    public RepairOrder(CustomerDTO customer, BikeDTO bike, String customersProblemDescription, String date) {
        this.customer = customer;
        this.bike = bike;
        this.customersProblemDescription = customersProblemDescription;
        this.date = date; 
    }

/*     //konstruktor av RO
    public RepairOrder (List<RepairTaskDTO> repairTaskList){
        this.repairTasks = new ArrayList<>();
        this.totalCostInModel = 0.0; 
    } */

    /**
     * Updates the repair order with the diagnostic report and the list of repair tasks
     * @param diagnosticReportProblemDescription the problem description from the diagnostic report
     * @param repairTasks the list of repair tasks to be added to the repair order
     */
    public void updateRepairOrder(String diagnosticReportProblemDescription, List<RepairTaskDTO> repairTasks){
        
    }

    //getter method for totalCost
    public double getTotalCostOfRepairTasks (){
        return totalCostOfRepairTasks;
    }

    //getter for repairstasks list
    public List<RepairTaskDTO> getRepairTasks(){
        return repairTasks;
    } 

    //NY getter för state
    public RepairOrderState getState (){
        return state; 
    }

    public RepairOrderDTO getRepairOrderDTO(){

        return new RepairOrderDTO(repairOrderId, problemDescription, date, estimatedCompletitionDate, state);
    }
        
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
     * Adds a repairtask DTO to the arraylist repairTasks (containing RepairTaskDTO)
     * and adds the cost
     * @param newTask
     */
    public void addRepairTask(RepairTaskDTO newTask) {
        repairTasks.add(newTask);
        totalCostOfRepairTasks += newTask.getCost();    // Automatically update total cost when task is added
    }

}