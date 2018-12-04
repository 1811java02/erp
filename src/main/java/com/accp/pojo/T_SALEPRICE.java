package com.accp.pojo;

import java.util.Date;

public class T_SALEPRICE {
    private String billno;

    private Date billdate;

    private Integer customerid;

    private Integer formalcust;

    private String custaddress;

    private Date validdate;

    private Integer priceoftax;

    private Integer currid;

    private String curcurrencyname;

    private Double exchrate;

    private Integer salesid;

    private String salesname;

    private String departid;

    private String departname;

    private String maker;

    private String permitter;

    private String spheader;

    private String spfooter;

    private String userdef;

    private String userdef2;

    private String remark;

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

    public Integer getCustomerid() {
        return customerid;
    }

    public void setCustomerid(Integer customerid) {
        this.customerid = customerid;
    }

    public Integer getFormalcust() {
        return formalcust;
    }

    public void setFormalcust(Integer formalcust) {
        this.formalcust = formalcust;
    }

    public String getCustaddress() {
        return custaddress;
    }

    public void setCustaddress(String custaddress) {
        this.custaddress = custaddress == null ? null : custaddress.trim();
    }

    public Date getValiddate() {
        return validdate;
    }

    public void setValiddate(Date validdate) {
        this.validdate = validdate;
    }

    public Integer getPriceoftax() {
        return priceoftax;
    }

    public void setPriceoftax(Integer priceoftax) {
        this.priceoftax = priceoftax;
    }

    public Integer getCurrid() {
        return currid;
    }

    public void setCurrid(Integer currid) {
        this.currid = currid;
    }

    public String getCurcurrencyname() {
        return curcurrencyname;
    }

    public void setCurcurrencyname(String curcurrencyname) {
        this.curcurrencyname = curcurrencyname == null ? null : curcurrencyname.trim();
    }

    public Double getExchrate() {
        return exchrate;
    }

    public void setExchrate(Double exchrate) {
        this.exchrate = exchrate;
    }

    public Integer getSalesid() {
        return salesid;
    }

    public void setSalesid(Integer salesid) {
        this.salesid = salesid;
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

    public String getDepartname() {
        return departname;
    }

    public void setDepartname(String departname) {
        this.departname = departname == null ? null : departname.trim();
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

    public String getSpheader() {
        return spheader;
    }

    public void setSpheader(String spheader) {
        this.spheader = spheader == null ? null : spheader.trim();
    }

    public String getSpfooter() {
        return spfooter;
    }

    public void setSpfooter(String spfooter) {
        this.spfooter = spfooter == null ? null : spfooter.trim();
    }

    public String getUserdef() {
        return userdef;
    }

    public void setUserdef(String userdef) {
        this.userdef = userdef == null ? null : userdef.trim();
    }

    public String getUserdef2() {
        return userdef2;
    }

    public void setUserdef2(String userdef2) {
        this.userdef2 = userdef2 == null ? null : userdef2.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}