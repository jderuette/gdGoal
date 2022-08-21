package fr.gamedev.goal.tlg;

import java.time.LocalDateTime;

import fr.gamedev.goal.Goal;

/**
 * Goal must be reached before a fixed date.
 * @author djer13
 */
public class DateGoal implements Goal<LocalDateTime> {
    private LocalDateTime limit;

    public Boolean isReached(LocalDateTime value) {
        return value.isAfter(this.limit);
    }

    /**
     * @return the limit
     */
    public LocalDateTime getLimit() {
        return limit;
    }

    /**
     * @param theLimit the limit to set
     */
    public void setLimit(LocalDateTime theLimit) {
        this.limit = theLimit;
    }

}
