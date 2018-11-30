package com.accp.pojo;

import java.util.Date;

public class T_SALES_RETURNS {
    private String billno;

    private Date billdate;

    private String addrid;

    private Integer priceoftax;

    private String currid;

    private String warename;

    private Double exchrate;

    private Integer isdeduct;

    private String dueto;

    private String salesname;

    private String maker;

    private String departname;

    private String permitter;

    private Integer auditedstate;

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

    public String getAddrid() {
        return addrid;
    }

    public void setAddrid(String addrid) {
        this.addrid = addrid == null ? null : addrid.trim();
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

    public String getWarename() {
        return warename;
    }

    public void setWarename(String warename) {
        this.warename = warename == null ? null : warename.trim();
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

    public String getDueto() {
        return dueto;
    }

    public void setDueto(String dueto) {
        this.dueto = dueto == null ? null : dueto.trim();
    }

    public String getSalesname() {
        return salesname;
    }

    public void setSalesname(String salesname) {
        this.salesname = salesname == null ? null : salesname.trim();
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker == null ? null : maker.trim();
    }

    public String getDepartname() {
        return departname;
    }

    public void setDepartname(String departname) {
        this.departname = departname == null ? null : departname.trim();
    }

    public String getPermitter() {
        return permitter;
    }

    public void setPermitter(String permitter) {
        this.permitter = permitter == null ? null : permitter.trim();
    }

    public Integer getAuditedstate() {
        return auditedstate;
    }

    public void setAuditedstate(Integer auditedstate) {
        this.auditedstate = auditedstate;
    }
}