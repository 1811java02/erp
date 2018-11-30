package com.accp.pojo;

import java.util.Date;

public class T_CUSTOMER_ACCOUNT_DETAILS {
    private Integer customerdetd;

    private String sourcelisttype;

    private String sourcelistid;

    private String customerid;

    private Date times;

    private Double price;

    private Double currentamount;

    public Integer getCustomerdetd() {
        return customerdetd;
    }

    public void setCustomerdetd(Integer customerdetd) {
        this.customerdetd = customerdetd;
    }

    public String getSourcelisttype() {
        return sourcelisttype;
    }

    public void setSourcelisttype(String sourcelisttype) {
        this.sourcelisttype = sourcelisttype == null ? null : sourcelisttype.trim();
    }

    public String getSourcelistid() {
        return sourcelistid;
    }

    public void setSourcelistid(String sourcelistid) {
        this.sourcelistid = sourcelistid == null ? null : sourcelistid.trim();
    }

    public String getCustomerid() {
        return customerid;
    }

    public void setCustomerid(String customerid) {
        this.customerid = customerid == null ? null : customerid.trim();
    }

    public Date getTimes() {
        return times;
    }

    public void setTimes(Date times) {
        this.times = times;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getCurrentamount() {
        return currentamount;
    }

    public void setCurrentamount(Double currentamount) {
        this.currentamount = currentamount;
    }
}