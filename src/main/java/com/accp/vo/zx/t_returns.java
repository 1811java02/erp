package com.accp.vo.zx;

import com.accp.pojo.T_SALES_RETURNS;
import com.accp.pojo.T_SALES_RETURNS_DETAILS;

import java.util.ArrayList;
import java.util.List;

public class t_returns extends T_SALES_RETURNS {

     private List<T_SALES_RETURNS_DETAILS>details=new ArrayList<T_SALES_RETURNS_DETAILS>();

     public t_returns(){}

    public List<T_SALES_RETURNS_DETAILS> getDetails() {
        return details;
    }

    public void setDetails(List<T_SALES_RETURNS_DETAILS> details) {
        this.details = details;
    }
}
