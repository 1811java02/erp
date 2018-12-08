package com.accp.vo.wxy;

import com.accp.pojo.T_SALEPRICE;
import com.accp.pojo.T_SALEPRICE_DETAILS;

import java.util.ArrayList;
import java.util.List;

public class SalesVO  extends T_SALEPRICE {

    public String getKhName() {
        return khName;
    }

    public void setKhName(String khName) {
        this.khName = khName;
    }

    private   String khName;

    private List<T_SALEPRICE_DETAILS> list = new ArrayList<T_SALEPRICE_DETAILS>(0);

    public List<T_SALEPRICE_DETAILS> getList() {
        return list;
    }

    public void setList(List<T_SALEPRICE_DETAILS> list) {
        this.list = list;
    }
}
