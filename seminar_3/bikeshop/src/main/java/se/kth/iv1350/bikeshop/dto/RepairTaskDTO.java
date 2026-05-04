package se.kth.iv1350.bikeshop.dto;

/**
 * Data transfer object for a single repair task.
 * Used to pass repair task data between layers without exposing model internals.
 */
public class RepairTaskDTO {

    private final String name;
    private final String description;
    private final double cost;

    /**
     * Creates a new repair task DTO.
     *
     * @param name        The name of the repair task.
     * @param description A description of the work involved.
     * @param cost        The cost of the task in SEK.
     */
    public RepairTaskDTO(String name, String description, double cost) {
        this.name = name;
        this.description = description;
        this.cost = cost;
    }

    /** @return The name of the repair task. */
    public String getName() {
        return name;
    }

    /** @return A description of the work involved. */
    public String getDescription() {
        return description;
    }

    /** @return The cost of the task in SEK. */
    public double getCost() {
        return cost;
    }
}
