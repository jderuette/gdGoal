package fr.gamedev.goal.basic;

import java.time.LocalDateTime;

import fr.gamedev.goal.Goal;

/**
 * Goal must be reached before a fixed date.
 * @author djer13
 */
public class DateGoal implements Goal<LocalDateTime> {
    private LocalDateTime limit;
    private DateOperation operation;

    public DateGoal(final LocalDateTime theLimit, final DateOperation theOperation) {
        this.limit = theLimit;
        this.operation = theOperation;
    }

    public Boolean isReached(LocalDateTime value) {
        Boolean isReached = Boolean.FALSE;
        if (DateOperation.BEFORE.equals(operation)) {
            isReached = value.isBefore(this.limit);
        } else if (DateOperation.SAME.equals(operation)) {
            isReached = value.isEqual(this.limit);
        } else if (DateOperation.AFTER.equals(operation)) {
            isReached = value.isAfter(this.limit);
        }
        return isReached;
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

    /**
     * @return the operation
     */
    public DateOperation getOperation() {
        return operation;
    }

    /**
     * @param operation the operation to set
     */
    public void setOperation(DateOperation operation) {
        this.operation = operation;
    }

}
