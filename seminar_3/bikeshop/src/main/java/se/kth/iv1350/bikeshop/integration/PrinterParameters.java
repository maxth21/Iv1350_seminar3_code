package se.kth.iv1350.bikeshop.integration;

import java.util.List;

import se.kth.iv1350.bikeshop.dto.BikeDTO;
import se.kth.iv1350.bikeshop.dto.CustomerDTO;
import se.kth.iv1350.bikeshop.dto.DiagnosticReportDTO;
import se.kth.iv1350.bikeshop.dto.RepairOrderDTO;
import se.kth.iv1350.bikeshop.dto.RepairTaskDTO;
import se.kth.iv1350.bikeshop.model.RepairOrder;

public class PrinterParameters {
    private RepairOrderDTO repairOrderDTO;
    private RepairOrder repairOrder;
    private CustomerDTO customerDTO;
    private BikeDTO bikeDTO;
    private RepairTaskDTO repairTaskDTO;
    private DiagnosticReportDTO diagnosticReportDTO;
    private double totalCostOfRepairTasks;
    private List<RepairTaskDTO> repairTaskList;
    private RepairOrder.RepairOrderState state;

    public PrinterParameters(
        RepairOrderDTO repairOrderDTO,
        RepairOrder repairOrder,
        CustomerDTO customerDTO,
        BikeDTO bikeDTO,
        RepairTaskDTO repairTaskDTO,
        List<RepairTaskDTO> repairTaskList,
        DiagnosticReportDTO diagnosticReportDTO)
       { 

        this.repairOrderDTO = repairOrderDTO;
        this.repairOrder = repairOrder;
        this.repairTaskDTO = repairTaskDTO;
        this.customerDTO = customerDTO;
        this.bikeDTO = bikeDTO;
        this.diagnosticReportDTO = diagnosticReportDTO;
        this.repairTaskList = repairTaskList;
        
    }

    public RepairOrderDTO getRepairOrderDTO(){
        return repairOrderDTO;
    }

    public RepairOrder getRepairOrder(){
        return repairOrder;
    }

    public List<RepairTaskDTO> getRepairTasksList(){
        return repairOrder.getRepairTasks();
    }

    public CustomerDTO getCustomerDTO(){
        return customerDTO;
    }

    public BikeDTO getBikeDTO(){
        return bikeDTO;
    }
    
    public RepairTaskDTO getRepairTaskDTO(){
        return repairTaskDTO;
    }

    public DiagnosticReportDTO getDiagnosticReportDTO(){
        return diagnosticReportDTO;
    }

    public RepairOrder.RepairOrderState getState(){
        return state;
    }
    
    //check syntax here
   /* public TotalCostOfRepairTasks getTotalCostOfRepairTasks(){
        return getTotalCostOfRepairTasks;
    }
    */
    

}
