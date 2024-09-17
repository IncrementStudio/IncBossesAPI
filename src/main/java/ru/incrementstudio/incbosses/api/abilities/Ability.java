package ru.incrementstudio.incbosses.api.abilities;

import org.bukkit.configuration.ConfigurationSection;
import org.jetbrains.annotations.NotNull;
import ru.incrementstudio.incbosses.api.bosses.Boss;

public abstract class Ability {
    @NotNull
    public AbilityAdapter getAbilityAdapter() {
        return null;
    }

    @NotNull
    public Boss getBoss() {
        return null;
    }

    @NotNull
    public ConfigurationSection getConfig() {
        return null;
    }

    public Ability(@NotNull AbilityAdapter abilityAdapter, @NotNull Boss boss, @NotNull ConfigurationSection config) {
    }
}