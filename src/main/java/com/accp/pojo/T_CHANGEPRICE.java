package com.accp.pojo;

import java.util.Date;

public class T_CHANGEPRICE {
    private String billno;

    private Date billdate;

    private Integer regulating;

    private String custombarfirst;

    private String custombarsecond;

    private String remark;

    private Integer maker;

    private Integer permitter;

    private Integer reviewstatus;

    public String getBillno() {
        return billno;
    }

    public void setBillno(String billno) {
        this.billno = billno == null ? null : billno.trim();
    }

    public Date getBilldate() {
        return billdate;
    }

    public void setBilldate(Date billdate) {
        this.billdate = billdate;
    }

    public Integer getRegulating() {
        return regulating;
    }

    public void setRegulating(Integer regulating) {
        this.regulating = regulating;
    }

    public String getCustombarfirst() {
        return custombarfirst;
    }

    public void setCustombarfirst(String custombarfirst) {
        this.custombarfirst = custombarfirst == null ? null : custombarfirst.trim();
    }

    public String getCustombarsecond() {
        return custombarsecond;
    }

    public void setCustombarsecond(String custombarsecond) {
        this.custombarsecond = custombarsecond == null ? null : custombarsecond.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Integer getMaker() {
        return maker;
    }

    public void setMaker(Integer maker) {
        this.maker = maker;
    }

    public Integer getPermitter() {
        return permitter;
    }

    public void setPermitter(Integer permitter) {
        this.permitter = permitter;
    }

    public Integer getReviewstatus() {
        return reviewstatus;
    }

    public void setReviewstatus(Integer reviewstatus) {
        this.reviewstatus = reviewstatus;
    }
}