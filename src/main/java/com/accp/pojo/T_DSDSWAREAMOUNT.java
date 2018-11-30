package com.accp.pojo;

public class T_DSDSWAREAMOUNT {
    private String warehouseid;

    private String prodid;

    private Integer bquantity;

    private Double bavgcost;

    private Double ballcost;

    private Integer quantity;

    private Double cavgcost;

    private Double callcost;

    public String getWarehouseid() {
        return warehouseid;
    }

    public void setWarehouseid(String warehouseid) {
        this.warehouseid = warehouseid == null ? null : warehouseid.trim();
    }

    public String getProdid() {
        return prodid;
    }

    public void setProdid(String prodid) {
        this.prodid = prodid == null ? null : prodid.trim();
    }

    public Integer getBquantity() {
        return bquantity;
    }

    public void setBquantity(Integer bquantity) {
        this.bquantity = bquantity;
    }

    public Double getBavgcost() {
        return bavgcost;
    }

    public void setBavgcost(Double bavgcost) {
        this.bavgcost = bavgcost;
    }

    public Double getBallcost() {
        return ballcost;
    }

    public void setBallcost(Double ballcost) {
        this.ballcost = ballcost;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getCavgcost() {
        return cavgcost;
    }

    public void setCavgcost(Double cavgcost) {
        this.cavgcost = cavgcost;
    }

    public Double getCallcost() {
        return callcost;
    }

    public void setCallcost(Double callcost) {
        this.callcost = callcost;
    }
}