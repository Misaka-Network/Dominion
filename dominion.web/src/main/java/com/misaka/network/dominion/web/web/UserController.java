package com.misaka.network.dominion.web.web;

import com.misaka.network.dominion.service.GameImpl;
import com.misaka.network.dominion.web.data.Room;
import com.misaka.network.dominion.web.data.ServerStorage;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Luhaijie on 2017/12/23.
 */
@RestController
@RequestMapping("/userAction")
public class UserController {
    @RequestMapping(value = "/newRoom", method = RequestMethod.GET)
    public long startGame(@RequestParam(value = "userId", required = true, defaultValue = "") long userId) {
        Room room = new Room(new GameImpl());
        room.addPlayer(userId);
        room.start();
        long roomId = ServerStorage.instance().addRoom(room);
        return roomId;
    }

    @RequestMapping(value = "/addRoom", method = RequestMethod.GET)
    public boolean addGame(@RequestParam(value = "userId", required = true, defaultValue = "") long userId,
                           @RequestParam(value = "roomId", required = true, defaultValue = "") long roomId) {
        ServerStorage.instance().getRoom(roomId).addPlayer(userId);
        return false;
    }

    //TODO: startGame should connect by webSocket
//    @RequestMapping(value = "/startGame", method = RequestMethod.GET)
//    public long startGame(@RequestParam(value = "userId", required = true, defaultValue = "") long userId,
//                             @RequestParam(value = "userId", required = true, defaultValue = "") long gameId) {
//        Game game = ServerStorage.instance().getGame(gameId);
//        return game.gameStart();
//    }



}
