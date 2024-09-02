package ru.incrementstudio.incbosses.api.bosses;

import org.bukkit.configuration.ConfigurationSection;
import org.jetbrains.annotations.NotNull;

public interface AbilityData {
    @NotNull
    String getName();

    @NotNull
    ConfigurationSection getConfig();
}
