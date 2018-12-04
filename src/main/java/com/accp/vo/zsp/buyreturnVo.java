package com.accp.vo.zsp;

import com.accp.pojo.T_BUYRETURN_DETAIL;

import java.util.ArrayList;
import java.util.List;


public class buyreturnVo extends com.accp.pojo.T_BUYRETURN {
    private List<T_BUYRETURN_DETAIL>list=new ArrayList<T_BUYRETURN_DETAIL>();

    public void setList(List<T_BUYRETURN_DETAIL> list) {
        this.list = list;
    }

    public List<T_BUYRETURN_DETAIL> getList() {

        return list;
    }
}
