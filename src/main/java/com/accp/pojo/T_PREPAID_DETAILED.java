package com.accp.pojo;

public class T_PREPAID_DETAILED {
    private String fundbillid;

    private Integer linenumber;

    private String sourcelist;

    private String sourcenumber;

    private String sourceorder;

    private String sourceordernumber;

    private Double curprerecv;

    private Double prepaidamount;

    private String remarks;

    public String getFundbillid() {
        return fundbillid;
    }

    public void setFundbillid(String fundbillid) {
        this.fundbillid = fundbillid == null ? null : fundbillid.trim();
    }

    public Integer getLinenumber() {
        return linenumber;
    }

    public void setLinenumber(Integer linenumber) {
        this.linenumber = linenumber;
    }

    public String getSourcelist() {
        return sourcelist;
    }

    public void setSourcelist(String sourcelist) {
        this.sourcelist = sourcelist == null ? null : sourcelist.trim();
    }

    public String getSourcenumber() {
        return sourcenumber;
    }

    public void setSourcenumber(String sourcenumber) {
        this.sourcenumber = sourcenumber == null ? null : sourcenumber.trim();
    }

    public String getSourceorder() {
        return sourceorder;
    }

    public void setSourceorder(String sourceorder) {
        this.sourceorder = sourceorder == null ? null : sourceorder.trim();
    }

    public String getSourceordernumber() {
        return sourceordernumber;
    }

    public void setSourceordernumber(String sourceordernumber) {
        this.sourceordernumber = sourceordernumber == null ? null : sourceordernumber.trim();
    }

    public Double getCurprerecv() {
        return curprerecv;
    }

    public void setCurprerecv(Double curprerecv) {
        this.curprerecv = curprerecv;
    }

    public Double getPrepaidamount() {
        return prepaidamount;
    }

    public void setPrepaidamount(Double prepaidamount) {
        this.prepaidamount = prepaidamount;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }
}