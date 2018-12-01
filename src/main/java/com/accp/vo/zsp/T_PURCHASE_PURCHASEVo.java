package com.accp.vo.zsp;

import com.accp.pojo.T_PURCHASE_PURCHASE;
import com.accp.pojo.T_PURCHASE_PURCHASE_DETAILS;

import java.util.ArrayList;
import java.util.List;

public class T_PURCHASE_PURCHASEVo extends com.accp.pojo.T_PURCHASE_PURCHASE {
      private List<T_PURCHASE_PURCHASE_DETAILS> list=new ArrayList<T_PURCHASE_PURCHASE_DETAILS>();

    public void setList(List<T_PURCHASE_PURCHASE_DETAILS> list) {
        this.list = list;
    }

    public List<T_PURCHASE_PURCHASE_DETAILS> getList() {
        return list;
    }
}
