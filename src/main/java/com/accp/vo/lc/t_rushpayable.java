package com.accp.vo.lc;

import com.accp.pojo.T_PAYINADVANCE_DETAILED;
import com.accp.pojo.T_PREPAID_DETAILED;
import com.accp.pojo.T_RUSHPAYABLE;
import com.accp.pojo.T_RUSHPAYABLE_DETAILED;

import java.util.ArrayList;
import java.util.List;

public class t_rushpayable extends T_RUSHPAYABLE {

    private List<T_RUSHPAYABLE_DETAILED> ru = new ArrayList<T_RUSHPAYABLE_DETAILED>(0);
    private List<T_PREPAID_DETAILED> pre = new ArrayList<T_PREPAID_DETAILED>(0);

    public List<T_RUSHPAYABLE_DETAILED> getRu() {
        return ru;
    }

    public void setRu(List<T_RUSHPAYABLE_DETAILED> ru) {
        this.ru = ru;
    }

    public List<T_PREPAID_DETAILED> getPre() {
        return pre;
    }

    public void setPre(List<T_PREPAID_DETAILED> pre) {
        this.pre = pre;
    }
}
