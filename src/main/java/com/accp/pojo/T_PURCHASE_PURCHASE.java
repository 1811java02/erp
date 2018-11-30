package com.accp.pojo;

import java.util.Date;

public class T_PURCHASE_PURCHASE {
    private String billno;

    private Date billdate;

    private String billstyleid;

    private Integer billstatus;

    private String departid;

    private String maker;

    private String permitter;

    private String remark;

    private Integer sumqty;

    private String headerid;

    private String headername;

    private String footerid;

    private String footername;

    private String userdef1;

    private String userdef2;

    private String makersign;

    private String permittersign;

    private String salesid;

    private Integer auditstatus;

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

    public String getBillstyleid() {
        return billstyleid;
    }

    public void setBillstyleid(String billstyleid) {
        this.billstyleid = billstyleid == null ? null : billstyleid.trim();
    }

    public Integer getBillstatus() {
        return billstatus;
    }

    public void setBillstatus(Integer billstatus) {
        this.billstatus = billstatus;
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

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Integer getSumqty() {
        return sumqty;
    }

    public void setSumqty(Integer sumqty) {
        this.sumqty = sumqty;
    }

    public String getHeaderid() {
        return headerid;
    }

    public void setHeaderid(String headerid) {
        this.headerid = headerid == null ? null : headerid.trim();
    }

    public String getHeadername() {
        return headername;
    }

    public void setHeadername(String headername) {
        this.headername = headername == null ? null : headername.trim();
    }

    public String getFooterid() {
        return footerid;
    }

    public void setFooterid(String footerid) {
        this.footerid = footerid == null ? null : footerid.trim();
    }

    public String getFootername() {
        return footername;
    }

    public void setFootername(String footername) {
        this.footername = footername == null ? null : footername.trim();
    }

    public String getUserdef1() {
        return userdef1;
    }

    public void setUserdef1(String userdef1) {
        this.userdef1 = userdef1 == null ? null : userdef1.trim();
    }

    public String getUserdef2() {
        return userdef2;
    }

    public void setUserdef2(String userdef2) {
        this.userdef2 = userdef2 == null ? null : userdef2.trim();
    }

    public String getMakersign() {
        return makersign;
    }

    public void setMakersign(String makersign) {
        this.makersign = makersign == null ? null : makersign.trim();
    }

    public String getPermittersign() {
        return permittersign;
    }

    public void setPermittersign(String permittersign) {
        this.permittersign = permittersign == null ? null : permittersign.trim();
    }

    public String getSalesid() {
        return salesid;
    }

    public void setSalesid(String salesid) {
        this.salesid = salesid == null ? null : salesid.trim();
    }

    public Integer getAuditstatus() {
        return auditstatus;
    }

    public void setAuditstatus(Integer auditstatus) {
        this.auditstatus = auditstatus;
    }
}