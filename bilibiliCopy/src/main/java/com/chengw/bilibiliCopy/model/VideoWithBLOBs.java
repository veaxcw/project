package com.bilibili.main.model;

public class VideoWithBLOBs extends Video {
    private String videoImage;

    private String vedioAddress;

    private String videoCollection;

    private String videoLeaving;

    public String getVideoImage() {
        return videoImage;
    }

    public void setVideoImage(String videoImage) {
        this.videoImage = videoImage == null ? null : videoImage.trim();
    }

    public String getVedioAddress() {
        return vedioAddress;
    }

    public void setVedioAddress(String vedioAddress) {
        this.vedioAddress = vedioAddress == null ? null : vedioAddress.trim();
    }

    public String getVideoCollection() {
        return videoCollection;
    }

    public void setVideoCollection(String videoCollection) {
        this.videoCollection = videoCollection == null ? null : videoCollection.trim();
    }

    public String getVideoLeaving() {
        return videoLeaving;
    }

    public void setVideoLeaving(String videoLeaving) {
        this.videoLeaving = videoLeaving == null ? null : videoLeaving.trim();
    }
}