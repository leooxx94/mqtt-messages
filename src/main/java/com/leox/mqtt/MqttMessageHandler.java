package com.leox.mqtt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageHandler;
import org.springframework.stereotype.Component;

@Component
public class MqttMessageHandler implements MessageHandler {

    @Autowired
    private MessageRepository messageRepository;

    @Override
    public void handleMessage(Message<?> message) {
        String content = message.getPayload().toString();
        MyMessage newMessage = new MyMessage();
        newMessage.setContent(content);
        messageRepository.save(newMessage);
    }
}