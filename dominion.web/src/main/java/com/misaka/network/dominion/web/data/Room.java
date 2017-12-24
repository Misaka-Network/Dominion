package com.misaka.network.dominion.web.data;

import com.misaka.network.dominion.core.Game;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Luhaijie on 2017/12/24.
 */
public class Room extends Thread {
    private static Long roomCounter = new Long(0);
    private long roomId;
    private Game game;
    private List<Long> playerList = new ArrayList<Long>();

    public Room(Game game) {
        synchronized (roomCounter) {
            this.roomId = roomCounter++;
        }
        this.game = game;
    }

    @Override
    public void run() {
        super.run();
        long heartbeat = 0;
        while(true) {
            try {
                Thread.sleep(1000);
                System.out.println("Room heartbeat: " + heartbeat++);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public synchronized void addPlayer(long playerId){
        playerList.add(playerId);
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
}
