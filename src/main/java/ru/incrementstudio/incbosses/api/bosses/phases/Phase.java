package ru.incrementstudio.incbosses.api.bosses.phases;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.incrementstudio.incbosses.api.bosses.Boss;

public interface Phase {
    int getId();

    @NotNull
    PhaseData getData();

    @NotNull
    Boss getBoss();

    @Nullable
    StartReason getStartReason();

    boolean isActive();

    long getDuration();
}