/*
 * Copyright (c) 2016.
 */

package com.crooks;

import org.springframework.messaging.Message;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

/**
 * Created by johncrooks on 6/30/16.
 */
@Controller
public class WebSocketController {
    @MessageMapping("/move")
    @SendTo("/move")
    public Message move(Message message){  //this is where you could add to or remove or edit the message but for this we won't alter anything
        return message;
    }

}
