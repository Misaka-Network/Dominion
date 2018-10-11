package com.misaka.network.dominion.web.data;

/**
 * Created by Luhaijie on 2018/2/12.
 */
public class UserHandleTextMessage {
    private long userId;
    private long roomId;
    private String action;

    private GameOperate gameOperate;

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

    public GameOperate getGameOperate() {
        return gameOperate;
    }

    public void setGameOperate(GameOperate gameOperate) {
        this.gameOperate = gameOperate;
    }

    public void setRoomId(long roomId) {
        this.roomId = roomId;
    }

    public class GameOperate {
        private String name;
        private Object[] params;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Object[] getParams() {
            return params;
        }

        public void setParams(Object[] params) {
            this.params = params;
        }
    }

}
