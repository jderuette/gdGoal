package fr.gamedev.goal.tlg;

import java.util.concurrent.TimeUnit;

/**
 * Goal limited by time relative to a specific Date.
 * @author djer13
 */
public class RelativeTimeLimitedGoal {
    /** Used to calculate the "real" date for a specific Use Case (User).*/
    private String eventCode;
    /** Number of step to calculate the "real" date. */
    private Long step;
    /** unit of step.*/
    private TimeUnit unit;

    /** Goal to reach. */
    private FixedTimeLimitedGoal goal;

    public RelativeTimeLimitedGoal(String theEventCode, Long TheStep, TimeUnit theUnit) {
        this.eventCode = theEventCode;
        this.step = TheStep;
        this.unit = theUnit;
    }

    /**
     * @return the eventCode
     */
    public String getEventCode() {
        return eventCode;
    }

    /**
     * @param eventCode the eventCode to set
     */
    public void setEventCode(String eventCode) {
        this.eventCode = eventCode;
    }

    /**
     * @return the step
     */
    public Long getStep() {
        return step;
    }

    /**
     * @param step the step to set
     */
    public void setStep(Long step) {
        this.step = step;
    }

    /**
     * @return the unit
     */
    public TimeUnit getUnit() {
        return unit;
    }

    /**
     * @param unit the unit to set
     */
    public void setUnit(TimeUnit unit) {
        this.unit = unit;
    }

    /**
     * @return the goal
     */
    public FixedTimeLimitedGoal getGoal() {
        return goal;
    }

    /**
     * @param goal the goal to set
     */
    public void setGoal(FixedTimeLimitedGoal goal) {
        this.goal = goal;
    }

}
