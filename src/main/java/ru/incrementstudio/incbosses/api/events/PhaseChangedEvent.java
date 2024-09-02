package ru.incrementstudio.incbosses.api.events;

import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;
import ru.incrementstudio.incbosses.api.bosses.Boss;
import ru.incrementstudio.incbosses.api.bosses.phases.Phase;

public class PhaseChangedEvent extends Event implements Cancellable {
    public static @NotNull HandlerList getHandlerList() {
        return null;
    }

    @Override
    public boolean isCancelled() {
        return false;
    }

    @Override
    public void setCancelled(boolean isCancelled) {
    }

    @Override
    public @NotNull HandlerList getHandlers() {
        return null;
    }

    public PhaseChangedEvent(@NotNull Boss boss, @NotNull Phase from, @NotNull Phase to) {
    }

    @NotNull
    public Boss getBoss() {
        return null;
    }

    @NotNull
    public Phase getFrom() {
        return null;
    }

    @NotNull
    public Phase getTo() {
        return null;
    }
}
