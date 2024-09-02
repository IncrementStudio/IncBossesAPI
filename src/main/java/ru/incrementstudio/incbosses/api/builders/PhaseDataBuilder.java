package ru.incrementstudio.incbosses.api.builders;

import org.jetbrains.annotations.NotNull;
import ru.incrementstudio.incbosses.api.bosses.AbilityData;
import ru.incrementstudio.incbosses.api.bosses.BossData;
import ru.incrementstudio.incbosses.api.bosses.phases.PhaseData;
import ru.incrementstudio.incbosses.api.bosses.phases.TransitionData;

import java.util.Map;

public final class PhaseDataBuilder {
    public PhaseDataBuilder(@NotNull PhaseData base) {
    }

    public PhaseDataBuilder(@NotNull String name) throws IllegalArgumentException {
    }

    public PhaseDataBuilder(@NotNull String name, @NotNull PhaseData base) throws IllegalArgumentException {
    }


    @NotNull
    public PhaseDataBuilder setPhaseName(@NotNull String phaseName) {
        return this;
    }

    @NotNull
    public PhaseDataBuilder addTransitions(@NotNull Map<String, TransitionData> transitions) {
        return this;
    }

    @NotNull
    public PhaseDataBuilder removeTransitions(@NotNull String... phases) {
        return this;
    }

    @NotNull
    public PhaseDataBuilder clearTransitions() {
        return this;
    }

    @NotNull
    public PhaseDataBuilder addAbilities(@NotNull AbilityData... abilities) {
        return this;
    }

    @NotNull
    public PhaseDataBuilder removeAbilities(@NotNull AbilityData... abilities) {
        return this;
    }

    @NotNull
    public PhaseDataBuilder clearAbilities() {
        return this;
    }

    @NotNull
    public PhaseData build(@NotNull BossData bossData) {
        return null;
    }

    @NotNull
    public String getName() {
        return null;
    }
}