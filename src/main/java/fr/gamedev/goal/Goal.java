package fr.gamedev.goal;

/**
 * Contains goal information. 
 * Simple goal is only one number to reach.
 * @author djer13
 */
public class Goal {

    private Long limit;

    /**
     * @return the limit
     */
    public Long getLimit() {
        return limit;
    }

    /**
     * @param limit the limit to set
     */
    public void setLimit(Long limit) {
        this.limit = limit;
    }

}
