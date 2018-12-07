package com.accp.vo.lhy;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.Date;
import java.util.List;

/**
 * 销售出库主单
 */
public class T_DSDSSALEMAIN extends com.accp.pojo.T_DSDSSALEMAIN {
	@JSONField(format = "yyyy-MM-dd")
	private Date billdate;

	private List<T_DSDSSALESUB> dsdssalesub;

	public List<T_DSDSSALESUB> getDsdssalesub() {
		return dsdssalesub;
	}

	public void setDsdssalesub(List<T_DSDSSALESUB> dsdssalesub) {
		this.dsdssalesub = dsdssalesub;
	}

	@Override
	public Date getBilldate() {
		return billdate;
	}

	@Override
	public void setBilldate(Date billdate) {
		this.billdate = billdate;
	}
}
