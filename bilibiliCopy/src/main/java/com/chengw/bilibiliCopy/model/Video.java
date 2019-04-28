package com.bilibili.main.model;

public class Video {
    private String videoId;

    private String videoName;

    private String videoWatchTime;

    private String videotime;

    private String videoStatus;

    private String videoCategory;

    public String getVideoId() {
        return videoId;
    }

    public void setVideoId(String videoId) {
        this.videoId = videoId == null ? null : videoId.trim();
    }

    public String getVideoName() {
        return videoName;
    }

    public void setVideoName(String videoName) {
        this.videoName = videoName == null ? null : videoName.trim();
    }

    public String getVideoWatchTime() {
        return videoWatchTime;
    }

    public void setVideoWatchTime(String videoWatchTime) {
        this.videoWatchTime = videoWatchTime == null ? null : videoWatchTime.trim();
    }

    public String getVideotime() {
        return videotime;
    }

    public void setVideotime(String videotime) {
        this.videotime = videotime == null ? null : videotime.trim();
    }

    public String getVideoStatus() {
        return videoStatus;
    }

    public void setVideoStatus(String videoStatus) {
        this.videoStatus = videoStatus == null ? null : videoStatus.trim();
    }

    public String getVideoCategory() {
        return videoCategory;
    }

    public void setVideoCategory(String videoCategory) {
        this.videoCategory = videoCategory == null ? null : videoCategory.trim();
    }
}