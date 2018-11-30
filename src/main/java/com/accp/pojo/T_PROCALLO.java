package com.accp.pojo;

import java.util.Date;

public class T_PROCALLO {
    private String billno;

    private Date billdate;

    private Integer assignstyle;

    private Double mlamount;

    private String maker;

    private String permitter;

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

    public Integer getAssignstyle() {
        return assignstyle;
    }

    public void setAssignstyle(Integer assignstyle) {
        this.assignstyle = assignstyle;
    }

    public Double getMlamount() {
        return mlamount;
    }

    public void setMlamount(Double mlamount) {
        this.mlamount = mlamount;
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker == null ? null : maker.trim();
    }

    public String getPermitter() {
        return permitter;
    }

    public void setPermitter(String permitter) {
        this.permitter = permitter == null ? null : permitter.trim();
    }

    public Integer getReviewstatus() {
        return reviewstatus;
    }

    public void setReviewstatus(Integer reviewstatus) {
        this.reviewstatus = reviewstatus;
    }
}