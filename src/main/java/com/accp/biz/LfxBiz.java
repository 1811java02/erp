package com.accp.biz;

import com.accp.dao.LfxDao;
import com.accp.pojo.T_UNIT;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LfxBiz {
    @Autowired
    private LfxDao dao;

    public T_UNIT queryunit(Integer page){
        return dao.queryunit(page);
    }

}
