package se.kth.iv1350.bikeshop.model;

import se.kth.iv1350.bikeshop.dto.*;


/**
 * This interface uses the Observer pattern. 
 */
public interface Observer {
    void repairOrderStateHasChanged(RepairOrderDTO repairOrder);
}
