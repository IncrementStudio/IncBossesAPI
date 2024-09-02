package ru.incrementstudio.incbosses.api.bosses;

import org.bukkit.Location;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.incrementstudio.incbosses.api.bosses.phases.Phase;

import java.util.List;

public interface Boss {
    int getId();

    @NotNull
    BossData getData();

    @Nullable
    LivingEntity getEntity();

    void kill();

    void spawn(@NotNull Location location) throws IllegalArgumentException;

    boolean isAlive();

    @Nullable
    Player getKiller();

    @Nullable
    Player getLastDamager();

    double getHealth();

    double getNormalizedHealth();

    @Nullable
    Phase getCurrentPhase();

    @NotNull
    List<Phase> getPhases();

    void changePhase(@NotNull String name) throws IllegalArgumentException;

    void changePhase(int id) throws IllegalArgumentException;

    @NotNull
    DamageMap getDamageMap();

    @Nullable
    BossSpawnReason getSpawnReason();

    @Nullable
    BossDeathReason getDeathReason();
}