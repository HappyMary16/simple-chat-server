package com.example.chat.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder(toBuilder = true)
@AllArgsConstructor
public class OutputMessage {

    private String username;
    private String messageText;
    private String time;
}
