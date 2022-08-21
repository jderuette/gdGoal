package fr.gamedev.goal;

/**
 * Define basic Goal structure.
 * @author djer13
 */
public interface Goal<T> {

    /** The limit to reached to accomplish the goal.*/
    T getLimit();

    /** Define the limit to reach.*/
    void setLimit(T newLimit);

    /** Indicate if the Goal is reached.*/
    Boolean isReached(T value);

}
