package com.accp.biz;

import com.accp.dao.ChDao;
import com.accp.pojo.*;
import com.accp.vo.ch.PurcahseVo;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("ChBiz")
@Transactional(isolation = Isolation.READ_COMMITTED,propagation = Propagation.SUPPORTS,readOnly = true)
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

    public List<T_PERSONNEL> queryPerson(){
        return chdao.queryPerson();
    }

    public List<T_DSDATASET1> queryShort(){
        return chdao.queryShort();
    }

    public String querySubordinateDept(String personname){
        return chdao.querySubordinateDept(personname);
    }

    public  List<T_DSPRODUCT> queryProdct(){
        return chdao.queryProdct();
    }

    public T_DSPRODUCT queryProdctInfo(String prodid){
        return chdao.queryProdctInfo(prodid);
    }

    @Transactional(isolation = Isolation.READ_COMMITTED,propagation = Propagation.REQUIRED,readOnly = false)
    public int savePurchase(PurcahseVo pm){
        return chdao.savePurchase(pm);
    }

    @Transactional(isolation = Isolation.READ_COMMITTED,propagation = Propagation.REQUIRED,readOnly = false)
    public int savePurchaseDetail(T_PURCHASE_DETAIL d){
        return chdao.savePurchaseDetail(d);
    }

    public PageInfo<PurcahseVo> queryPurchase(int pageNum){
        PageHelper.startPage(pageNum,1);
        return new PageInfo<PurcahseVo>(chdao.queryPurchase());
    }

    @Transactional(isolation = Isolation.READ_COMMITTED,propagation = Propagation.REQUIRED,readOnly = false)
    public int deletePurchase(String billno){
        return chdao.deletePurchase(billno);
    }
}
