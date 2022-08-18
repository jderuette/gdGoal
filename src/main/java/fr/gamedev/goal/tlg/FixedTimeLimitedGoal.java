package fr.gamedev.goal.tlg;

import java.util.Date;

import fr.gamedev.goal.Goal;

/**
 * Goal must be reached before a fixed date.
 * @author djer13
 */
public class FixedTimeLimitedGoal {
    Date mustBeDoneBefore;
    /** Goal to reach. */
    Goal goal;

    /**
     * @return the mustBeDoneBefore
     */
    public Date getMustBeDoneBefore() {
        return mustBeDoneBefore;
    }

    /**
     * @param mustBeDoneBefore the mustBeDoneBefore to set
     */
    public void setMustBeDoneBefore(final Date mustBeDoneBefore) {
        this.mustBeDoneBefore = mustBeDoneBefore;
    }

    /**
     * @return the goal
     */
    public Goal getGoal() {
        return goal;
    }

    /**
     * @param goal the goal to set
     */
    public void setGoal(final Goal goal) {
        this.goal = goal;
    }

}
