package com.accp.pojo;

import java.util.Date;

public class T_BUYORDERXI_DETAIL {
    private Integer serno;

    private String prodid;

    private String prodclassid;

    private String prodclassname;

    private String unitname;

    private Integer squantity;

    private Double oldprice;

    private Double discount;

    private Double sprice;

    private Double amount;

    private Double taxrate;

    private Double taxamt;

    private Double vftotal;

    private Date preindate;

    private Integer qtyremain;

    private String trantype;

    private String fromno;

    public Integer getSerno() {
        return serno;
    }

    public void setSerno(Integer serno) {
        this.serno = serno;
    }

    public String getProdid() {
        return prodid;
    }

    public void setProdid(String prodid) {
        this.prodid = prodid == null ? null : prodid.trim();
    }

    public String getProdclassid() {
        return prodclassid;
    }

    public void setProdclassid(String prodclassid) {
        this.prodclassid = prodclassid == null ? null : prodclassid.trim();
    }

    public String getProdclassname() {
        return prodclassname;
    }

    public void setProdclassname(String prodclassname) {
        this.prodclassname = prodclassname == null ? null : prodclassname.trim();
    }

    public String getUnitname() {
        return unitname;
    }

    public void setUnitname(String unitname) {
        this.unitname = unitname == null ? null : unitname.trim();
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

    public Double getVftotal() {
        return vftotal;
    }

    public void setVftotal(Double vftotal) {
        this.vftotal = vftotal;
    }

    public Date getPreindate() {
        return preindate;
    }

    public void setPreindate(Date preindate) {
        this.preindate = preindate;
    }

    public Integer getQtyremain() {
        return qtyremain;
    }

    public void setQtyremain(Integer qtyremain) {
        this.qtyremain = qtyremain;
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