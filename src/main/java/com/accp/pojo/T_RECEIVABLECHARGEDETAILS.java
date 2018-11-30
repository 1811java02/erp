package com.accp.pojo;

public class T_RECEIVABLECHARGEDETAILS {
    private String fundbillid;

    private Integer linenumber;

    private String sourcelist;

    private String sourcenumber;

    private String bcurrencyname;

    private Double originalamount;

    private Double currentamount;

    private Double moneycharged;

    private Double offsetamount;

    private Double allowanceamount;

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

    public String getBcurrencyname() {
        return bcurrencyname;
    }

    public void setBcurrencyname(String bcurrencyname) {
        this.bcurrencyname = bcurrencyname == null ? null : bcurrencyname.trim();
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

    public Double getMoneycharged() {
        return moneycharged;
    }

    public void setMoneycharged(Double moneycharged) {
        this.moneycharged = moneycharged;
    }

    public Double getOffsetamount() {
        return offsetamount;
    }

    public void setOffsetamount(Double offsetamount) {
        this.offsetamount = offsetamount;
    }

    public Double getAllowanceamount() {
        return allowanceamount;
    }

    public void setAllowanceamount(Double allowanceamount) {
        this.allowanceamount = allowanceamount;
    }
}