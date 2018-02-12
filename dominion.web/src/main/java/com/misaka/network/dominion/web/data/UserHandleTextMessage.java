package com.misaka.network.dominion.web.data;

/**
 * Created by Luhaijie on 2018/2/12.
 */
public class UserHandleTextMessage {
    private long userId;
    private long roomId;
    private String action;

    private String gameOperate;

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public long getRoomId() {
        return roomId;
    }

    public void setRoomId(long roomId) {
        this.roomId = roomId;
    }

    public String getGameOperate() {
        return gameOperate;
    }

    public void setGameOperate(String gameOperate) {
        this.gameOperate = gameOperate;
    }
}
