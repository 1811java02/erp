package com.accp.dao;

import com.accp.pojo.T_CUSTOMERACCOUNTDETAILS;
import com.accp.pojo.T_CUSTOMER_INFORMATION;
import com.accp.vo.zg.AdvancereceiptVo;

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
    public List<T_CUSTOMER_INFORMATION> queryCUSTOMER_INFORMATION();


    /**
     * 分页查询预收款主详表
     * @return
     */
    public List<AdvancereceiptVo>  getAdvancereceipt();



}
