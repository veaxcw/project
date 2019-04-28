package com.bilibili.main.model;

public class ForumWithBLOBs extends Forum {
    private String forumBt;

    private String forumMessage;

    private String forumHand;

    public String getForumBt() {
        return forumBt;
    }

    public void setForumBt(String forumBt) {
        this.forumBt = forumBt == null ? null : forumBt.trim();
    }

    public String getForumMessage() {
        return forumMessage;
    }

    public void setForumMessage(String forumMessage) {
        this.forumMessage = forumMessage == null ? null : forumMessage.trim();
    }

    public String getForumHand() {
        return forumHand;
    }

    public void setForumHand(String forumHand) {
        this.forumHand = forumHand == null ? null : forumHand.trim();
    }
}