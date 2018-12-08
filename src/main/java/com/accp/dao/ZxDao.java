package com.accp.dao;

import com.accp.pojo.T_CUSTOMER_INFORMATION;
import com.accp.pojo.T_CUSTOMER_TYPE;
import com.accp.pojo.T_SALES_RETURNS;
import com.accp.vo.zx.t_returns;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ZxDao {

   public T_SALES_RETURNS queryList(@Param("lim") Integer lim);

   public List<T_SALES_RETURNS> query();
   //客户类别
   public List<T_CUSTOMER_TYPE> queryCustomer();
   //新增客户类别
   public void addCustType(@Param("pojo") T_CUSTOMER_TYPE pojo);

   public T_CUSTOMER_TYPE queryCustId(@Param("id") int id);

   //查询客户主文件
   public List<T_CUSTOMER_INFORMATION>queryCustomerInfo();

   //查询销售退货主详表

    public List<t_returns>querRetrunsList();
}
