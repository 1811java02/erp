package com.accp.dao;

import com.accp.pojo.TDsproduct;
import com.accp.pojo.TDsproductclass;

import java.util.List;

public interface LhyDao {
	List<TDsproduct> queryDsproduct();

	List<TDsproductclass> queryDsproductclass();
}
