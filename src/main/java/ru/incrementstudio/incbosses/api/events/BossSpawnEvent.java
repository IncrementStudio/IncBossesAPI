package ru.incrementstudio.incbosses.api.events;

import org.bukkit.Location;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;
import ru.incrementstudio.incbosses.api.bosses.Boss;
import ru.incrementstudio.incbosses.api.bosses.BossSpawnReason;

import java.util.List;

public class BossSpawnEvent extends Event implements Cancellable {
    public static @NotNull HandlerList getHandlerList() {
        return null;
    }

    @Override
    public @NotNull HandlerList getHandlers() {
        return null;
    }

    @Override
    public boolean isCancelled() {
        return false;
    }

    @Override
    public void setCancelled(boolean isCancelled) {
    }

    public BossSpawnEvent(@NotNull Boss boss, @NotNull Location location, @NotNull List<String> message) {
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
    public BossSpawnReason getBossSpawnReason() {
        return null;
    }
}