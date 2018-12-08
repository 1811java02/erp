package com.accp.biz;

import com.accp.dao.ZxDao;
import com.accp.pojo.T_CUSTOMER_INFORMATION;
import com.accp.pojo.T_CUSTOMER_TYPE;
import com.accp.pojo.T_SALES_RETURNS;
import com.accp.vo.zx.t_returns;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("biz")
@SuppressWarnings("all")
public class ZxBiz {

    @Autowired
    private ZxDao dao;

    public T_SALES_RETURNS queryList(Integer lim){
       return dao.queryList(lim);
    }

    public List<T_SALES_RETURNS> query(){
        return dao.query();
    }

    /**
     * 客户类别分页
     * @param page
     * @return
     */
    public PageInfo<T_CUSTOMER_TYPE> queryCustpage(Integer page){
        PageHelper.startPage(page, 1);
        return  new PageInfo<T_CUSTOMER_TYPE>(dao.queryCustomer());
    }

    /**
     * 新增客户类别
     */
    public void addCustType(T_CUSTOMER_TYPE pojo){
       if(dao.queryCustId(pojo.getClassid())!=null){
           throw new RuntimeException("客户编号重复");
       }
       dao.addCustType(pojo);
    }

    /**
     * 查询客户主文件
     */
    public PageInfo<T_CUSTOMER_INFORMATION> queryCustinfo(Integer page){
        PageHelper.startPage(page, 1);
        return  new PageInfo<T_CUSTOMER_INFORMATION>(dao.queryCustomerInfo());
    }

    /**
     * 查询退货主详表
     */
    public PageInfo<t_returns> queryRetrunList(Integer page){
        PageHelper.startPage(page, 1);
        return new PageInfo<t_returns>(dao.querRetrunsList());
    }

}
