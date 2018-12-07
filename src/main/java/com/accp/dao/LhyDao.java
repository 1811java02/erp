package com.accp.dao;

import com.accp.pojo.T_BILLTYPE;
import com.accp.pojo.T_CUSTOMER_INFORMATION;
import com.accp.pojo.T_DSPRODUCTCLASS;
import com.accp.pojo.T_WAREHOUSE;
import com.accp.vo.lhy.T_DSDSSALEMAIN;
import com.accp.vo.lhy.T_DSDSSALESUB;
import com.accp.vo.lhy.T_DSPRODUCT;
import com.accp.vo.lhy.T_PERSONNEL;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface LhyDao {
	List<T_DSPRODUCT> queryDsproduct();

	List<T_DSPRODUCTCLASS> queryDsproductclass();

	List<T_CUSTOMER_INFORMATION> queryCustomer();

	List<T_WAREHOUSE> queryWarehouse();

	List<T_PERSONNEL> queryPersonnel();

	String queryDsdssalemainByDate(@Param("date") String date);

	List<T_BILLTYPE> queryBilltype();

	List<T_DSDSSALEMAIN> queryDsdssalemain();

	boolean saveDsdssalemain(T_DSDSSALEMAIN dsdssalemain);

	boolean saveDsdssalesub(T_DSDSSALESUB dsdssalesub);
}
