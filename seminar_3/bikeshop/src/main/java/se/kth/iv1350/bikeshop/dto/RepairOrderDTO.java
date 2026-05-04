package se.kth.iv1350.bikeshop.dto;

import java.util.ArrayList;
import java.util.List;
import se.kth.iv1350.bikeshop.model.RepairOrder.RepairOrderState;

/**
 * Data transfer object for a repair order.
 * Used to transfer repair order data between layers without
 * exposing the internal {@link se.kth.iv1350.bikeshop.model.RepairOrder} object.
 */
public class RepairOrderDTO {

    private final String repairOrderId;
    private final String problemDescription;
    private final int date;
    private final CustomerDTO customer;
    private final BikeDTO bike;
    private double totalCost;
    private RepairOrderState state;
    private final List<RepairTaskDTO> repairTasks;

    /**
     * Creates a new repair order DTO with the specified data.
     *
     * @param repairOrderId      The unique ID of the repair order.
     * @param problemDescription A description of the reported problem.
     * @param date               The date the bike was received.
     * @param customer           The customer who owns the bike.
     * @param bike               The bike to be repaired.
     */
    public RepairOrderDTO(String repairOrderId, String problemDescription, int date,
                          CustomerDTO customer, BikeDTO bike) {
        this.repairOrderId = repairOrderId;
        this.problemDescription = problemDescription;
        this.date = date;
        this.customer = customer;
        this.bike = bike;
        this.totalCost = 0.0;
        this.state = RepairOrderState.NEWLY_CREATED;
        this.repairTasks = new ArrayList<>();
    }

    /**
     * Adds a repair task to this order and updates the total cost.
     *
     * @param task The {@link RepairTaskDTO} to add.
     */
    public void addRepairTask(RepairTaskDTO task) {
        repairTasks.add(task);
        totalCost += task.getCost();
    }

    /**
     * Updates the state of this repair order.
     *
     * @param state The new {@link RepairOrderState}.
     */
    public void setState(RepairOrderState state) {
        this.state = state;
    }

    /** @return The unique repair order ID. */
    public String getRepairOrderId() {
        return repairOrderId;
    }

    /** @return The problem description. */
    public String getProblemDescription() {
        return problemDescription;
    }

    /** @return The date the bike was received. */
    public int getDate() {
        return date;
    }

    /** @return The total cost of all repair tasks added so far. */
    public double getTotalCost() {
        return totalCost;
    }

    /** @return The current state of the repair order. */
    public RepairOrderState getSTATE() {
        return state;
    }

    /** @return The customer who owns the bike. */
    public CustomerDTO getCustomer() {
        return customer;
    }

    /** @return The bike to be repaired. */
    public BikeDTO getBike() {
        return bike;
    }

    /** @return A copy of the list of repair tasks added to this order. */
    public List<RepairTaskDTO> getRepairTasks() {
        return new ArrayList<>(repairTasks);
    }
}
