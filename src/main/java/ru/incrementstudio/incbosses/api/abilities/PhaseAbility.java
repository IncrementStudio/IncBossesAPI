package ru.incrementstudio.incbosses.api.abilities;

import org.bukkit.configuration.ConfigurationSection;
import org.jetbrains.annotations.NotNull;
import ru.incrementstudio.incbosses.api.bosses.Boss;
import ru.incrementstudio.incbosses.api.bosses.phases.Phase;
import ru.incrementstudio.incbosses.api.bosses.phases.StartReason;
import ru.incrementstudio.incbosses.api.bosses.phases.StopReason;

public abstract class PhaseAbility extends Ability {
    protected PhaseAbility(@NotNull AbilityAdapter abilityAdapter, @NotNull Boss boss, @NotNull Phase phase, @NotNull ConfigurationSection config) {
        super(abilityAdapter, boss, config);
    }

    public void start(@NotNull StartReason reason) {
    }

    public void stop(@NotNull StopReason reason) {
    }

    @NotNull
    public Phase getPhase() {
        return null;
    }
}