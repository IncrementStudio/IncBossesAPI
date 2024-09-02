package ru.incrementstudio.incbosses.api;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.incrementstudio.incbosses.api.bosses.Boss;
import ru.incrementstudio.incbosses.api.bosses.BossData;

import java.io.File;
import java.util.List;
import java.util.Map;

public interface BossManager {
    @NotNull
    File getDirectory();

    @NotNull
    List<File> getFiles();

    @NotNull
    Map<String, BossData> getBossData();

    @NotNull
    Map<Integer, Boss> getBosses();

    @NotNull
    Boss getBoss(int id) throws IllegalArgumentException;

    @NotNull
    Boss createBoss(@NotNull String name) throws IllegalArgumentException;

    @NotNull
    Boss createBoss(@NotNull BossData bossData);

    @Nullable
    BossData getBossData(@NotNull String name);

    void reloadBosses();
}
