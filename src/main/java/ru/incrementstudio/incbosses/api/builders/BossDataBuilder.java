package ru.incrementstudio.incbosses.api.builders;

import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.entity.EntityType;
import org.jetbrains.annotations.NotNull;
import ru.incrementstudio.incbosses.api.bosses.*;

public final class BossDataBuilder {
    public BossDataBuilder(@NotNull String name, @NotNull BossData base) throws IllegalArgumentException {
    }

    public BossDataBuilder(@NotNull BossData base) {
    }

    public BossDataBuilder(@NotNull String name) throws IllegalArgumentException {
    }

    public BossDataBuilder(@NotNull String name, @NotNull ConfigurationSection config) throws IllegalArgumentException {
    }

    @NotNull
    public BossDataBuilder setBossName(@NotNull String bossName) {
        return this;
    }

    @NotNull
    public BossDataBuilder setDisplayName(@NotNull String displayName) {
        return this;
    }

    @NotNull
    public BossDataBuilder setEntityType(@NotNull EntityType entityType) throws IllegalArgumentException {
        return this;
    }

    @NotNull
    public BossDataBuilder setHealth(double health) {
        return this;
    }

    @NotNull
    public BossDataBuilder setGlowing(boolean glowing) {
        return this;
    }

    @NotNull
    public BossDataBuilder setBaby(boolean baby) {
        return this;
    }

    @NotNull
    public BossDataBuilder setBattleLimit(long battleLimit) {
        return this;
    }

    @NotNull
    public BossDataBuilder setBattleLimit(@NotNull String timeMetric) throws IllegalArgumentException {
        return this;
    }

    @NotNull
    public BossDataBuilder addPhases(@NotNull PhaseDataBuilder... builders) {
        return this;
    }

    @NotNull
    public BossDataBuilder removePhases(@NotNull String... names) {
        return this;
    }

    @NotNull
    public BossDataBuilder clearPhases() {
        return this;
    }

    @NotNull
    public BossDataBuilder setStartPhaseType(@NotNull StartPhaseType startPhaseType) {
        return this;
    }

    @NotNull
    public BossDataBuilder setStartPhaseName(@NotNull String startPhaseName) throws IllegalArgumentException {
        return this;
    }

    @NotNull
    public BossDataBuilder setEquipment(@NotNull Equipment equipment) {
        return this;
    }

    @NotNull
    public BossDataBuilder addDrops(@NotNull Drop... drops) {
        return this;
    }

    @NotNull
    public BossDataBuilder removeDrops(@NotNull Drop... drops) {
        return this;
    }

    @NotNull
    public BossDataBuilder clearDrops() {
        return this;
    }

    @NotNull
    public BossDataBuilder setDroppedExp(int droppedExp) {
        return this;
    }

    @NotNull
    public BossDataBuilder addAbilities(@NotNull AbilityData... abilities) {
        return this;
    }

    @NotNull
    public BossDataBuilder removeAbilities(@NotNull AbilityData... abilities) {
        return this;
    }

    @NotNull
    public BossDataBuilder clearAbilities() {
        return this;
    }

    @NotNull
    public BossDataBuilder addParameter(@NotNull String key, @NotNull Object value) {
        return this;
    }

    @NotNull
    public BossDataBuilder removeParameter(@NotNull String key) {
        return this;
    }

    @NotNull
    public BossData build() throws IllegalArgumentException {
        return null;
    }
}