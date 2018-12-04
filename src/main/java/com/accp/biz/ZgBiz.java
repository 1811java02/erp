package com.accp.biz;


import com.accp.dao.ZgDao;
import com.accp.pojo.T_CUSTOMERACCOUNTDETAILS;
import com.accp.pojo.T_CUSTOMER_INFORMATION;
import com.accp.vo.zg.AdvancereceiptVo;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("ZgBiz")
@Transactional(propagation =Propagation.REQUIRED)
public class ZgBiz {

        @Autowired
        private   ZgDao   zgDao;

        public List<T_CUSTOMERACCOUNTDETAILS>  queryCustomeraccountdetails(){

            return  zgDao.queryCustomeraccountdetails();
        }

    public List<T_CUSTOMER_INFORMATION> queryCUSTOMER_INFORMATION(){
            return  zgDao.queryCUSTOMER_INFORMATION();

    }


    public PageInfo<AdvancereceiptVo> getAdvancereceipt(int page) {
            PageHelper.startPage(page, 1);
            return new PageInfo<AdvancereceiptVo>(zgDao.getAdvancereceipt());
    }




}
