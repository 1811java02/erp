package com.accp.dao;

import com.accp.pojo.T_BILLTYPE;
import com.accp.pojo.T_DEPARTMENT;
import com.accp.pojo.T_WAREHOUSE;

import java.util.List;

public interface ChDao {
    /**
     * 查询部门
     * @param pageNum 分页当前页
     * @return
     */
    public List<T_DEPARTMENT> queryDepartment(int pageNum);

    /**
     * 查询单据类型
     * @param pageNum 分页当前页
     * @return
     */
    public List<T_BILLTYPE> queryBillType(int pageNum);

    /**
     * 查询单据类型--采购入库单
     * @return
     */
    public List<T_BILLTYPE> queryBillTypeByRk();

    /**
     * 查询仓库
     * @return
     */
    public List<T_WAREHOUSE> queryWareHouse();

    /**
     * 通过当前时间生成订单号
     * @param date
     * @return
     */
    public Long getBillNo(String date);
}
