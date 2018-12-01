package com.accp.biz;

import com.accp.dao.LyfDao;
import com.accp.pojo.T_SALESORDER;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(propagation =Propagation.REQUIRED)
public class LyfBiz {

    @Autowired
    private LyfDao dao;

    public List<T_SALESORDER> queryAllSalesorder(){
        return dao.queryAllSalesorder();
    }
}
