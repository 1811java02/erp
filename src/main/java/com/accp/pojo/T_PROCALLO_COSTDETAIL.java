package com.accp.pojo;

public class T_PROCALLO_COSTDETAIL {
    private String billno;

    private String currid;

    private Integer feeclassid;

    private Double exchrate;

    private Double amount;

    public String getBillno() {
        return billno;
    }

    public void setBillno(String billno) {
        this.billno = billno == null ? null : billno.trim();
    }

    public String getCurrid() {
        return currid;
    }

    public void setCurrid(String currid) {
        this.currid = currid == null ? null : currid.trim();
    }

    public Integer getFeeclassid() {
        return feeclassid;
    }

    public void setFeeclassid(Integer feeclassid) {
        this.feeclassid = feeclassid;
    }

    public Double getExchrate() {
        return exchrate;
    }

    public void setExchrate(Double exchrate) {
        this.exchrate = exchrate;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }
}