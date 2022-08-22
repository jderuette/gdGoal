package fr.gamedev.goal.basic;

import fr.gamedev.goal.Goal;

/**
 * Contains goal information. 
 * This is a simple goal : only one number to reach.
 * @author djer13
 */
public class NumberGoal implements Goal<Long> {
    private Long limit;
    private LimitOperation operation;

    /**
     * @param limit
     * @param operation
     */
    public NumberGoal(final Long theLimit, LimitOperation theOperation) {
        super();
        this.limit = theLimit;
        this.operation = theOperation;
    }

    @Override
    public Boolean isReached(Long value) {
        return this.operation.apply(value, this.limit);
    }

    /**
     * @return the limit
     */
    @Override
    public Long getLimit() {
        return limit;
    }

    /**
     * @param limit the limit to set
     */
    @Override
    public void setLimit(Long limit) {
        this.limit = limit;
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
