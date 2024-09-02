package ru.incrementstudio.incbosses.api.statistics;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public abstract class PropertyAdapter<T> {
    @Nullable
    public abstract T defaultValue();

    @NotNull
    public String getString(@Nullable T obj) {
        return null;
    }
}
