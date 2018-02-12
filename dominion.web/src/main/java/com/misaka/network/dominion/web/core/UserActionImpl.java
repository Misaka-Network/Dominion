package com.misaka.network.dominion.web.core;

import com.alibaba.fastjson.JSON;
import com.misaka.network.dominion.web.data.Room;
import com.misaka.network.dominion.web.data.ServerStorage;
import com.misaka.network.dominion.web.data.UserHandleTextMessage;
import com.misaka.network.dominion.web.define.WebDefine;
import com.misaka.network.dominion.web.web.websocket.BuildWebSocketListener;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

import java.util.Map;

/**
 * Created by Luhaijie on 2018/2/12.
 */
public class UserActionImpl extends TextWebSocketHandler implements UserAction, BuildWebSocketListener {
    @Override
    public void beforeHandshake(Map<String, String> params) {
        addRoom(Integer.valueOf(params.get("userId")), Integer.valueOf(params.get("roomId")));
    }

    @Override
    public void afterHandshake() {

    }

    @Override
    protected void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {
        UserHandleTextMessage userMessage = JSON.parseObject(message.getPayload(), UserHandleTextMessage.class);
        switch (userMessage.getAction()) {
            case WebDefine.USER_ACTION.ADD_ROOM:
                addRoom(userMessage.getUserId(), userMessage.getRoomId());
                break;
            case WebDefine.USER_ACTION.EXIT_ROOM:
                exitRoom(userMessage.getRoomId(), userMessage.getUserId());
                break;
            case WebDefine.USER_ACTION.START_GAME:
                startGame(userMessage.getRoomId());
                break;
            case WebDefine.USER_ACTION.GAME_OPERATE:
//                GameEngine operate = JSON.parseObject(userMessage.getGameOperate(), GameEngine.class);
            default:
        }
    }

    @Override
    public void startGame(long roomId) throws Exception {
        Room room = ServerStorage.instance().getRoom(roomId);
        room.start();
        return;
    }

    @Override
    public void addRoom(long userId, long roomId) {
        ServerStorage.instance().getRoom(roomId).addPlayer(userId);
    }

    @Override
    public boolean reconnect(long roomId, long userId) throws Exception {
        return false;
    }

    @Override
    public boolean exitRoom(long roomId, long userId) throws Exception {
        return ServerStorage.instance().getRoom(roomId).delPlayer(userId);
    }
}
