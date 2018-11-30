package com.accp.vo.lhy;

import java.util.List;

/**
 * 物料主文件
 */
public class T_DSPRODUCT extends com.accp.pojo.T_DSPRODUCT {
	private List<T_DSDSWAREAMOUNT> dsdswareamount; // 库存总账

	public List<T_DSDSWAREAMOUNT> getDsdswareamount() {
		return dsdswareamount;
	}

	public void setDsdswareamount(List<T_DSDSWAREAMOUNT> dsdswareamount) {
		this.dsdswareamount = dsdswareamount;
	}
}
