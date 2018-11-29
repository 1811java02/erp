package com.accp.biz;

import com.accp.dao.LhyDao;
import com.accp.pojo.TDsproduct;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LhyBiz {
	@Autowired
	private LhyDao dao;

	public PageInfo<TDsproduct> queryDsproduct(int page) {
		PageHelper.startPage(page, 1);
		return new PageInfo<TDsproduct>(dao.queryDsproduct());
	}
}
