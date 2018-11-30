package com.accp.pojo;

public class T_PAYINADVANCE_DETAILED {
    private String fundbillid;

    private Integer linenumber;

    private String sourcelist;

    private String sourcenumber;

    private Double prepaidamount;

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

    public Double getPrepaidamount() {
        return prepaidamount;
    }

    public void setPrepaidamount(Double prepaidamount) {
        this.prepaidamount = prepaidamount;
    }
}