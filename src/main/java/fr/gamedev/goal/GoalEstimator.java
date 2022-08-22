package fr.gamedev.goal;

import java.time.LocalDateTime;

import fr.gamedev.goal.basic.DateGoal;
import fr.gamedev.goal.basic.NumberGoal;
import fr.gamedev.goal.otg.OneTimeGoal;
import fr.gamedev.goal.tlg.RelativeTimeLimitedGoal;

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
        NumberGoal goal = otGoal.getGoal();
        return isReached(currentValue, goal);
    }

    public Boolean isReached(LocalDateTime currentValue, RelativeTimeLimitedGoal rtGoal) {
        DateGoal goal = rtGoal.getGoal();
        return isReached(currentValue, goal);
    }

    public Boolean isReached(LocalDateTime currentValue, DateGoal dGoal) {
        //force cast to Interface to avoid recursive call.
        Goal<LocalDateTime> goal = dGoal;
        return isReached(currentValue, goal);
    }

    private Boolean isReached(Long currentValue, Goal<Long> goal) {
        return goal.isReached(currentValue);
    }

    private Boolean isReached(LocalDateTime currentValue, Goal<LocalDateTime> goal) {
        return goal.isReached(currentValue);
    }
}
