package ru.incrementstudio.incbosses.api.abilities;

import org.bukkit.configuration.ConfigurationSection;
import org.jetbrains.annotations.NotNull;
import ru.incrementstudio.incbosses.api.bosses.Boss;
import ru.incrementstudio.incbosses.api.bosses.phases.Phase;

public abstract class BossAbility extends Ability {
    public BossAbility(@NotNull AbilityAdapter abilityAdapter, @NotNull Boss boss, @NotNull ConfigurationSection config) {
        super(abilityAdapter);
    }

    public void onPhaseChanged(@NotNull Phase from, @NotNull Phase to) {
    }

    public void start() {
    }

    public void stop() {
    }

    @NotNull
    public Boss getBoss() {
        return null;
    }

    @NotNull
    public ConfigurationSection getConfig() {
        return null;
    }
}