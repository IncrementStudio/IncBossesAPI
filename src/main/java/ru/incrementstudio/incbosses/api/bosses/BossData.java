package ru.incrementstudio.incbosses.api.bosses;

import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.entity.EntityType;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Range;
import ru.incrementstudio.incbosses.api.bosses.phases.PhaseData;

import java.util.List;
import java.util.Map;

public interface BossData {
    @NotNull
    String getName();

    @NotNull
    String getBossName();

    @NotNull
    String getDisplayName();

    @NotNull
    EntityType getEntityType();

    double getHealth();

    boolean isGlowing();

    boolean isBaby();

    @NotNull
    Map<String, PhaseData> getPhaseData();

    @NotNull
    Equipment getEquipment();

    @NotNull
    List<AbilityData> getAbilities();

    @NotNull
    List<Drop> getDropData();

    @NotNull
    List<ItemStack> getDrops();

    @Range(from = 0, to = Integer.MAX_VALUE)
    int getDroppedExp();

    @Range(from = 0, to = Long.MAX_VALUE)
    long getBattleLimit();

    @NotNull
    StartPhaseType getStartPhaseType();

    @NotNull
    String getStartPhaseName();

    @NotNull
    ConfigurationSection getConfig();
}