package com.accp.biz;


import com.accp.dao.ZgDao;
import com.accp.pojo.*;
import com.accp.vo.zg.AdvancereceiptVo;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("ZgBiz")
@Transactional(propagation = Propagation.REQUIRED)
public class ZgBiz {

        @Autowired
        private   ZgDao   zgDao;

        public List<T_CUSTOMERACCOUNTDETAILS>  queryCustomeraccountdetails(){

            return  zgDao.queryCustomeraccountdetails();
        }

    public List<T_CUSTOMER_INFORMATION> queryCUSTOMER_INFORMATION(){
            return  zgDao.queryCUSTOMERINFORMATION();

    }


    public PageInfo<AdvancereceiptVo> getAdvancereceipt(int page) {
            PageHelper.startPage(page, 1);
            return new PageInfo<AdvancereceiptVo>(zgDao.getAdvancereceipt());
    }

    public int deleteAdvancereceipt(String fundbillid){
       return zgDao.deleteAdvancereceipt(fundbillid);

    }


    public List<T_DEPARTMENT> queryDepartment(){

        return zgDao.queryDepartment();
    }


    public String getBillNo(String date){
        Long billno=zgDao.getBillNo(date);
        if (billno==null){
            return date.replace("-","")+"001";
        }else{
            return String.valueOf(billno+1);
        }
    }


    public int addAdvancereceipt(AdvancereceiptVo  Advancereceipt){
            return zgDao.saveAdvancereceipt(Advancereceipt);

    }



    public int addAdvancereceiptdateils(T_ADVANCERECEIPTDETAILS AdvancereceiptDetails){
        return zgDao.saveAdvancereceiptdateils(AdvancereceiptDetails);

    }


}
