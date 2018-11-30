package com.accp.pojo;

import java.util.Date;

public class T_CUSTOMERACCOUNTDETAILS {
    private Integer id;

    private String customer;

    private String sourcelist;

    private String sourcenumber;

    private Date fundbilldate;

    private Double originalamount;

    private Double currentamount;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer == null ? null : customer.trim();
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

    public Date getFundbilldate() {
        return fundbilldate;
    }

    public void setFundbilldate(Date fundbilldate) {
        this.fundbilldate = fundbilldate;
    }

    public Double getOriginalamount() {
        return originalamount;
    }

    public void setOriginalamount(Double originalamount) {
        this.originalamount = originalamount;
    }

    public Double getCurrentamount() {
        return currentamount;
    }

    public void setCurrentamount(Double currentamount) {
        this.currentamount = currentamount;
    }
}