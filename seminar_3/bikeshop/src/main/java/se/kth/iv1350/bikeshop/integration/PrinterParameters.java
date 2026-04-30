package se.kth.iv1350.bikeshop.integration;

import se.kth.iv1350.bikeshop.dto.BikeDTO;
import se.kth.iv1350.bikeshop.dto.CustomerDTO;
import se.kth.iv1350.bikeshop.dto.RepairOrderDTO;
import se.kth.iv1350.bikeshop.dto.RepairTaskDTO;

public class PrinterParameters {
    private RepairOrderDTO repairOrder;
    private CustomerDTO customer;
    private BikeDTO bike;
    private RepairTaskDTO repairTask;
    private boolean accepted;

    public PrinterParameters(
        RepairOrderDTO repairOrder,
        CustomerDTO customer,
        BikeDTO bike,
        RepairTaskDTO repairTask,
        boolean accepted){

        this.repairOrder = repairOrder;
        this.repairTask = repairTask;
        this.customer = customer;
        this.accepted = accepted;
        this.bike = bike;
    }

    public RepairOrderDTO getRepairOrder(){
        return repairOrder;
    }


}
