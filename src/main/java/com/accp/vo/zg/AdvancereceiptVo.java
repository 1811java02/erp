package com.accp.vo.zg;

import com.accp.pojo.T_ADVANCERECEIPT;
import com.accp.pojo.T_ADVANCERECEIPTDETAILS;
import java.util.ArrayList;
import java.util.List;
public class AdvancereceiptVo  extends T_ADVANCERECEIPT {
        private List<T_ADVANCERECEIPTDETAILS> details=new ArrayList<T_ADVANCERECEIPTDETAILS>();

        public List<T_ADVANCERECEIPTDETAILS> getDetails() {
                return details;
        }

        public void setDetails(List<T_ADVANCERECEIPTDETAILS> details) {
                this.details = details;
        }
}
