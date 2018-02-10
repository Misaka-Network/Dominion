package com.misaka.network.dominion.web;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;

/**
 * @author hyzhou.zhy. 2017/12/17.
 */
@SpringBootApplication
public class Main implements WebSocketConfigurer {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @Override
    public void registerWebSocketHandlers(WebSocketHandlerRegistry webSocketHandlerRegistry) {

    }
}
