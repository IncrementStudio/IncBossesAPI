package ru.incrementstudio.incbosses.api.bosses.phases;

import org.jetbrains.annotations.NotNull;

import java.util.Map;

public abstract class TransitionData {
    @NotNull
    public static Map<String, TransitionCondition> getConditions() {
        return null;
    }

    public static void registerCondition(@NotNull String name, @NotNull TransitionCondition condition) {
    }

    public abstract boolean checkTransition(@NotNull Phase phase);
}