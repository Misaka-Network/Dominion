package com.misaka.network.dominion.web.core;

/**
 * Created by Luhaijie on 2017/12/23.
 */
public interface GameServer {
    void start() throws Exception;
    void end() throws Exception;
    boolean isStart();
}
