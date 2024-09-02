package ru.incrementstudio.incbosses.api.abilities;

import org.jetbrains.annotations.NotNull;

public abstract class Ability {
    @NotNull
    public AbilityAdapter getAbilityAdapter() {
        return null;
    }

    public Ability(@NotNull AbilityAdapter abilityAdapter) {
    }
}
