package com.accp.dao;

import com.accp.pojo.T_DSPRODUCTCLASS;
import com.accp.vo.lhy.T_DSPRODUCT;

import java.util.List;

public interface LhyDao {
	List<T_DSPRODUCT> queryDsproduct();

	List<T_DSPRODUCTCLASS> queryDsproductclass();
}
