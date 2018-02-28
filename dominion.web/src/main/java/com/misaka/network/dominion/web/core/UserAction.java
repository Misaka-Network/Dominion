package com.misaka.network.dominion.web.core;

/**
 * Created by Luhaijie on 2018/2/12.
 */
public interface UserAction {
    void startGame(long gameId) throws Exception;
    void addRoom(long userId, long roomId) throws Exception;
    boolean exitRoom(long userId, long roomId) throws Exception;
}
