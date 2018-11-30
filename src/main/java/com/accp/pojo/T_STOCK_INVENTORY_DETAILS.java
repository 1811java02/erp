package com.accp.pojo;

public class T_STOCK_INVENTORY_DETAILS {
    private String detailsid;

    private String billno;

    private String prodid;

    private String prodsire;

    private String stdunitid;

    private Integer bookquantity;

    private Integer inventorynumber;

    private Integer profitandloss;

    private Double unitprice;

    private Double profitandlossamount;

    private String batchnumber;

    private String reason;

    public String getDetailsid() {
        return detailsid;
    }

    public void setDetailsid(String detailsid) {
        this.detailsid = detailsid == null ? null : detailsid.trim();
    }

    public String getBillno() {
        return billno;
    }

    public void setBillno(String billno) {
        this.billno = billno == null ? null : billno.trim();
    }

    public String getProdid() {
        return prodid;
    }

    public void setProdid(String prodid) {
        this.prodid = prodid == null ? null : prodid.trim();
    }

    public String getProdsire() {
        return prodsire;
    }

    public void setProdsire(String prodsire) {
        this.prodsire = prodsire == null ? null : prodsire.trim();
    }

    public String getStdunitid() {
        return stdunitid;
    }

    public void setStdunitid(String stdunitid) {
        this.stdunitid = stdunitid == null ? null : stdunitid.trim();
    }

    public Integer getBookquantity() {
        return bookquantity;
    }

    public void setBookquantity(Integer bookquantity) {
        this.bookquantity = bookquantity;
    }

    public Integer getInventorynumber() {
        return inventorynumber;
    }

    public void setInventorynumber(Integer inventorynumber) {
        this.inventorynumber = inventorynumber;
    }

    public Integer getProfitandloss() {
        return profitandloss;
    }

    public void setProfitandloss(Integer profitandloss) {
        this.profitandloss = profitandloss;
    }

    public Double getUnitprice() {
        return unitprice;
    }

    public void setUnitprice(Double unitprice) {
        this.unitprice = unitprice;
    }

    public Double getProfitandlossamount() {
        return profitandlossamount;
    }

    public void setProfitandlossamount(Double profitandlossamount) {
        this.profitandlossamount = profitandlossamount;
    }

    public String getBatchnumber() {
        return batchnumber;
    }

    public void setBatchnumber(String batchnumber) {
        this.batchnumber = batchnumber == null ? null : batchnumber.trim();
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason == null ? null : reason.trim();
    }
}