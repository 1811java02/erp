package com.accp.dao;

import com.accp.pojo.*;
import com.accp.vo.ch.PurcahseVo;
import org.apache.ibatis.annotations.Param;

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

    /**
     * 查询人员
     * @return
     */
    public List<T_PERSONNEL> queryPerson();

    /**
     * 查询供应商
     * @return
     */
    public List<T_DSDATASET1> queryShort();

    /**
     * 查询所属部门
     * @return
     */
    public String querySubordinateDept(String personname);

    /**
     * 查询物料
     * @return
     */
    public  List<T_DSPRODUCT> queryProdct();

    /**
     * 根据物料编号查询物料信息
     * @param prodid
     * @return
     */
    public T_DSPRODUCT queryProdctInfo(String prodid);

    /**
     * 保存新增采购入库主表
     * @param
     * @return
     */
    public int savePurchase(@Param("pm") PurcahseVo pm);


    /**
     * 新增采购入库明细表
     * @param d
     * @return
     */
    public int savePurchaseDetail(@Param("d") T_PURCHASE_DETAIL d);
}
