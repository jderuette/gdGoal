package fr.gamedev.goal.tlg;

import java.util.Date;

/**
 * Goal must be reached before a fixed date.
 * @author djer13
 */
public class FixedTimeLimitedGoal {
    private Date limit;

    /**
     * @return the limit
     */
    public Date getLimit() {
        return limit;
    }

    /**
     * @param limit the limit to set
     */
    public void setLimit(Date limit) {
        this.limit = limit;
    }

}
