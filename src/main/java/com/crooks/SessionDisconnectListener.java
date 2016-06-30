/*
 * Copyright (c) 2016.
 */

package com.crooks;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.messaging.SessionDisconnectEvent;

/**
 * Created by johncrooks on 6/30/16.
 */
@Component
public class SessionDisconnectListener implements ApplicationListener<SessionDisconnectEvent> {


    @Override
    public void onApplicationEvent(SessionDisconnectEvent event) {

    }
}
