package com.accp.pojo;

public class T_ADVANCERECEIPTDETAILS {
    private String fundbillid;

    private Integer linenumber;

    private Double curprerecv;

    private String sourcelist;

    private String sourcenumber;

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

    public Double getCurprerecv() {
        return curprerecv;
    }

    public void setCurprerecv(Double curprerecv) {
        this.curprerecv = curprerecv;
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

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }
}