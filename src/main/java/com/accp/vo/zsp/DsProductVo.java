package com.accp.vo.zsp;

public class DsProductVo extends com.accp.pojo.T_DSPRODUCT {
      private String sprice;
      private String unitname;
      private String amount;

    public void setSprice(String sprice) {
        this.sprice = sprice;
    }

    public void setUnitname(String unitname) {
        this.unitname = unitname;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getSprice() {
        return sprice;
    }

    public String getUnitname() {
        return unitname;
    }

    public String getAmount() {
        return amount;
    }
}
