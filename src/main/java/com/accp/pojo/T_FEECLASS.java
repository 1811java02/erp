package com.accp.pojo;

public class T_FEECLASS {
    private Integer feeclassid;

    private String feeclassname;

    private String feeclassremark;

    public Integer getFeeclassid() {
        return feeclassid;
    }

    public void setFeeclassid(Integer feeclassid) {
        this.feeclassid = feeclassid;
    }

    public String getFeeclassname() {
        return feeclassname;
    }

    public void setFeeclassname(String feeclassname) {
        this.feeclassname = feeclassname == null ? null : feeclassname.trim();
    }

    public String getFeeclassremark() {
        return feeclassremark;
    }

    public void setFeeclassremark(String feeclassremark) {
        this.feeclassremark = feeclassremark == null ? null : feeclassremark.trim();
    }
}