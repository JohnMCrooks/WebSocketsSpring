/*
 * Copyright (c) 2016.
 */

package com.crooks;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.config.annotation.AbstractWebSocketMessageBrokerConfigurer;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;

/**
 * Created by johncrooks on 6/30/16.
 */
@Configuration
@EnableWebSocketMessageBroker
public class Config extends AbstractWebSocketMessageBrokerConfigurer {


    @Override
    public void registerStompEndpoints(StompEndpointRegistry registry) {
        registry.addEndpoint("/socket").withSockJS();           //Sock JS builds on top of the websocket
    }
}
