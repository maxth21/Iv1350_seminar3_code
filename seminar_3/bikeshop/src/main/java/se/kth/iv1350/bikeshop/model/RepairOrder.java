package se.kth.iv1350.bikeshop.model;

import se.kth.iv1350.bikeshop.dto.BikeDTO;
import se.kth.iv1350.bikeshop.dto.CustomerDTO;
import se.kth.iv1350.bikeshop.dto.RepairOrderDTO;
import se.kth.iv1350.bikeshop.dto.RepairTaskDTO;

/**
 * Represents a repair order in the system.
 * Manages the state and repair tasks of the order.
 */
public class RepairOrder {

    /**
     * The possible states of a repair order throughout its lifecycle.
     */
    public enum RepairOrderState {
        NEWLY_CREATED,
        READY_FOR_APPROVAL,
        REJECTED,
        ACCEPTED
    }

    private static int orderCounter = 1;
    private final RepairOrderDTO repairOrderDTO;

    /**
     * Creates a new repair order for the specified customer and bike.
     *
     * @param customer           The customer who owns the bike.
     * @param bike               The bike to be repaired.
     * @param problemDescription A description of the reported problem.
     */
    public RepairOrder(CustomerDTO customer, BikeDTO bike, String problemDescription) {
        String orderId = "RO-" + String.format("%03d", orderCounter++);
        this.repairOrderDTO = new RepairOrderDTO(orderId, problemDescription, 260504, customer, bike);
    }

    /**
     * Returns a DTO representation of this repair order.
     *
     * @return The {@link RepairOrderDTO} for this order.
     */
    public RepairOrderDTO getRepairOrderDTO() {
        return repairOrderDTO;
    }

    /**
     * Adds a repair task to this order and returns it.
     *
     * @param task The {@link RepairTaskDTO} to add.
     * @return The added task.
     */
    public RepairTaskDTO addRepairTask(RepairTaskDTO task) {
        repairOrderDTO.addRepairTask(task);
        return task;
    }

    /**
     * Sets the state of this repair order.
     *
     * @param state The new {@link RepairOrderState}.
     */
    public void setState(RepairOrderState state) {
        repairOrderDTO.setState(state);
    }

    /**
     * Returns the current state of this repair order.
     *
     * @return The current {@link RepairOrderState}.
     */
    public RepairOrderState getState() {
        return repairOrderDTO.getSTATE();
    }
}
