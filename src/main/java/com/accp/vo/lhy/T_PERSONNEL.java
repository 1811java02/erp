package com.accp.vo.lhy;

import com.accp.pojo.T_DEPARTMENT;

/**
 * 人员主文件
 */
public class T_PERSONNEL extends com.accp.pojo.T_PERSONNEL {
	private T_DEPARTMENT department;

	public T_DEPARTMENT getDepartment() {
		return department;
	}

	public void setDepartment(T_DEPARTMENT department) {
		this.department = department;
	}
}
