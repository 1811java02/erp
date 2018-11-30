package com.accp.pojo;

import java.util.Date;

public class T_BUYRETURN {
    private String billno;

    private Date billdate;

    private String custid;

    private String addrid;

    private String custaddress;

    private Integer priceoftax;

    private String currid;

    private String wareid;

    private Double exchrate;

    private Integer isdeduct;

    private String custombarfirst;

    private String custombarsecond;

    private String remark;

    private String salesid;

    private String departid;

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

    public String getCustid() {
        return custid;
    }

    public void setCustid(String custid) {
        this.custid = custid == null ? null : custid.trim();
    }

    public String getAddrid() {
        return addrid;
    }

    public void setAddrid(String addrid) {
        this.addrid = addrid == null ? null : addrid.trim();
    }

    public String getCustaddress() {
        return custaddress;
    }

    public void setCustaddress(String custaddress) {
        this.custaddress = custaddress == null ? null : custaddress.trim();
    }

    public Integer getPriceoftax() {
        return priceoftax;
    }

    public void setPriceoftax(Integer priceoftax) {
        this.priceoftax = priceoftax;
    }

    public String getCurrid() {
        return currid;
    }

    public void setCurrid(String currid) {
        this.currid = currid == null ? null : currid.trim();
    }

    public String getWareid() {
        return wareid;
    }

    public void setWareid(String wareid) {
        this.wareid = wareid == null ? null : wareid.trim();
    }

    public Double getExchrate() {
        return exchrate;
    }

    public void setExchrate(Double exchrate) {
        this.exchrate = exchrate;
    }

    public Integer getIsdeduct() {
        return isdeduct;
    }

    public void setIsdeduct(Integer isdeduct) {
        this.isdeduct = isdeduct;
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

    public String getSalesid() {
        return salesid;
    }

    public void setSalesid(String salesid) {
        this.salesid = salesid == null ? null : salesid.trim();
    }

    public String getDepartid() {
        return departid;
    }

    public void setDepartid(String departid) {
        this.departid = departid == null ? null : departid.trim();
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