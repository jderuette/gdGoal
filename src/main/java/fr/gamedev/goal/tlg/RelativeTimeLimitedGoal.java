package fr.gamedev.goal.tlg;

import java.time.LocalDateTime;
import java.time.temporal.TemporalUnit;

/**
 * Goal limited by time relative to a specific Date.
 * @author djer13
 */
public class RelativeTimeLimitedGoal {
    /** Used to calculate the "real" date for a specific Use Case (User).*/
    private String eventCode;
    /** The (calculated) initial Date to calculate time range. */
    private LocalDateTime initialDate;
    /** Number of step to calculate the "real" date. */
    private Long step;
    /** unit of step.*/
    private TemporalUnit unit;

    /** Goal to reach. */
    private FixedTimeLimitedGoal goal;

    public RelativeTimeLimitedGoal(String theEventCode, LocalDateTime theInitialDate, Long TheStep,
            TemporalUnit theUnit) {
        this.eventCode = theEventCode;
        this.initialDate = theInitialDate;
        this.step = TheStep;
        this.unit = theUnit;

        defineGoalDate();
    }

    /** Define (calculate) the timed Goal.*/
    private void defineGoalDate() {

        if (null == this.goal) {
            this.goal = new FixedTimeLimitedGoal();
        }
        this.initialDate.plus(this.step, this.unit);
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
     * @return the initialDate
     */
    public LocalDateTime getInitialDate() {
        return initialDate;
    }

    /**
     * @param initialDate the initialDate to set
     */
    public void setInitialDate(LocalDateTime initialDate) {
        this.initialDate = initialDate;
        defineGoalDate();
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
        defineGoalDate();
    }

    /**
     * @return the unit
     */
    public TemporalUnit getUnit() {
        return unit;
    }

    /**
     * @param unit the unit to set
     */
    public void setUnit(TemporalUnit unit) {
        this.unit = unit;
        defineGoalDate();
    }

    /**
     * @return the goal
     */
    public FixedTimeLimitedGoal getGoal() {
        return goal;
    }
}
