package fr.gamedev.goal.otg;

import fr.gamedev.goal.basic.NumberGoal;

/**
 * One time goal : a simple goal to reach (one time).
 * @author djer13
 */
public class OneTimeGoal {

    /** Goal to reach. */
    NumberGoal goal;

    /**
     * @return the goal
     */
    public NumberGoal getGoal() {
        return goal;
    }

    /**
     * @param goal the goal to set
     */
    public void setGoal(NumberGoal goal) {
        this.goal = goal;
    }
}
