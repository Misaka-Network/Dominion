package com.misaka.network.dominion.web.web;

import com.alibaba.fastjson.JSON;
import com.misaka.network.dominion.web.data.ServerStorage;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Luhaijie on 2017/12/24.
 */
@RestController
public class ServerController {
    @RequestMapping(value = "/status", method = RequestMethod.GET)
    public String getState() {
        return JSON.toJSONString(ServerStorage.instance());
    }

    @RequestMapping(value = "/checkRoom", method = RequestMethod.GET)
    public String checkRoom(@RequestParam(value = "roomId", required = true, defaultValue = "") long roomId) {
        return JSON.toJSONString(ServerStorage.instance().getRoom(roomId));
    }
}
