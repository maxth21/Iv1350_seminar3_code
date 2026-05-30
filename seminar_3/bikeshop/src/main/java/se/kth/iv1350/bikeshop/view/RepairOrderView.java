package se.kth.iv1350.bikeshop.view;

import se.kth.iv1350.bikeshop.model.Observer;

/**
 * Prints updates using system.out
 */
public class RepairOrderView implements Observer {

    @Override
    public void repairOrderStateHasChanged(se.kth.iv1350.bikeshop.dto.RepairOrderDTO repairOrder) {
        System.out.println("\n[REPAIR ORDER UPDATE] Order: " + repairOrder.getRepairOrderId()
                + " | State: " + repairOrder.getState());
    }
}
