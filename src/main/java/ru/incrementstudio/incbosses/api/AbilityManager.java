package ru.incrementstudio.incbosses.api;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.incrementstudio.incbosses.api.abilities.AbilityAdapter;

import java.io.File;
import java.util.List;
import java.util.Map;

public interface AbilityManager {
    @NotNull
    Map<String, AbilityAdapter> getAbilityAdapters();

    @Nullable
    AbilityAdapter getAbilityAdapter(@NotNull String name);

    boolean hasBossAbility(@NotNull String name);

    boolean hasPhaseAbility(@NotNull String name);

    boolean hasAbility(@NotNull String name);

    @NotNull
    File getDirectory();

    @NotNull
    List<File> getFiles();

    @Nullable
    Map<String, Object> getMetadata(String name);
}
