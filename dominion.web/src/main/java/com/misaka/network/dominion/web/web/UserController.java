package com.misaka.network.dominion.web.web;

import com.misaka.network.dominion.service.GameEngineDemo;
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
    public long newRoom() {
        Room room = new Room(new GameImpl(), new GameEngineDemo());
        long roomId = ServerStorage.instance().addRoom(room);
        return roomId;
    }
}
