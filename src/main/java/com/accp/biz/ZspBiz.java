package com.accp.biz;

import com.accp.dao.ZspDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ZspBiz {
@Autowired
 private ZspDao dao;
    public String get(){
        return dao.get();
    }
}
