package ru.incrementstudio.incbosses.api.abilities;

import org.bukkit.configuration.ConfigurationSection;
import org.jetbrains.annotations.NotNull;
import ru.incrementstudio.incbosses.api.bosses.Boss;
import ru.incrementstudio.incbosses.api.bosses.phases.Phase;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.logging.Logger;

public abstract class AbilityAdapter {
    @NotNull
    public final String getName() {
        return null;
    }

    @NotNull
    public Logger getLogger() {
        return null;
    }

    @NotNull
    public Map<String, Object> getMetadata() {
        return null;
    }

    public void registerTrigger(@NotNull String id, @NotNull AbilityAdapter abilityAdapter, @NotNull Consumer<Boss> trigger) {
    }

    public void unregisterTrigger(@NotNull String id, @NotNull AbilityAdapter abilityAdapter) {
    }

    protected void trigger(@NotNull String id, @NotNull Boss boss) {
    }

    public AbilityAdapter() {
    }

    public void onEnable() {
    }

    @NotNull
    public BossAbility getBossAbility(@NotNull Boss boss, @NotNull ConfigurationSection config) {
        return null;
    }

    @NotNull
    public PhaseAbility getPhaseAbility(@NotNull Boss boss, @NotNull Phase phase, @NotNull ConfigurationSection config) {
        return null;
    }
}