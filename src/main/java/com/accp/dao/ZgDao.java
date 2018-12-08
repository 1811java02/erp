package com.accp.dao;

import com.accp.pojo.*;
import com.accp.vo.zg.AdvancereceiptVo;
import com.accp.vo.zg.ReceivablechargeVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ZgDao {
    /**
     * 查询客户账款明细表
     * @return
     */
    public List<T_CUSTOMERACCOUNTDETAILS> queryCustomeraccountdetails();


    /**
     * 查询客户主文件信息
     * @return
     */
    public List<T_CUSTOMER_INFORMATION> queryCUSTOMERINFORMATION();


    /**
     * 分页查询预收款主详表
     * @return
     */
    public List<AdvancereceiptVo>  getAdvancereceipt();


    public List<ReceivablechargeVo>  getReceivablecharge();

    /**
     * 预收款主详表删除
     * @param fundbillid
     */
    public int deleteAdvancereceipt(@Param("fundbillid") String fundbillid);


    /**
     * 应收冲款主详表删除
     * @param fundbillid
     */
    public int deleteReceivablecharge(@Param("fundbillid") String fundbillid);


    /**
     * 查询部门
     * @return
     */
    public List<T_DEPARTMENT> queryDepartment();

    /**
     * 通过当前时间生成订单号
     * @param date
     * @return
     */
    public Long getBillNo(String date);

    /**
     * 预收款表主表新增
     * @param Advancereceipt
     */
    public int saveAdvancereceipt(@Param("pojo") AdvancereceiptVo Advancereceipt);

    /**
     * 应收冲款表主表新增
     * @param Receivablecharge
     */
    public int saveReceivablecharge(@Param("pojo") ReceivablechargeVo Receivablecharge);


    /**
     * 预收款表详表新增
     * @param AdvancereceiptDetails
     */
    public int saveAdvancereceiptdateils(@Param("temp") T_ADVANCERECEIPTDETAILS AdvancereceiptDetails);


    /**
     * 应收冲款表详表新增
     * @param Receivablechargedateils
     */
    public int saveReceivablechargedateils(@Param("temp") T_RECEIVABLECHARGEDETAILS Receivablechargedateils);

}
