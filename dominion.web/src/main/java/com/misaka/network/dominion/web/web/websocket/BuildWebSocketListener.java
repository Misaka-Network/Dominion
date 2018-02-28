package com.misaka.network.dominion.web.web.websocket;

import java.util.Map;

/**
 * Created by Luhaijie on 2018/2/12.
 */
@Deprecated
public interface BuildWebSocketListener {
    void beforeHandshake(Map<String, String> params);
    void afterHandshake();
}
