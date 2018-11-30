package com.accp.pojo;

public class T_BUYRETURN_DETAIL {
    private String billno;

    private String prodid;

    private Integer squantity;

    private Double oldprice;

    private Double discount;

    private Double sprice;

    private Double amount;

    private Double taxrate;

    private Double taxamt;

    private Integer isgift;

    private String itemremark;

    private String trantype;

    private String formno;

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

    public Integer getSquantity() {
        return squantity;
    }

    public void setSquantity(Integer squantity) {
        this.squantity = squantity;
    }

    public Double getOldprice() {
        return oldprice;
    }

    public void setOldprice(Double oldprice) {
        this.oldprice = oldprice;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public Double getSprice() {
        return sprice;
    }

    public void setSprice(Double sprice) {
        this.sprice = sprice;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Double getTaxrate() {
        return taxrate;
    }

    public void setTaxrate(Double taxrate) {
        this.taxrate = taxrate;
    }

    public Double getTaxamt() {
        return taxamt;
    }

    public void setTaxamt(Double taxamt) {
        this.taxamt = taxamt;
    }

    public Integer getIsgift() {
        return isgift;
    }

    public void setIsgift(Integer isgift) {
        this.isgift = isgift;
    }

    public String getItemremark() {
        return itemremark;
    }

    public void setItemremark(String itemremark) {
        this.itemremark = itemremark == null ? null : itemremark.trim();
    }

    public String getTrantype() {
        return trantype;
    }

    public void setTrantype(String trantype) {
        this.trantype = trantype == null ? null : trantype.trim();
    }

    public String getFormno() {
        return formno;
    }

    public void setFormno(String formno) {
        this.formno = formno == null ? null : formno.trim();
    }
}