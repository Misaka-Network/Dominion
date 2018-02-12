package com.misaka.network.dominion.web.web.websocket;

import com.misaka.network.dominion.web.core.UserActionImpl;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;

/**
 * Created by Luhaijie on 2018/2/12.
 */
@Configuration
@EnableWebSocket
public class WebSocketConfig implements WebSocketConfigurer {
    @Override
    public void registerWebSocketHandlers(WebSocketHandlerRegistry webSocketHandlerRegistry) {
        webSocketHandlerRegistry.addHandler(new UserActionImpl(), "/UserWSAction").addInterceptors(new UserInterceptor(new UserActionImpl()));
    }
}
