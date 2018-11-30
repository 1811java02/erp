package com.accp.vo.lhy;

import com.accp.pojo.T_WAREHOUSE;

/**
 * 库存总账
 */
public class T_DSDSWAREAMOUNT extends com.accp.pojo.T_DSDSWAREAMOUNT {
	private T_WAREHOUSE warehouse; // 仓库

	public T_WAREHOUSE getWarehouse() {
		return warehouse;
	}

	public void setWarehouse(T_WAREHOUSE warehouse) {
		this.warehouse = warehouse;
	}
}
