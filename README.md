# Simple chat

It is a server for a very simple chat.
It can save only specified number of messages and only in memory.

### Used technologies:
- Java 8
- Spring boot
- Websockets

You can find a client [here](https://github.com/HappyMary16/simple-chat-client). 

## Resources
### HTTP
```GET /messages```

*Returns a list of saved messages*

Response example:
```
[
  {
    "messageText": "Some text",
    "username": "Some name",
    "time": "12:35:10"
  }
]
```

### Websocket
```/chat```

*Socket to connect for chatting*

```/topic/messages```

*Topic to subscribe for receiving messages*

Message example:
```
{
   "messageText": "Some text",
   "username": "Some name",
   "time": "12:35:10"
}
```

```/app/chat```

*Topic to send messages*

Message example:
```
{
   "messageText": "Some text",
   "username": "Some name"
}
```



