package ru.incrementstudio.incbosses.api.events;

import org.bukkit.Location;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Range;
import ru.incrementstudio.incbosses.api.bosses.Boss;
import ru.incrementstudio.incbosses.api.bosses.BossDeathReason;

import java.util.List;

public class BossDeathEvent extends Event {
    public static @NotNull HandlerList getHandlerList() {
        return null;
    }

    @Override
    public @NotNull HandlerList getHandlers() {
        return null;
    }

    public BossDeathEvent(@NotNull Boss boss, @NotNull List<String> message) {
    }

    @NotNull
    public Boss getBoss() {
        return null;
    }

    @NotNull
    public Location getLocation() {
        return null;
    }

    @NotNull
    public List<String> getMessage() {
        return null;
    }

    @NotNull
    public BossDeathReason getBossDeathReason() {
        return null;
    }

    @NotNull
    public List<ItemStack> getDrops() {
        return null;
    }

    @Range(from = 0, to = Integer.MAX_VALUE)
    public int getDroppedExp() {
        return 0;
    }

    public void setDroppedExp(@Range(from = 0, to = Integer.MAX_VALUE) int droppedExp) {
    }
}