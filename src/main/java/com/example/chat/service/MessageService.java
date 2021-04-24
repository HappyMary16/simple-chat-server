package com.example.chat.service;

import com.example.chat.models.Message;
import com.example.chat.models.OutputMessage;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

@Service
public class MessageService {

    @Value("${max-message-number}")
    private int maxMessageNumber;

    private final LinkedList<OutputMessage> messages = new LinkedList<>();

    public OutputMessage processMessage(final Message message) {
        final OutputMessage outputMessage = OutputMessage.builder()
                .username(message.getUsername())
                .messageText(message.getMessageText())
                .time(new SimpleDateFormat("HH:mm:ss").format(new Date()))
                .build();

        saveMessage(outputMessage);
        return outputMessage;
    }

    public List<OutputMessage> getMessages() {
        return messages;
    }

    private void saveMessage(final OutputMessage message) {
        messages.addLast(message);
        if (messages.size() > maxMessageNumber) {
            messages.removeFirst();
        }
    }
}
