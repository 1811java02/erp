package com.accp.pojo;

import java.util.Date;

public class T_PURCHASE_PURCHASE_DETAILS {
    private String billno;

    private String purchaseid;

    private String prodid;

    private Integer sum1;

    private Date demanddate;

    private Date procurementdate;

    private Integer purchasevolume;

    private String entrynotes;

    private String sourcelist;

    private String sourcenumber;

    private String currency;

    private String materialid;

    private Double unitprice;

    private Double amountofmoney;

    public String getBillno() {
        return billno;
    }

    public void setBillno(String billno) {
        this.billno = billno == null ? null : billno.trim();
    }

    public String getPurchaseid() {
        return purchaseid;
    }

    public void setPurchaseid(String purchaseid) {
        this.purchaseid = purchaseid == null ? null : purchaseid.trim();
    }

    public String getProdid() {
        return prodid;
    }

    public void setProdid(String prodid) {
        this.prodid = prodid == null ? null : prodid.trim();
    }

    public Integer getSum1() {
        return sum1;
    }

    public void setSum1(Integer sum1) {
        this.sum1 = sum1;
    }

    public Date getDemanddate() {
        return demanddate;
    }

    public void setDemanddate(Date demanddate) {
        this.demanddate = demanddate;
    }

    public Date getProcurementdate() {
        return procurementdate;
    }

    public void setProcurementdate(Date procurementdate) {
        this.procurementdate = procurementdate;
    }

    public Integer getPurchasevolume() {
        return purchasevolume;
    }

    public void setPurchasevolume(Integer purchasevolume) {
        this.purchasevolume = purchasevolume;
    }

    public String getEntrynotes() {
        return entrynotes;
    }

    public void setEntrynotes(String entrynotes) {
        this.entrynotes = entrynotes == null ? null : entrynotes.trim();
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

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency == null ? null : currency.trim();
    }

    public String getMaterialid() {
        return materialid;
    }

    public void setMaterialid(String materialid) {
        this.materialid = materialid == null ? null : materialid.trim();
    }

    public Double getUnitprice() {
        return unitprice;
    }

    public void setUnitprice(Double unitprice) {
        this.unitprice = unitprice;
    }

    public Double getAmountofmoney() {
        return amountofmoney;
    }

    public void setAmountofmoney(Double amountofmoney) {
        this.amountofmoney = amountofmoney;
    }
}