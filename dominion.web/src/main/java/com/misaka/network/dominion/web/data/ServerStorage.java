package com.misaka.network.dominion.web.data;

import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.springframework.web.socket.WebSocketSession;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Luhaijie on 2017/12/23.
 */
public class ServerStorage {
    private static ServerStorage instance;

    private Map<Long, Room> roomMap = new HashMap<Long, Room>();
    private Map<Long, WebSocketSession> sessionMap = new HashMap<>();

    public synchronized long addRoom(Room room) {
        roomMap.put(room.getRoomId(), room);
        return room.getRoomId();
    }

    public static ServerStorage instance() {
        if (instance == null)
            instance = new ServerStorage();

        return instance;
    }

    public Room getRoom(long roomId) {
        return roomMap.get(roomId);
    }

    public Map<Long, Room> getRoomMap() {
        return roomMap;
    }

    public synchronized void addSession(Long userId, WebSocketSession session) {
        sessionMap.put(userId, session);
        return;
    }

    @JSONField(serialize = false)
    public Map<Long, WebSocketSession> getSessionMap() {
        return sessionMap;
    }

}
