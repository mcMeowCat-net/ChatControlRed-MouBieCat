package net.moubiecat.chatcontrol.database;

import org.jetbrains.annotations.NotNull;

import java.util.UUID;

public final class Data {
    private final UUID uuid;
    private boolean first;

    /**
     * 建構子
     *
     * @param uuid 玩家
     */
    public Data(@NotNull UUID uuid) {
        this(uuid, true);
    }

    /**
     * 建構子
     *
     * @param player 玩家
     * @param first  是否為第一次發言
     */
    public Data(@NotNull UUID player, boolean first) {
        this.uuid = player;
        this.first = first;
    }

    /**
     * 取得玩家
     *
     * @return 玩家
     */
    public @NotNull UUID getPlayer() {
        return this.uuid;
    }

    /**
     * 取得是否為第一次發言
     *
     * @return 是否為第一次發言
     */
    public boolean isFirst() {
        return this.first;
    }

    /**
     * 設定不是第一次發言狀態
     */
    public void setNoFirst() {
        this.first = false;
    }
}
