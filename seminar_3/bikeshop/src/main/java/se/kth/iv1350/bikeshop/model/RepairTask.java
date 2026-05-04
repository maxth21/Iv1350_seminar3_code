package se.kth.iv1350.bikeshop.model;

/**
 * Represents a single repair task with an associated cost.
 */
public class RepairTask {

    private double cost;

    /**
     * Creates a new repair task with no cost set.
     */
    public RepairTask() {
    }

    /**
     * Sets the cost for this repair task.
     *
     * @param newCost The cost in SEK.
     */
    public void setTaskCost(double newCost) {
        this.cost = newCost;
    }

    /**
     * Returns the cost of this repair task.
     *
     * @return The cost in SEK.
     */
    public double getCost() {
        return cost;
    }
}
