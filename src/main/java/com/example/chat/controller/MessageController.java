package com.example.chat.controller;

import com.example.chat.models.OutputMessage;
import com.example.chat.service.MessageService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotNull;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class MessageController {

    @NotNull
    final MessageService messageService;

    @GetMapping("/messages")
    public List<OutputMessage> getMessages() {
        return messageService.getMessages();
    }
}
