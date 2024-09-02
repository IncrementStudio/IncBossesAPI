package ru.incrementstudio.incbosses.api.builders;

import org.bukkit.configuration.ConfigurationSection;
import org.jetbrains.annotations.NotNull;
import ru.incrementstudio.incbosses.api.bosses.AbilityData;

public final class AbilityDataBuilder {
    public AbilityDataBuilder(@NotNull String name, @NotNull ConfigurationSection section) throws IllegalArgumentException {
    }

    public AbilityDataBuilder(@NotNull String name) throws IllegalArgumentException {
    }

    @NotNull
    public AbilityDataBuilder addParameter(@NotNull String path, @NotNull Object value) {
        return this;
    }

    @NotNull
    public AbilityDataBuilder removeParameter(@NotNull String path) {
        return this;
    }

    @NotNull
    public AbilityData build() {
        return null;
    }
}
