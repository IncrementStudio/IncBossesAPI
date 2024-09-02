package ru.incrementstudio.incbosses.api.bosses.phases;

import org.jetbrains.annotations.NotNull;
import ru.incrementstudio.incbosses.api.bosses.AbilityData;
import ru.incrementstudio.incbosses.api.bosses.BossData;

import java.util.List;
import java.util.Map;

public interface PhaseData {
    @NotNull
    BossData getBossData();

    @NotNull
    String getName();

    @NotNull
    String getPhaseName();

    @NotNull
    Map<String, TransitionData> getTransitions();

    @NotNull
    List<AbilityData> getAbilities();
}