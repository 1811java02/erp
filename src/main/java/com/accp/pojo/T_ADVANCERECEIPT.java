package com.accp.pojo;

import java.util.Date;

public class T_ADVANCERECEIPT {
    private String fundbillid;

    private Date fundbilldate;

    private String customerid;

    private String customername;

    private String cashstylename;

    private Double cash;

    private String visastylename;

    private Double visa;

    private String otherpaystylename;

    private Double otherpay;

    private String bcurrencyname;

    private Double exchangerate;

    private Double discountper;

    private Date accmonthtomonth;

    private String voucherno;

    private String departnamefrom;

    private String makersign;

    private String projectfrom;

    private String fermittersign;

    private Integer auditstatus;

    private String customcolumnone;

    private String customcolumntwo;

    private String remarks;

    public String getFundbillid() {
        return fundbillid;
    }

    public void setFundbillid(String fundbillid) {
        this.fundbillid = fundbillid == null ? null : fundbillid.trim();
    }

    public Date getFundbilldate() {
        return fundbilldate;
    }

    public void setFundbilldate(Date fundbilldate) {
        this.fundbilldate = fundbilldate;
    }

    public String getCustomerid() {
        return customerid;
    }

    public void setCustomerid(String customerid) {
        this.customerid = customerid == null ? null : customerid.trim();
    }

    public String getCustomername() {
        return customername;
    }

    public void setCustomername(String customername) {
        this.customername = customername == null ? null : customername.trim();
    }

    public String getCashstylename() {
        return cashstylename;
    }

    public void setCashstylename(String cashstylename) {
        this.cashstylename = cashstylename == null ? null : cashstylename.trim();
    }

    public Double getCash() {
        return cash;
    }

    public void setCash(Double cash) {
        this.cash = cash;
    }

    public String getVisastylename() {
        return visastylename;
    }

    public void setVisastylename(String visastylename) {
        this.visastylename = visastylename == null ? null : visastylename.trim();
    }

    public Double getVisa() {
        return visa;
    }

    public void setVisa(Double visa) {
        this.visa = visa;
    }

    public String getOtherpaystylename() {
        return otherpaystylename;
    }

    public void setOtherpaystylename(String otherpaystylename) {
        this.otherpaystylename = otherpaystylename == null ? null : otherpaystylename.trim();
    }

    public Double getOtherpay() {
        return otherpay;
    }

    public void setOtherpay(Double otherpay) {
        this.otherpay = otherpay;
    }

    public String getBcurrencyname() {
        return bcurrencyname;
    }

    public void setBcurrencyname(String bcurrencyname) {
        this.bcurrencyname = bcurrencyname == null ? null : bcurrencyname.trim();
    }

    public Double getExchangerate() {
        return exchangerate;
    }

    public void setExchangerate(Double exchangerate) {
        this.exchangerate = exchangerate;
    }

    public Double getDiscountper() {
        return discountper;
    }

    public void setDiscountper(Double discountper) {
        this.discountper = discountper;
    }

    public Date getAccmonthtomonth() {
        return accmonthtomonth;
    }

    public void setAccmonthtomonth(Date accmonthtomonth) {
        this.accmonthtomonth = accmonthtomonth;
    }

    public String getVoucherno() {
        return voucherno;
    }

    public void setVoucherno(String voucherno) {
        this.voucherno = voucherno == null ? null : voucherno.trim();
    }

    public String getDepartnamefrom() {
        return departnamefrom;
    }

    public void setDepartnamefrom(String departnamefrom) {
        this.departnamefrom = departnamefrom == null ? null : departnamefrom.trim();
    }

    public String getMakersign() {
        return makersign;
    }

    public void setMakersign(String makersign) {
        this.makersign = makersign == null ? null : makersign.trim();
    }

    public String getProjectfrom() {
        return projectfrom;
    }

    public void setProjectfrom(String projectfrom) {
        this.projectfrom = projectfrom == null ? null : projectfrom.trim();
    }

    public String getFermittersign() {
        return fermittersign;
    }

    public void setFermittersign(String fermittersign) {
        this.fermittersign = fermittersign == null ? null : fermittersign.trim();
    }

    public Integer getAuditstatus() {
        return auditstatus;
    }

    public void setAuditstatus(Integer auditstatus) {
        this.auditstatus = auditstatus;
    }

    public String getCustomcolumnone() {
        return customcolumnone;
    }

    public void setCustomcolumnone(String customcolumnone) {
        this.customcolumnone = customcolumnone == null ? null : customcolumnone.trim();
    }

    public String getCustomcolumntwo() {
        return customcolumntwo;
    }

    public void setCustomcolumntwo(String customcolumntwo) {
        this.customcolumntwo = customcolumntwo == null ? null : customcolumntwo.trim();
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }
}