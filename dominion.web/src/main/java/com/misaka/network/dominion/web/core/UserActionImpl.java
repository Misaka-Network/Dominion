package com.misaka.network.dominion.web.core;

import com.alibaba.fastjson.JSON;
import com.misaka.network.dominion.service.api.GameEngine;
import com.misaka.network.dominion.web.data.Room;
import com.misaka.network.dominion.web.data.ServerStorage;
import com.misaka.network.dominion.web.data.UserHandleTextMessage;
import com.misaka.network.dominion.web.define.WebDefine;
import com.misaka.network.dominion.web.utils.HttpHelper;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

import java.lang.reflect.Method;
import java.util.Map;

/**
 * Created by Luhaijie on 2018/2/12.
 */
public class UserActionImpl extends TextWebSocketHandler implements UserAction {
    @Override
    public void afterConnectionEstablished(WebSocketSession session) throws Exception {
        Map<String, String> params = HttpHelper.spiltHttpParams(session.getUri().getQuery());
        ServerStorage.instance().addSession(Long.parseLong(params.get("userId")), session);
        //TODO: 建立链接后不应该马上addRoom，仅作拆分params的demo
        addRoom(Long.parseLong(params.get("userId")), Long.parseLong(params.get("roomId")));
        super.afterConnectionEstablished(session);
    }

    @Override
    protected void handleTextMessage(WebSocketSession session, TextMessage message) {
        try {
            UserHandleTextMessage userMessage = JSON.parseObject(message.getPayload(), UserHandleTextMessage.class);
            switch (userMessage.getAction()) {
                case WebDefine.USER_ACTION.ADD_ROOM:
                    addRoom(userMessage.getUserId(), userMessage.getRoomId());
                    session.sendMessage(new TextMessage("add room" + userMessage.getRoomId() + " succeed!"));
                    break;
                case WebDefine.USER_ACTION.EXIT_ROOM:
                    exitRoom(userMessage.getRoomId(), userMessage.getUserId());
                    session.sendMessage(new TextMessage("exit room" + userMessage.getRoomId() + " succeed!"));
                    break;
                case WebDefine.USER_ACTION.START_GAME:
                    startGame(userMessage.getRoomId());
                    session.sendMessage(new TextMessage("start game " + userMessage.getRoomId() + " succeed!"));
                    break;
                case WebDefine.USER_ACTION.GAME_OPERATE:
                    GameEngine engine = ServerStorage.instance().getRoom(userMessage.getRoomId()).getGameEngine();
                    Method method = engine.getClass().getMethod(userMessage.getGameOperate().getName(), userMessage.getGameOperate().getParameterTypes());
                    method.invoke(engine, userMessage.getGameOperate().getParams());
//                    GameEngine operate = JSON.parseObject(userMessage.getGameOperate(), GameEngine.class);
                default:
            }
        } catch (Exception e) {
            System.out.println("handle message error: " + e);
        }
    }

    @Override
    public void startGame(long roomId) throws Exception {
        Room room = ServerStorage.instance().getRoom(roomId);
        room.broadcast("start room: " + roomId);
        room.start();
        return;
    }

    @Override
    public void addRoom(long userId, long roomId) {
        ServerStorage.instance().getRoom(roomId).addPlayer(userId);
    }

    @Override
    public boolean exitRoom(long userId, long roomId) throws Exception {
        return ServerStorage.instance().getRoom(roomId).delPlayer(userId);
    }
}
