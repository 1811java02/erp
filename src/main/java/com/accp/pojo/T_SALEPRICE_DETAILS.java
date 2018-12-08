package com.accp.pojo;

public class T_SALEPRICE_DETAILS {
    private String detailid;

    private String billno;

    private String prodid;

    private String prodname;

    private String prodsize;

    private String sunitid;

    private String sunit;

    private Integer squantity;

    private Double oldprice;

    private Integer discount;

    private Double sprice;

    private Double amount;

    private Integer taxrate;

    private Double taxamt;

    private Double vftotal;

    private Integer isgift;

    private String itemremark;

    public String getDetailid() {
        return detailid;
    }

    public void setDetailid(String detailid) {
        this.detailid = detailid == null ? null : detailid.trim();
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

    public String getSunitid() {
        return sunitid;
    }

    public void setSunitid(String sunitid) {
        this.sunitid = sunitid;
    }

    public String getSunit() {
        return sunit;
    }

    public void setSunit(String sunit) {
        this.sunit = sunit == null ? null : sunit.trim();
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

    public Integer getDiscount() {
        return discount;
    }

    public void setDiscount(Integer discount) {
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

    public Integer getTaxrate() {
        return taxrate;
    }

    public void setTaxrate(Integer taxrate) {
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
}