package com.accp.vo.zsp;

import com.accp.pojo.T_PURCHASE_PURCHASE_DETAILS;

import java.util.ArrayList;
import java.util.List;



public class T_PURCHASE_PURCHASEVo extends com.accp.pojo.T_PURCHASE_PURCHASE {
      private List<DsProductVo> list=new ArrayList<DsProductVo>();
      private String personname ;
      private String departname;

    public List<DsProductVo> getList() {
        return list;
    }

    public String getPersonname() {
        return personname;
    }

    public String getDepartname() {
        return departname;
    }

    public void setList(List<DsProductVo> list) {
        this.list = list;
    }

    public void setPersonname(String personname) {
        this.personname = personname;
    }

    public void setDepartname(String departname) {
        this.departname = departname;
    }
}
