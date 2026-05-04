package se.kth.iv1350.bikeshop.integration;

import se.kth.iv1350.bikeshop.dto.RepairOrderDTO;
import se.kth.iv1350.bikeshop.dto.RepairTaskDTO;

import java.util.ArrayList;
import java.util.List;

/**
 * Handles all communication with the repair order database.
 * Stores repair orders in memory since no real database is used.
 */
public class RepairOrderRegistry {

    private final List<RepairOrderDTO> repairOrderList;

    /**
     * Creates a new instance with an empty registry.
     */
    public RepairOrderRegistry() {
        this.repairOrderList = new ArrayList<>();
    }

    /**
     * Finds a repair order with the specified ID.
     *
     * @param repairOrderId The ID of the repair order to find.
     * @return The found {@link RepairOrderDTO}, or {@code null} if no match exists.
     */
    public RepairOrderDTO findRepairOrder(String repairOrderId) {
        for (RepairOrderDTO repairOrder : repairOrderList) {
            if (repairOrder.getRepairOrderId().equals(repairOrderId)) {
                return repairOrder;
            }
        }
        return null;
    }

    /**
     * Returns a list of all repair orders currently stored in the registry.
     *
     * @return A copy of the list of all {@link RepairOrderDTO} objects.
     */
    public List<RepairOrderDTO> findAllRepairOrders() {
        return new ArrayList<>(repairOrderList);
    }

    /**
     * Saves a new repair order to the registry.
     *
     * @param repairOrder The {@link RepairOrderDTO} to save.
     */
    public void saveRepairOrder(RepairOrderDTO repairOrder) {
        repairOrderList.add(repairOrder);
    }

    /**
     * Adds a repair task to the repair order with the specified ID.
     *
     * @param repairOrderId The ID of the repair order to update.
     * @param repairTask    The {@link RepairTaskDTO} to add.
     * @return The added task, or {@code null} if the order was not found.
     */
    public RepairTaskDTO addRepairTask(String repairOrderId, RepairTaskDTO repairTask) {
        RepairOrderDTO existing = findRepairOrder(repairOrderId);
        if (existing != null) {
            existing.addRepairTask(repairTask);
        }
        return repairTask;
    }
}
