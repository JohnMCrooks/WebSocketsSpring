/*
 * Copyright (c) 2016.
 */

package com.crooks;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.Message;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;

/**
 * Created by johncrooks on 6/30/16.
 */
@Controller
public class WebSocketController {
    static SimpMessagingTemplate messenger;  //allows you to send a message to any subscription route at any time.

    @Autowired
    public WebSocketController(SimpMessagingTemplate messenger){    //give us access to the messenger object so we can access it anywhere
        this.messenger = messenger;
    }

    @MessageMapping("/move")
    @SendTo("/move")
    public Message move(Message message){  //this is where you could add to or remove or edit the message but for this we won't alter anything
        return message;
    }


}
