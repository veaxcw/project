package com.bilibili.main.model;

public class Forum {
    private String forumId;

    private String forumUserName;

    private String forumTime;

    private String forumList;

    private String forumAmount;

    public String getForumId() {
        return forumId;
    }

    public void setForumId(String forumId) {
        this.forumId = forumId == null ? null : forumId.trim();
    }

    public String getForumUserName() {
        return forumUserName;
    }

    public void setForumUserName(String forumUserName) {
        this.forumUserName = forumUserName == null ? null : forumUserName.trim();
    }

    public String getForumTime() {
        return forumTime;
    }

    public void setForumTime(String forumTime) {
        this.forumTime = forumTime == null ? null : forumTime.trim();
    }

    public String getForumList() {
        return forumList;
    }

    public void setForumList(String forumList) {
        this.forumList = forumList == null ? null : forumList.trim();
    }

    public String getForumAmount() {
        return forumAmount;
    }

    public void setForumAmount(String forumAmount) {
        this.forumAmount = forumAmount == null ? null : forumAmount.trim();
    }
}