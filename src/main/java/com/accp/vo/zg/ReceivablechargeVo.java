package com.accp.vo.zg;

import com.accp.pojo.T_RECEIVABLECHARGE;
import com.accp.pojo.T_RECEIVABLECHARGEDETAILS;
import com.accp.pojo.T_TAKEINADVANCE;

import java.util.ArrayList;
import java.util.List;

public class ReceivablechargeVo  extends T_RECEIVABLECHARGE {
        private List<T_RECEIVABLECHARGEDETAILS> receivablechargedetails=new ArrayList<T_RECEIVABLECHARGEDETAILS>();
        private  List<T_TAKEINADVANCE>  takeinadvance=new ArrayList<T_TAKEINADVANCE>();

    public List<T_RECEIVABLECHARGEDETAILS> getReceivablechargedetails() {
        return receivablechargedetails;
    }

    public void setReceivablechargedetails(List<T_RECEIVABLECHARGEDETAILS> receivablechargedetails) {
        this.receivablechargedetails = receivablechargedetails;
    }

    public List<T_TAKEINADVANCE> getTakeinadvance() {
        return takeinadvance;
    }

    public void setTakeinadvance(List<T_TAKEINADVANCE> takeinadvance) {
        this.takeinadvance = takeinadvance;
    }
}
