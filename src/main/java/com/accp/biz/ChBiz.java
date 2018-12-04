package com.accp.biz;

import com.accp.dao.ChDao;
import com.accp.pojo.T_BILLTYPE;
import com.accp.pojo.T_DEPARTMENT;
import com.accp.pojo.T_WAREHOUSE;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("ChBiz")
public class ChBiz {
    @Autowired
    private ChDao chdao;

    public PageInfo<T_DEPARTMENT> queryDepartment(int pageNum){
        PageHelper.startPage(pageNum,1);
        return new PageInfo<T_DEPARTMENT>(chdao.queryDepartment(pageNum));
    }

    public PageInfo<T_BILLTYPE> queryBillType(int pageNum){
        PageHelper.startPage(pageNum,1);
        return new PageInfo<T_BILLTYPE>(chdao.queryBillType(pageNum));
    }

    public List<T_WAREHOUSE> queryWareHouse(){
        return chdao.queryWareHouse();
    }

    public List<T_WAREHOUSE>  queryWare(){
       return chdao.queryWareHouse();
    }

    public List<T_BILLTYPE> queryBillTypeByRk(){
        return chdao.queryBillTypeByRk();
    }

    public String getBillNo(String date){
        Long billno=chdao.getBillNo(date);
        if (billno==null){
            return date.replace("-","")+"001";
        }else{
            return String.valueOf(billno+1);
        }
    }
}
