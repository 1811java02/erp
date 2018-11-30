package com.accp.biz;

import com.accp.dao.ChDao;
import com.accp.pojo.T_DEPARTMENT;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("ChBiz")
public class ChBiz {
    @Autowired
    private ChDao chdao;

    public PageInfo<T_DEPARTMENT> queryDepartment(int pageNum){
        PageHelper.startPage(pageNum,1);
        return new PageInfo<T_DEPARTMENT>(chdao.queryDepartment(pageNum));
    }
}
