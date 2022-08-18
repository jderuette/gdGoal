package fr.gamedev.goal;

import fr.gamedev.goal.otg.OneTimeGoal;

/**
 * Service class to estimate if a goal is reach.
 * @author djer13
 */
public class GoalEstimator {

    private static GoalEstimator INSTANCE = new GoalEstimator();

    /**
     * Singleton ==> Hide constructor
     */
    private GoalEstimator() {

    }

    public static GoalEstimator getInstance() {
        return INSTANCE;
    }

    public Boolean isReached(Long currentValue, OneTimeGoal otGoal) {
        Goal goal = otGoal.getGoal();

        return currentValue >= goal.getLimit();
    }
}
