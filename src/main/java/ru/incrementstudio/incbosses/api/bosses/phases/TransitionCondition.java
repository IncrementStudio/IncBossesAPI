package ru.incrementstudio.incbosses.api.bosses.phases;

import org.bukkit.configuration.ConfigurationSection;
import org.jetbrains.annotations.NotNull;

@FunctionalInterface
public interface TransitionCondition {
    boolean check(@NotNull ConfigurationSection config, @NotNull Phase phase);
}
