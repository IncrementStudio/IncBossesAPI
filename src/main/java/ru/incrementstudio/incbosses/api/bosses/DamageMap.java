package ru.incrementstudio.incbosses.api.bosses;

import org.bukkit.OfflinePlayer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Range;

import java.util.Map;

/**
 * Represents data on all damage dealt to the boss by players
 */
public interface DamageMap {
    @NotNull
    Map<OfflinePlayer, Double> getMap();

    @Nullable
    DamageData getByNickname(@NotNull String nickname);

    @Nullable
    DamageData getByPlayer(@NotNull OfflinePlayer player);

    @Nullable
    DamageData getByPlace(@Range(from = 1, to = Integer.MAX_VALUE) int place);

    interface DamageData {
        @NotNull
        OfflinePlayer player();

        double damage();
    }
}
