package com.accp.pojo;

import java.math.BigDecimal;

public class T_SALES_RETURNS_DETAILS {
    private Integer detailedlistnumber;

    private String billno;

    private String prodid;

    private String prodname;

    private String prodsize;

    private String sunit;

    private BigDecimal squantity;

    private Double oldprice;

    private Double discount;

    private Double sprice;

    private Double amount;

    private Double taxrate;

    private Double taxamt;

    private Double amountatax;

    private Integer havebatch;

    private Integer isgift;

    private String itemremark;

    private String trantype;

    private String fromno;

    public Integer getDetailedlistnumber() {
        return detailedlistnumber;
    }

    public void setDetailedlistnumber(Integer detailedlistnumber) {
        this.detailedlistnumber = detailedlistnumber;
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

    public String getProdname() {
        return prodname;
    }

    public void setProdname(String prodname) {
        this.prodname = prodname == null ? null : prodname.trim();
    }

    public String getProdsize() {
        return prodsize;
    }

    public void setProdsize(String prodsize) {
        this.prodsize = prodsize == null ? null : prodsize.trim();
    }

    public String getSunit() {
        return sunit;
    }

    public void setSunit(String sunit) {
        this.sunit = sunit == null ? null : sunit.trim();
    }

    public BigDecimal getSquantity() {
        return squantity;
    }

    public void setSquantity(BigDecimal squantity) {
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

    public Double getAmountatax() {
        return amountatax;
    }

    public void setAmountatax(Double amountatax) {
        this.amountatax = amountatax;
    }

    public Integer getHavebatch() {
        return havebatch;
    }

    public void setHavebatch(Integer havebatch) {
        this.havebatch = havebatch;
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

    public String getFromno() {
        return fromno;
    }

    public void setFromno(String fromno) {
        this.fromno = fromno == null ? null : fromno.trim();
    }
}