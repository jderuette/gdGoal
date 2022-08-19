package fr.gamedev.goal.tlg;

import java.time.LocalDateTime;

/**
 * Goal must be reached before a fixed date.
 * @author djer13
 */
public class FixedTimeLimitedGoal {
    private LocalDateTime limit;

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
