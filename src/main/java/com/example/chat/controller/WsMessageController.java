package com.example.chat.controller;

import com.example.chat.models.Message;
import com.example.chat.models.OutputMessage;
import com.example.chat.service.MessageService;
import lombok.RequiredArgsConstructor;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import javax.validation.constraints.NotNull;

@Controller
@RequiredArgsConstructor
public class WsMessageController {

    @NotNull
    final MessageService messageService;

    @MessageMapping("/chat")
    @SendTo("/topic/messages")
    public OutputMessage send(Message message) {
        return messageService.processMessage(message);
    }
}
