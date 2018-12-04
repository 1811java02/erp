package com.accp.vo.lhy;

import java.util.List;

/**
 * 销售出库主单
 */
public class T_DSDSSALEMAIN extends com.accp.pojo.T_DSDSSALEMAIN {
	private List<T_DSDSSALESUB> dsdssalesub;

	public List<T_DSDSSALESUB> getDsdssalesub() {
		return dsdssalesub;
	}

	public void setDsdssalesub(List<T_DSDSSALESUB> dsdssalesub) {
		this.dsdssalesub = dsdssalesub;
	}
}
