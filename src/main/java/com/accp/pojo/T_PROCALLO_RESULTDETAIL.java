package com.accp.pojo;

public class T_PROCALLO_RESULTDETAIL {
    private String billno;

    private String fromno;

    private String prodid;

    private Double mlamount;

    public String getBillno() {
        return billno;
    }

    public void setBillno(String billno) {
        this.billno = billno == null ? null : billno.trim();
    }

    public String getFromno() {
        return fromno;
    }

    public void setFromno(String fromno) {
        this.fromno = fromno == null ? null : fromno.trim();
    }

    public String getProdid() {
        return prodid;
    }

    public void setProdid(String prodid) {
        this.prodid = prodid == null ? null : prodid.trim();
    }

    public Double getMlamount() {
        return mlamount;
    }

    public void setMlamount(Double mlamount) {
        this.mlamount = mlamount;
    }
}