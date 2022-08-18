package fr.gamedev.goal.otg;

import fr.gamedev.goal.Goal;

/**
 * One time goal : a simple goal to reach (one time).
 * @author djer13
 */
public class OneTimeGoal {

    Goal goal;

    /**
     * @return the goal
     */
    public Goal getGoal() {
        return goal;
    }

    /**
     * @param goal the goal to set
     */
    public void setGoal(Goal goal) {
        this.goal = goal;
    }
}
