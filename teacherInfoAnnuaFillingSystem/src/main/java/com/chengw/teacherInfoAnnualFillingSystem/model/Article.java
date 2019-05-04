package com.chengw.teacherInfoAnnualFillingSystem.model;

public class Article {

    private int aid;
    private String aname;
    private String apath;
    private String publisdate;
    private String publishreader;
    private String uploaddate;
    private String summary;
    private String usercode;

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    public String getApath() {
        return apath;
    }

    public void setApath(String apath) {
        this.apath = apath;
    }

    public String getPublisdate() {
        return publisdate;
    }

    public void setPublisdate(String publisdate) {
        this.publisdate = publisdate;
    }

    public String getPublishreader() {
        return publishreader;
    }

    public void setPublishreader(String publishreader) {
        this.publishreader = publishreader;
    }

    public String getUploaddate() {
        return uploaddate;
    }

    public void setUploaddate(String uploaddate) {
        this.uploaddate = uploaddate;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getUsercode() {
        return usercode;
    }

    public void setUsercode(String usercode) {
        this.usercode = usercode;
    }
}
