package com.accp.vo.ch;

import com.accp.pojo.T_PURCHASE_DETAIL;
import com.accp.pojo.T_PURCHASE_MASTER;
import java.util.List;

public class PurcahseVo extends T_PURCHASE_MASTER {
    private List<T_PURCHASE_DETAIL> detaillist;

    public List<T_PURCHASE_DETAIL> getDetaillist() {
        return detaillist;
    }

    public void setDetaillist(List<T_PURCHASE_DETAIL> detaillist) {
        this.detaillist = detaillist;
    }
}
