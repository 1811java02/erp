package com.accp.vo.lc;

import com.accp.pojo.T_ADVANCECHARGE;
import com.accp.pojo.T_PAYINADVANCE_DETAILED;

import java.util.ArrayList;
import java.util.List;

public class t_advancharge_VO extends T_ADVANCECHARGE {
    private List<T_PAYINADVANCE_DETAILED> pan = new ArrayList<T_PAYINADVANCE_DETAILED>(0);

    public void setPan(List<T_PAYINADVANCE_DETAILED> pan) {
        this.pan = pan;
    }

    public List<T_PAYINADVANCE_DETAILED> getPan() {

        return pan;
    }
}
