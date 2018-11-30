package com.accp.pojo;

import java.util.Date;

public class T_BUYXUN_DETAIL {
    private String billno;

    private Date billdate;

    private Integer serno;

    private String prodid;

    private String prodclassid;

    private String unitname;

    private String prodname;

    private Integer squantity;

    private Double oldprice;

    private Double discount;

    private Double sprice;

    private Double amount;

    private Double taxrate;

    private Double taxamt;

    private Double vftoal;

    private String sourcetranflag;

    private String sourcetranbi;

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

    public String getUnitname() {
        return unitname;
    }

    public void setUnitname(String unitname) {
        this.unitname = unitname == null ? null : unitname.trim();
    }

    public String getProdname() {
        return prodname;
    }

    public void setProdname(String prodname) {
        this.prodname = prodname == null ? null : prodname.trim();
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

    public Double getVftoal() {
        return vftoal;
    }

    public void setVftoal(Double vftoal) {
        this.vftoal = vftoal;
    }

    public String getSourcetranflag() {
        return sourcetranflag;
    }

    public void setSourcetranflag(String sourcetranflag) {
        this.sourcetranflag = sourcetranflag == null ? null : sourcetranflag.trim();
    }

    public String getSourcetranbi() {
        return sourcetranbi;
    }

    public void setSourcetranbi(String sourcetranbi) {
        this.sourcetranbi = sourcetranbi == null ? null : sourcetranbi.trim();
    }
}