package fr.gamedev.goal;

/**
 * Define basic Goal structure.
 * @author djer13
 */
public interface Goal<T> {

    T getLimit();

    void setLimit(T newLimit);

}
