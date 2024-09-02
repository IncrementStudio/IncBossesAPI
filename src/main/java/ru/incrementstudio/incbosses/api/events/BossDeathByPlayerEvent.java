package ru.incrementstudio.incbosses.api.events;

import org.bukkit.entity.Player;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;
import ru.incrementstudio.incbosses.api.bosses.Boss;

import java.util.List;

public class BossDeathByPlayerEvent extends BossDeathEvent {
    public static @NotNull HandlerList getHandlerList() {
        return null;
    }

    @Override
    public @NotNull HandlerList getHandlers() {
        return null;
    }

    public BossDeathByPlayerEvent(@NotNull Boss boss, @NotNull List<String> message) {
        super(boss, message);
    }

    @NotNull
    public Player getKiller() {
        return null;
    }
}
