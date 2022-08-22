package fr.gamedev.goal.basic;

import java.time.LocalDateTime;
import java.util.Arrays;

/**
 * Standard operations with a limit.
 * @author djer13
 */
public enum LimitOperation {
    BEFORE("before") {
        @Override
        public boolean apply(Long currentValue, Long limit) {
            return currentValue < limit;
        }

        @Override
        public boolean apply(LocalDateTime currentDate, LocalDateTime limit) {
            return currentDate.isBefore(limit);
        }
    },
    SAME("same") {
        @Override
        public boolean apply(Long currentValue, Long limit) {
            return currentValue == limit;
        }

        @Override
        public boolean apply(LocalDateTime currentDate, LocalDateTime limit) {
            return currentDate.isEqual(limit);
        }
    },
    AFTER("after)") {
        @Override
        public boolean apply(Long currentValue, Long limit) {
            return currentValue > limit;
        }

        @Override
        public boolean apply(LocalDateTime currentDate, LocalDateTime limit) {
            return currentDate.isAfter(limit);
        }
    };

    private final String text;

    private LimitOperation(String aText) {
        this.text = aText;
    }

    public static LimitOperation from(String str) {
        return Arrays.stream(values()).filter(o -> o.equals(str)).findFirst()
                .orElseThrow(IllegalArgumentException::new);
    }

    public abstract boolean apply(Long currentValue, Long limit);

    public abstract boolean apply(LocalDateTime currentDate, LocalDateTime limit);
}
