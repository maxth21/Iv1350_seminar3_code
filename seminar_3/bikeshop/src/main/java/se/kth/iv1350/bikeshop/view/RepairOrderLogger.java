package se.kth.iv1350.bikeshop.view;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

import se.kth.iv1350.bikeshop.dto.RepairOrderDTO;
import se.kth.iv1350.bikeshop.model.Observer;

/**
 * Logs repair order updates to a file.
 */
public class RepairOrderLogger implements Observer {

    private static final String LOG_FILE = "repairorder-log.txt";

    /**
     * Called when a repair order has been updated.
     * Writes the update to a log file.
     *
     * @param repairOrder The updated repair order.
     */
    @Override
    public void repairOrderStateHasChanged(RepairOrderDTO repairOrder) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(LOG_FILE, true))) {
            writer.println(LocalDateTime.now() + " | Order: " + repairOrder.getRepairOrderId()
                    + " | State: " + repairOrder.getState());
        } catch (IOException e) {
            System.err.println("Failed to write to repair order log: " + e.getMessage());
        }
    }
}
