package com.accp.pojo;

import java.util.Date;

public class T_STOCK_INVENTORY {
    private String billno;

    private Date adjustdate;

    private String maker;

    private String permitter;

    private String udef1;

    private String udef2;

    private String remark;

    private String wareid;

    private Integer sumqty;

    private Double sumcost;

    private String salesid;

    private String departid;

    private String memo;

    private Integer zerofilter;

    private Integer sumcurqty;

    private Integer sumcheckqty;

    private String makersign;

    private String permittersign;

    private Integer auditstatus;

    public String getBillno() {
        return billno;
    }

    public void setBillno(String billno) {
        this.billno = billno == null ? null : billno.trim();
    }

    public Date getAdjustdate() {
        return adjustdate;
    }

    public void setAdjustdate(Date adjustdate) {
        this.adjustdate = adjustdate;
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

    public String getUdef1() {
        return udef1;
    }

    public void setUdef1(String udef1) {
        this.udef1 = udef1 == null ? null : udef1.trim();
    }

    public String getUdef2() {
        return udef2;
    }

    public void setUdef2(String udef2) {
        this.udef2 = udef2 == null ? null : udef2.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getWareid() {
        return wareid;
    }

    public void setWareid(String wareid) {
        this.wareid = wareid == null ? null : wareid.trim();
    }

    public Integer getSumqty() {
        return sumqty;
    }

    public void setSumqty(Integer sumqty) {
        this.sumqty = sumqty;
    }

    public Double getSumcost() {
        return sumcost;
    }

    public void setSumcost(Double sumcost) {
        this.sumcost = sumcost;
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

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    public Integer getZerofilter() {
        return zerofilter;
    }

    public void setZerofilter(Integer zerofilter) {
        this.zerofilter = zerofilter;
    }

    public Integer getSumcurqty() {
        return sumcurqty;
    }

    public void setSumcurqty(Integer sumcurqty) {
        this.sumcurqty = sumcurqty;
    }

    public Integer getSumcheckqty() {
        return sumcheckqty;
    }

    public void setSumcheckqty(Integer sumcheckqty) {
        this.sumcheckqty = sumcheckqty;
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

    public Integer getAuditstatus() {
        return auditstatus;
    }

    public void setAuditstatus(Integer auditstatus) {
        this.auditstatus = auditstatus;
    }
}