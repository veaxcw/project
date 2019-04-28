package com.bilibili.main.model;

public class MessageWithBLOBs extends Message {
    private String message;

    private String messageHand;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message == null ? null : message.trim();
    }

    public String getMessageHand() {
        return messageHand;
    }

    public void setMessageHand(String messageHand) {
        this.messageHand = messageHand == null ? null : messageHand.trim();
    }
}