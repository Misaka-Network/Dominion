package com.misaka.network.dominion.web.web.websocket;

import com.misaka.network.dominion.web.utils.HttpHelper;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.socket.WebSocketHandler;
import org.springframework.web.socket.server.support.HttpSessionHandshakeInterceptor;

import java.util.Map;

/**
 * Created by Luhaijie on 2018/2/11.
 */
public class UserInterceptor extends HttpSessionHandshakeInterceptor {
    private BuildWebSocketListener userActionListener;

    @Override
    public boolean beforeHandshake(ServerHttpRequest request, ServerHttpResponse response, WebSocketHandler wsHandler, Map<String, Object> attributes) throws Exception {
        userActionListener.beforeHandshake(HttpHelper.spiltHttpParams(request.getURI().getQuery()));
        return super.beforeHandshake(request, response, wsHandler, attributes);
    }

    @Override
    public void afterHandshake(ServerHttpRequest request, ServerHttpResponse response, WebSocketHandler wsHandler, Exception ex) {
        userActionListener.afterHandshake();
        super.afterHandshake(request, response, wsHandler, ex);
    }

    public UserInterceptor(BuildWebSocketListener userActionListener) {
        this.userActionListener = userActionListener;
    }
}
