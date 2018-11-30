package com.accp.pojo;

public class T_CHANGEPRICE_DETAIL {
    private String billno;

    private String prodid;

    private Integer warehouseid;

    private Double price;

    private Double adjustamount;

    private String itemremark;

    private Integer regulating;

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

    public Integer getWarehouseid() {
        return warehouseid;
    }

    public void setWarehouseid(Integer warehouseid) {
        this.warehouseid = warehouseid;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getAdjustamount() {
        return adjustamount;
    }

    public void setAdjustamount(Double adjustamount) {
        this.adjustamount = adjustamount;
    }

    public String getItemremark() {
        return itemremark;
    }

    public void setItemremark(String itemremark) {
        this.itemremark = itemremark == null ? null : itemremark.trim();
    }

    public Integer getRegulating() {
        return regulating;
    }

    public void setRegulating(Integer regulating) {
        this.regulating = regulating;
    }
}