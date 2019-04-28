package com.bilibili.main.model;

public class Message {
    private String messageId;

    private String messageVideoId;

    private String messageUserId;

    private String messageUserName;

    private String messageTime;

    public String getMessageId() {
        return messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId == null ? null : messageId.trim();
    }

    public String getMessageVideoId() {
        return messageVideoId;
    }

    public void setMessageVideoId(String messageVideoId) {
        this.messageVideoId = messageVideoId == null ? null : messageVideoId.trim();
    }

    public String getMessageUserId() {
        return messageUserId;
    }

    public void setMessageUserId(String messageUserId) {
        this.messageUserId = messageUserId == null ? null : messageUserId.trim();
    }

    public String getMessageUserName() {
        return messageUserName;
    }

    public void setMessageUserName(String messageUserName) {
        this.messageUserName = messageUserName == null ? null : messageUserName.trim();
    }

    public String getMessageTime() {
        return messageTime;
    }

    public void setMessageTime(String messageTime) {
        this.messageTime = messageTime == null ? null : messageTime.trim();
    }
}