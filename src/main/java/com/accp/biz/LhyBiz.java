package com.accp.biz;

import com.accp.dao.LhyDao;
import com.accp.vo.lhy.T_DSPRODUCT;
import com.accp.pojo.T_DSPRODUCTCLASS;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LhyBiz {
	@Autowired
	private LhyDao dao;

	public PageInfo<T_DSPRODUCT> queryDsproduct(int page) {
		PageHelper.startPage(page, 1);
		return new PageInfo<T_DSPRODUCT>(dao.queryDsproduct());
	}

	public PageInfo<T_DSPRODUCTCLASS> queryDsproductclass(int page) {
		PageHelper.startPage(page, 1);
		return new PageInfo<T_DSPRODUCTCLASS>(dao.queryDsproductclass());
	}
}
