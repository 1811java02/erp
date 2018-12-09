package com.accp.dao;

import com.accp.pojo.*;
import com.accp.vo.wxy.SalesVO;
import com.accp.vo.wxy.T_DSVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface WxyDao {

    //------------------------销售报价---

    /**
     * 销售报价表默认显示最后一条数据
     *
     * @return
     */
    public List<SalesVO> QueryAllLast();


    /**
     * 通过当前时间生成订单号
     *
     * @param date
     * @return
     */
    public Long getBillNo(String date);

    /**
     * 获得业务人员
     *
     * @return
     */
    public List<T_PERSONNEL> queryPerson();

    public List<T_CUSTOMER_INFORMATION> queryKh();

    public List<T_DSPRODUCT> queryProduct();

    public T_DEPARTMENT queryDept(@Param("depid") String depid);

    /**
     * 根据物料编号查询物料信息
     *
     * @param
     * @return
     */
    public T_DSPRODUCT queryProdctInfo(String prodid);


    /**
     * 保存新增主表
     *
     * @param
     * @return
     */
    public int saveProduct(@Param("pm") SalesVO pm);


    /**
     * 新增明细表
     *
     * @param d
     * @return
     */
    public int saveDetails(@Param("d") T_SALEPRICE_DETAILS d);




    /**
     * 删除主表
     * @param billno
     * @return
     */
    public int deleteMain(@Param("billno")String billno);

    /**
     * 删除详表
     */
    public int deleteSub(@Param("billno")String billno);
    //-------------------------销售报价---


    //--------------------供应商表操作 DSDATASET1---

    /**
     * 查询所有供应商分页
     * @return
     */
    public List<T_DSVO> queryDs();


    //--------------------供应商表操作 DSDATASET1---
}
