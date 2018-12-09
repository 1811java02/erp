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
	/**
	 * 查询物料主文件集合
	 *
	 * @return
	 */
	List<T_DSPRODUCT> queryDsproduct();

	/**
	 * 查询物料类型集合
	 *
	 * @return
	 */
	List<T_DSPRODUCTCLASS> queryDsproductclass();

	/**
	 * 查询客户集合
	 *
	 * @return
	 */
	List<T_CUSTOMER_INFORMATION> queryCustomer();

	/**
	 * 查询仓库集合
	 *
	 * @return
	 */
	List<T_WAREHOUSE> queryWarehouse();

	/**
	 * 查询人员集合
	 *
	 * @return
	 */
	List<T_PERSONNEL> queryPersonnel();

	/**
	 * 查询指定日期的最大订单号
	 *
	 * @param date
	 * @return
	 */
	String queryDsdssalemainByDate(@Param("date") String date);

	/**
	 * 查询出库单类型集合
	 *
	 * @return
	 */
	List<T_BILLTYPE> queryBilltype();

	/**
	 * 查询销售出库单集合
	 *
	 * @return
	 */
	List<T_DSDSSALEMAIN> queryDsdssalemain();

	/**
	 * 删除销售出库主单
	 *
	 * @return
	 */
	boolean deleteDsdssalemain(String billno);

	/**
	 * 删除销售出库详单
	 *
	 * @return
	 */
	boolean deleteDsdssalesub(String billno);

	/**
	 * 保存销售出库主单
	 *
	 * @param dsdssalemain
	 * @return
	 */
	boolean saveDsdssalemain(T_DSDSSALEMAIN dsdssalemain);

	/**
	 * 保存销售出库详单
	 *
	 * @param dsdssalesub
	 * @return
	 */
	boolean saveDsdssalesub(T_DSDSSALESUB dsdssalesub);
}
