package ru.incrementstudio.incbosses.api.bosses;

import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.Nullable;

@FunctionalInterface
public interface Drop {
    @Nullable
    ItemStack getItem();
}
