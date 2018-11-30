package com.accp.pojo;

import java.util.Date;

public class T_SALESORDER {
    private String billno;

    private Date billdate;

    private String customerid;

    private String addressid;

    private String billstyleid;

    private String billstylename;

    private String custbillno;

    private Short taxincluded;

    private String currid;

    private String remark;

    private Double exchrate;

    private String salesname;

    private String departid;

    private String projectid;

    private String maker;

    private String permitter;

    private Integer modpricestate;

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

    public String getCustomerid() {
        return customerid;
    }

    public void setCustomerid(String customerid) {
        this.customerid = customerid == null ? null : customerid.trim();
    }

    public String getAddressid() {
        return addressid;
    }

    public void setAddressid(String addressid) {
        this.addressid = addressid == null ? null : addressid.trim();
    }

    public String getBillstyleid() {
        return billstyleid;
    }

    public void setBillstyleid(String billstyleid) {
        this.billstyleid = billstyleid == null ? null : billstyleid.trim();
    }

    public String getBillstylename() {
        return billstylename;
    }

    public void setBillstylename(String billstylename) {
        this.billstylename = billstylename == null ? null : billstylename.trim();
    }

    public String getCustbillno() {
        return custbillno;
    }

    public void setCustbillno(String custbillno) {
        this.custbillno = custbillno == null ? null : custbillno.trim();
    }

    public Short getTaxincluded() {
        return taxincluded;
    }

    public void setTaxincluded(Short taxincluded) {
        this.taxincluded = taxincluded;
    }

    public String getCurrid() {
        return currid;
    }

    public void setCurrid(String currid) {
        this.currid = currid == null ? null : currid.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Double getExchrate() {
        return exchrate;
    }

    public void setExchrate(Double exchrate) {
        this.exchrate = exchrate;
    }

    public String getSalesname() {
        return salesname;
    }

    public void setSalesname(String salesname) {
        this.salesname = salesname == null ? null : salesname.trim();
    }

    public String getDepartid() {
        return departid;
    }

    public void setDepartid(String departid) {
        this.departid = departid == null ? null : departid.trim();
    }

    public String getProjectid() {
        return projectid;
    }

    public void setProjectid(String projectid) {
        this.projectid = projectid == null ? null : projectid.trim();
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

    public Integer getModpricestate() {
        return modpricestate;
    }

    public void setModpricestate(Integer modpricestate) {
        this.modpricestate = modpricestate;
    }
}