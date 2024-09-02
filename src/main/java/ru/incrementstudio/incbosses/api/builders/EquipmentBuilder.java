package ru.incrementstudio.incbosses.api.builders;

import org.bukkit.entity.LivingEntity;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.incrementstudio.incbosses.api.bosses.Equipment;

public final class EquipmentBuilder {
    public EquipmentBuilder(@Nullable ItemStack mainHand, @Nullable ItemStack secondHand, @Nullable ItemStack helmet, @Nullable ItemStack chestplate, @Nullable ItemStack leggings, @Nullable ItemStack boots) {
    }

    public EquipmentBuilder(@Nullable ItemStack mainHand, @Nullable ItemStack secondHand) {
    }

    public EquipmentBuilder(@Nullable ItemStack mainHand) {
    }

    public EquipmentBuilder() {
    }

    @NotNull
    public EquipmentBuilder setMainHand(@Nullable ItemStack mainHand) {
        return this;
    }

    @NotNull
    public EquipmentBuilder setSecondHand(@Nullable ItemStack secondHand) {
        return this;
    }

    @NotNull
    public EquipmentBuilder setHelmet(@Nullable ItemStack helmet) {
        return this;
    }

    @NotNull
    public EquipmentBuilder setChestplate(@Nullable ItemStack chestplate) {
        return this;
    }

    @NotNull
    public EquipmentBuilder setLeggings(@Nullable ItemStack leggings) {
        return this;
    }

    @NotNull
    public EquipmentBuilder setBoots(@Nullable ItemStack boots) {
        return this;
    }

    @NotNull
    public EquipmentBuilder apply(@NotNull LivingEntity... entities) {
        return this;
    }

    @NotNull
    public Equipment build() {
        return null;
    }
}