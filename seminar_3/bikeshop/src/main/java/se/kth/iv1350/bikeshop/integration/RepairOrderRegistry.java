package se.kth.iv1350.bikeshop.integration; // Integration layer — simulates repair order database

import se.kth.iv1350.bikeshop.dto.RepairOrderDTO; // DTO for passing repair order data between layers
import se.kth.iv1350.bikeshop.dto.RepairTaskDTO;  // DTO for passing repair task data between layers
import java.util.ArrayList; // ArrayList = resizable list, used as our in-memory database
import java.util.List;      // List = interface type (good practice: program to interface, not implementation)

/**
 * Handles all communication with the repair order database.
 * Stores repair orders in memory since no real database is used.
 */
public class RepairOrderRegistry {

    private final List<RepairOrderDTO> repairOrders; // final = list reference never changes, only its contents
                                                     // private = encapsulation, no other class can access directly

    /**
     * Creates a new instance with an empty registry.
     */
    public RepairOrderRegistry() {
        repairOrders = new ArrayList<>(); // Start empty — orders are added during program execution
    }                                     // No sample data needed here, unlike CustomerRegistry

    /**
     * Finds a repair order with the specified ID.
     *
     * @param repairOrderId The ID of the repair order to find.
     * @return The found {@link RepairOrderDTO}, or <code>null</code> if no
     *         repair order with the given ID exists.
     */
    public RepairOrderDTO findRepairOrder(String repairOrderId) {
        for (RepairOrderDTO repairOrder : repairOrders) {        // Loop through every saved repair order
            if (repairOrder.getRepairOrderId().equals(repairOrderId)) { // .equals() for String comparison (never == for Strings!)
                return repairOrder;                              // Match found — return it immediately
            }
        }
        return null; // No match found — caller must handle this case
    }

    /**
     * Returns a list of all repair orders currently stored in the registry.
     *
     * @return A {@link List} of all {@link RepairOrderDTO} objects.
     */
    public List<RepairOrderDTO> findAllRepairOrders() {
        return new ArrayList<>(repairOrders); // Return a COPY of the list — protects encapsulation
    }                                         // Caller cannot modify our internal list this way

    /**
     * Saves a new repair order to the registry.
     *
     * @param repairOrder The {@link RepairOrderDTO} to save.
     */
    public void saveRepairOrder(RepairOrderDTO repairOrder) {
        repairOrders.add(repairOrder); // Add to our in-memory list (replaces saving to a real database)
    }

    /**
     * Adds a repair task to the repair order with the specified ID.
     *
     * @param repairOrderId The ID of the repair order to update.
     * @param repairTask    The {@link RepairTaskDTO} to add.
     * @return The added {@link RepairTaskDTO}.
     */
    public RepairTaskDTO addRepairTask(String repairOrderId, RepairTaskDTO repairTask) {
        RepairOrderDTO existing = findRepairOrder(repairOrderId); // Reuse findRepairOrder — avoids duplicated code (kap 6.4)
        if (existing != null) {           // Only add if the repair order actually exists
            existing.addRepairTask(repairTask); // Delegate to RepairOrderDTO to add the task
        }
        return repairTask; // Return the task so the caller can confirm what was added
    }
}