package com.bilibili.main.model;

import java.util.Date;

public class ForumReply {
    private String replyId;

    private Date replyTime;

    private String replyHand;

    private String replyPostId;

    private String replyName;

    private String replyContent;

    public String getReplyId() {
        return replyId;
    }

    public void setReplyId(String replyId) {
        this.replyId = replyId == null ? null : replyId.trim();
    }

    public Date getReplyTime() {
        return replyTime;
    }

    public void setReplyTime(Date replyTime) {
        this.replyTime = replyTime;
    }

    public String getReplyHand() {
        return replyHand;
    }

    public void setReplyHand(String replyHand) {
        this.replyHand = replyHand == null ? null : replyHand.trim();
    }

    public String getReplyPostId() {
        return replyPostId;
    }

    public void setReplyPostId(String replyPostId) {
        this.replyPostId = replyPostId == null ? null : replyPostId.trim();
    }

    public String getReplyName() {
        return replyName;
    }

    public void setReplyName(String replyName) {
        this.replyName = replyName == null ? null : replyName.trim();
    }

    public String getReplyContent() {
        return replyContent;
    }

    public void setReplyContent(String replyContent) {
        this.replyContent = replyContent == null ? null : replyContent.trim();
    }
}