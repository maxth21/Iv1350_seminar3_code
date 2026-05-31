package se.kth.iv1350.bikeshop.model;

import java.time.LocalDate;
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

public class RepairOrder { 

    public enum RepairOrderState {
        NEWLY_CREATED,
        READY_FOR_APPROVAL,
        REJECTED,
        ACCEPTED
    }

    //list of repairtasks
    private List<RepairTaskDTO > repairTasks;
    //private List<Observer> repairOrderObservers = new ArrayList<>();
    //TotalCostOfRepairTasks är et fält som model behöver för att det vi skapar ska kunna fortsätta existera så länge objektet finns
    //skapar fält
    private double totalCostOfRepairTasks;
    private String problemDescription;
    private LocalDate date;
    private int estimatedCompletionDate = 0;
    private String repairOrderId;
    private RepairOrderState state;
    private DiagnosticReport diagnosticReport;

    private RepairOrderDTO repairOrder;

    public RepairOrder(CustomerDTO customer, BikeDTO bike, String ProblemDescription, LocalDate date) {
        //this.customer = customer;
        //this.bike = bike;
        this.problemDescription = problemDescription;
        this.repairOrderId = "RO-1";
        this.state = RepairOrderState.NEWLY_CREATED;
        this.repairTasks = new ArrayList<>();
        this.totalCostOfRepairTasks = 0.0;
    
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
/*
replaced by addDiagnosticReport and addRepairstasks methods!!!
public void updateRepairOrder(String diagnosticReportProblemDescription, List<RepairTaskDTO> repairTasks){
        
    }
    */

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

        return new RepairOrderDTO(repairOrderId, problemDescription, date, estimatedCompletionDate, state);
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
    

   /*  public void addObserver(Observer observer){
        repairOrderObservers.add(observer);
    }
*/
  
  /*   @Override
    private void notifyObserver(){
        for(Observer obs : repairOrderObservers){
            obs.repairOrderStateHasChanged(repairorder);
        }
    }
*/
    /**
     * Adds a repairtask DTO to the arraylist repairTasks (containing RepairTaskDTO)
     * and adds the cost
     * @param newTask
     */
    public void addRepairTask(RepairTaskDTO newTask) {
        repairTasks.add(newTask);
        totalCostOfRepairTasks += newTask.getCost();    // Automatically update total cost when task is added
        
        //notifyObserver();
    }

    public DiagnosticReportDTO addDiagnosticReportToRepairOrder(RepairOrderDTO repairOrderDTO, String newReport) {
        //new object (instans)
        diagnosticReport = new DiagnosticReport(); 
       // notifyObserver();
        return diagnosticReport.addDiagnosticReport(newReport);
    }

}