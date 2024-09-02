package ru.incrementstudio.incbosses.api.statistics;

import org.jetbrains.annotations.NotNull;

import java.util.function.Function;

public interface Statistics {
    <T> void registerProperty(String name, Class<T> dataType, T defaultValue);

    <T> void registerProperty(String name, Class<T> dataType, T defaultValue, Function<T, String> getStringFunc);

    <T> void registerProperty(String name, Class<T> dataType, PropertyAdapter<T> adapter);

    <T> T get(String property, String nickname, Class<T> dataType);

    void set(String property, String nickname, Object value);

    @NotNull
    String applyData(String nickname, String string);
}
