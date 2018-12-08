package com.accp.biz;


import com.accp.dao.WxyDao;
import com.accp.pojo.*;
import com.accp.vo.ch.PurcahseVo;
import com.accp.vo.wxy.SalesVO;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(propagation = Propagation.REQUIRED)
public class WxyBiz {

    @Autowired
    private WxyDao dao;

    //--------------销售报价表

    //查询
    public PageInfo<SalesVO> BindLastQuery(Integer page){
        PageHelper.startPage(page,1);
        return new PageInfo<SalesVO>(dao.QueryAllLast());
    }

    //新增单据编号
    public String getBillNo(String date){
        Long billno=dao.getBillNo(date);
        if (billno==null){
            return date.replace("-","")+"001";
        }else{
            return String.valueOf(billno+1);
        }
    }
    //获得业务人员
    public List<T_PERSONNEL> queryPerson(){
        return dao.queryPerson();
    }



    //获得客户信息
    public List<T_CUSTOMER_INFORMATION> queryKh(){return dao.queryKh();}

    //获得物料信息
    public List<T_DSPRODUCT> queryProduct(){return dao.queryProduct();}

    //获得部门信息
    public T_DEPARTMENT queryDept(String depid){return dao.queryDept(depid);}

    //获得物料信息
    public T_DSPRODUCT queryProdctInfo(String prodid){return dao.queryProdctInfo(prodid);
    }


    //新增主
    public int saveProduct(SalesVO pm){
        return dao.saveProduct(pm);
    }
    //新增详
    public int saveDetails(T_SALEPRICE_DETAILS d){
        return dao.saveDetails(d);
    }

    //修改
    public boolean update(SalesVO pm){
            String billno=pm.getBillno();
            dao.deleteSub(billno);
            dao.deleteMain(billno);
            dao.saveProduct(pm);
            for (T_SALEPRICE_DETAILS d:pm.getList()){
                dao.saveDetails(d);
            }
            return true;
    }

    //--------------销售报价表


}
