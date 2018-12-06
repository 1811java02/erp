package com.accp.dao;

import com.accp.pojo.T_ADVANCECHARGE;
import com.accp.pojo.T_BUYXUN;
import com.accp.pojo.T_PERSONNEL;


import com.accp.pojo.T_RUSHPAYABLE;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface LcDao {

    //人员主文件查询
    public List<T_PERSONNEL> queryPersonnel();

    //查询应付冲款
    public List<T_RUSHPAYABLE> queryyingfu();

    //查询预付款
    public List<T_ADVANCECHARGE> queryyufu();

}
