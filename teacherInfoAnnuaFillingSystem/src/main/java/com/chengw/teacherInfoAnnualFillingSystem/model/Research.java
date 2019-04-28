package main.model;

public class Research {
    private int rid;
    private String rname;
    private String rpath;
    private String publishdate;
    private String publishreader;
    private String uploaddate;
    private String summary;
    private String funds;
    private String usercode;

    public int getRid() {
        return rid;
    }

    public void setRid(int rid) {
        this.rid = rid;
    }

    public String getRname() {
        return rname;
    }

    public void setRname(String rname) {
        this.rname = rname;
    }

    public String getRpath() {
        return rpath;
    }

    public void setRpath(String rpath) {
        this.rpath = rpath;
    }

    public String getPublishdate() {
        return publishdate;
    }

    public void setPublishdate(String publishdate) {
        this.publishdate = publishdate;
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

    public String getFunds() {
        return funds;
    }

    public void setFunds(String funds) {
        this.funds = funds;
    }

    public String getUsercode() {
        return usercode;
    }

    public void setUsercode(String usercode) {
        this.usercode = usercode;
    }

    /*public void modify(Research research){//修改research

        if(this.rid != research.rid || !this.usercode.equals(research.usercode)){
            System.out.println("wrong");
        }else if(!this.rname.equals(research.rname)&& research.rname != null){
            this.setRname(research.rname);
        }else if(!this.funds.equals(research.funds)&& research.funds != null){
            this.setFunds(research.funds);
        }else if(!this.publishdate.equals(research.publishdate)&& research.publishdate != null){
            this.setPublishdate(research.publishdate);
        }else if(!this.publishreader.equals(research.publishreader)&& research.publishreader != null){
            this.setPublishdate(research.publishreader);
        }else if(!this.rpath.equals(research.rpath)&& research.rpath != null){
            this.setRpath(research.rpath);
        }else if(!this.summary.equals(research.summary)&&research.summary != null){
            this.setSummary(research.summary);
        }else if(!this.uploaddate.equals(research.uploaddate)&& research.uploaddate != null){
            this.setUploaddate(research.uploaddate);
        }

    }*/

    @Override
    public String toString() {
        return  "rid:" + rid + "\n" +
                "rname:" + rname + "\n" +
                "rpath:" + rpath + "\n" +
                "publishreader:" + publishreader + "\n" +
                "publishdate:" + publishdate + "\n" +
                "usercode:" + usercode + "\n" +
                "uploaddate:" + uploaddate + "\n" +
                "funds:" + funds + "\n" +
                "summary:" + summary;
    }
}
