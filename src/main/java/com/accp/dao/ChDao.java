package com.accp.dao;

import com.accp.pojo.T_DEPARTMENT;
import java.util.List;

public interface ChDao {
    /**
     * 查询部门
     * @param pageNum 分页当前页
     * @return
     */
    public List<T_DEPARTMENT> queryDepartment(int pageNum);
}
