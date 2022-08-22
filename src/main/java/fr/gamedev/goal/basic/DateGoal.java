package fr.gamedev.goal.basic;

import java.time.LocalDateTime;

import fr.gamedev.goal.Goal;

/**
 * Goal is reached (or not) with date comparison.
 * @author djer13
 */
public class DateGoal implements Goal<LocalDateTime> {
    private LocalDateTime limit;
    private LimitOperation operation;

    public DateGoal(final LocalDateTime theLimit, final LimitOperation theOperation) {
        this.limit = theLimit;
        this.operation = theOperation;
    }

    @Override
    public Boolean isReached(LocalDateTime value) {
        return this.operation.apply(value, this.limit);
    }

    /**
     * @return the limit
     */
    @Override
    public LocalDateTime getLimit() {
        return limit;
    }

    /**
     * @param theLimit the limit to set
     */
    @Override
    public void setLimit(LocalDateTime theLimit) {
        this.limit = theLimit;
    }

    /**
     * @return the operation
     */
    public LimitOperation getOperation() {
        return operation;
    }

    /**
     * @param operation the operation to set
     */
    public void setOperation(LimitOperation operation) {
        this.operation = operation;
    }

}
