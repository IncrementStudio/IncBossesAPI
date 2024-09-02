package ru.incrementstudio.incbosses.api.bosses;

import org.bukkit.entity.LivingEntity;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface Equipment {
    @Nullable
    ItemStack getMainHand();

    @Nullable
    ItemStack getSecondHand();

    @Nullable
    ItemStack getHelmet();

    @Nullable
    ItemStack getChestplate();

    @Nullable
    ItemStack getLeggings();

    @Nullable
    ItemStack getBoots();

    boolean hasMainHand();

    boolean hasSecondHand();

    boolean hasHelmet();

    boolean hasChestplate();

    boolean hasLeggings();

    boolean hasBoots();

    void apply(@NotNull LivingEntity entity);
}