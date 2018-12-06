package com.accp.biz;

import com.accp.dao.LcDao;
import com.accp.pojo.T_ADVANCECHARGE;
import com.accp.pojo.T_BUYXUN;
import com.accp.pojo.T_RUSHPAYABLE;
import com.github.pagehelper.*;
import com.accp.pojo.T_PERSONNEL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LcBiz {
    @Autowired
    private LcDao dao;

    //人员主文件查询
    public PageInfo<T_PERSONNEL> queryPersonnel(Integer  page){
        PageHelper.startPage(page, 1);
        return new PageInfo<T_PERSONNEL>(dao.queryPersonnel());
    }
    //查询应付冲款
    public PageInfo<T_RUSHPAYABLE> queryyingfu(Integer page){
        PageHelper.startPage(page,1);
        return new PageInfo<T_RUSHPAYABLE>(dao.queryyingfu());
    }

    //查询预付款u
    public PageInfo<T_ADVANCECHARGE> queryyufu(Integer page){
        PageHelper.startPage(page,1);
        return new PageInfo<T_ADVANCECHARGE>(dao.queryyufu());
    }
}
