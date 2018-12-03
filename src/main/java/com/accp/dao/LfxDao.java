package com.accp.dao;

import com.accp.pojo.T_BUYXUN;
import com.accp.pojo.T_UNIT;
import com.accp.pojo.T_WAREHOUSE;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface LfxDao {
    //查询计量维护表
    public T_UNIT queryunit(@Param("page") Integer page);
    //查询仓库维护表
    public T_WAREHOUSE queryhouse(@Param("page") Integer page);
    //查询采购询价单
    public T_BUYXUN querybuyxun(@Param("page") Integer page);
}
