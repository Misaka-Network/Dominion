package com.misaka.network.dominion.web.data;

import com.misaka.network.dominion.core.Game;
import com.misaka.network.dominion.core.type.CardEnum;
import com.misaka.network.dominion.web.core.GameServer;
import org.springframework.web.socket.TextMessage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Luhaijie on 2017/12/24.
 */
public class Room implements GameServer {
    private static Long roomCounter = new Long(0);

    private long roomId;
    private boolean isStart = false;
    private Game game;
    private List<Long> playerList = new ArrayList<Long>();
    private List<CardEnum> cardEnumList = new ArrayList<CardEnum>();

    public Room(Game game) {
        synchronized (roomCounter) {
            this.roomId = roomCounter++;
        }
        this.game = game;
    }

    public synchronized void addPlayer(long playerId) {
        playerList.add(playerId);
    }

    public synchronized boolean delPlayer(long playerId) {
        return playerList.remove(playerId);
    }

    public long getRoomId() {
        return roomId;
    }

    public Game getGame() {
        return game;
    }

    public static Long getRoomCounter() {
        return roomCounter;
    }

    public List<Long> getPlayerList() {
        return playerList;
    }

    public boolean broadcast(String msg) {
        boolean result = true;
        for (Long userId : getPlayerList()) {
            try {
                ServerStorage.instance().getSessionMap().get(userId).sendMessage(new TextMessage(msg));
            } catch (Exception e) {
                result = false;
                System.out.println("send message fail: " + userId + " " + e.toString());
            }
        }
        return result;
    }

    @Override
    public void start() throws Exception {
        game.gameStart(playerList, cardEnumList);
        isStart = true;
    }

    @Override
    public void end() throws Exception {
        isStart = false;
    }

    @Override
    public boolean isStart() {
        return isStart;
    }
}
