package com.misaka.network.dominion.web.data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Luhaijie on 2017/12/23.
 */
public class ServerStorage {
    private static ServerStorage instance;

    private List<Long>userIdList = new ArrayList<Long>();
    private Map<Long, Room> roomMap = new HashMap<Long, Room>();

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

    public static ServerStorage getInstance() {
        return instance;
    }

    public List<Long> getUserIdList() {
        return userIdList;
    }

    public Map<Long, Room> getRoomMap() {
        return roomMap;
    }

}
