package ru.incrementstudio.incbosses.api.builders;

import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;
import ru.incrementstudio.incbosses.api.bosses.Drop;

public final class DropBuilder {
    public DropBuilder(@NotNull ItemStack item, double chance, int minAmount, int maxAmount) {
    }

    public DropBuilder(@NotNull ItemStack item, double chance, int amount) {
    }

    public DropBuilder(@NotNull ItemStack item, int amount) {
    }

    public DropBuilder(@NotNull ItemStack item, double chance) {
    }

    public DropBuilder(@NotNull ItemStack item) {
    }

    @NotNull
    public DropBuilder setItem(@NotNull ItemStack item) {
        return this;
    }

    @NotNull
    public DropBuilder setChance(double chance) {
        return this;
    }

    @NotNull
    public DropBuilder setAmount(int amount) {
        return this;
    }

    @NotNull
    public DropBuilder setAmount(int minAmount, int maxAmount) {
        return this;
    }

    @NotNull
    public Drop build() {
        return null;
    }
}