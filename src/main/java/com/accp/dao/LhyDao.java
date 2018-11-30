package com.accp.dao;

import com.accp.pojo.T_DSPRODUCT;
import com.accp.pojo.T_DSPRODUCTCLASS;

import java.util.List;

public interface LhyDao {
	List<T_DSPRODUCT> queryDsproduct();

	List<T_DSPRODUCTCLASS> queryDsproductclass();
}
