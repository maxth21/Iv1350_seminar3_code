package se.kth.iv1350.bikeshop.integration;

import se.kth.iv1350.bikeshop.dto.BikeDTO;
import se.kth.iv1350.bikeshop.dto.CustomerDTO;
import se.kth.iv1350.bikeshop.dto.RepairOrderDTO;
import se.kth.iv1350.bikeshop.dto.RepairTaskDTO;
import se.kth.iv1350.bikeshop.dto.DiagnosticReportDTO;
import se.kth.iv1350.bikeshop.model.RepairOrder;

public class PrinterParameters {
    private RepairOrderDTO repairOrderDTO;
    private RepairOrder repairOrder;
    private CustomerDTO customerDTO;
    private BikeDTO bikeDTO;
    private RepairTaskDTO repairTaskDTO;
    private DiagnosticReportDTO diagnosticReportDTO;

    public PrinterParameters(
        RepairOrderDTO repairOrderDTO,
        RepairOrder repairOrder,
        CustomerDTO customerDTO,
        BikeDTO bikeDTO,
        RepairTaskDTO repairTaskDTO,
        DiagnosticReportDTO diagnosticReportDTO) {

        this.repairOrderDTO = repairOrderDTO;
        this.repairOrder = repairOrder;
        this.repairTaskDTO = repairTaskDTO;
        this.customerDTO = customerDTO;
        this.bikeDTO = bikeDTO;
        this.diagnosticReportDTO = diagnosticReportDTO;
    }

    public RepairOrderDTO getRepairOrderDTO(){
        return repairOrderDTO;
    }

    public RepairOrder getRepairTasksList(){
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
}
