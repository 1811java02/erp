package com.accp.dao;

import com.accp.pojo.T_UNIT;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface LfxDao {
    //查询计量维护表
    public T_UNIT queryunit(@Param("page") Integer page);
}
