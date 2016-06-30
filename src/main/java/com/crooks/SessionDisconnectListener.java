/*
 * Copyright (c) 2016.
 */

package com.crooks;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.messaging.SessionDisconnectEvent;

import java.util.HashMap;

/**
 * Created by johncrooks on 6/30/16.
 */
@Component
public class SessionDisconnectListener implements ApplicationListener<SessionDisconnectEvent> {


    @Override
    public void onApplicationEvent(SessionDisconnectEvent event) {
        String sessionId = event.getSessionId();            //get the players ID so we can pass it to the remove player subscription
        HashMap m = new HashMap();
        m.put("id", sessionId);          // stick the relevant info into a hashmap since it will be stuck into Json and sent to the front end
        WebSocketController.messenger.convertAndSend("/remove-player", m);
    }
}
