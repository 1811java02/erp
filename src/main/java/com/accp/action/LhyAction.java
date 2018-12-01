package com.accp.action;

import com.accp.biz.LhyBiz;
import com.accp.vo.lhy.T_DSPRODUCT;
import com.accp.pojo.T_DSPRODUCTCLASS;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController("")
public class LhyAction {
	@Autowired
	private LhyBiz biz;

	@RequestMapping("/lhy/query/dsproduct")
	public PageInfo<T_DSPRODUCT> queryDsproduct(@RequestParam(defaultValue = "1") Integer page, @RequestParam(defaultValue = "1") Integer size) {
		return biz.queryDsproduct(page, size);
	}

	@RequestMapping("/lhy/query/dsproductclass")
	public PageInfo<T_DSPRODUCTCLASS> queryDsproductclass(@RequestParam(defaultValue = "1") Integer page) {
		return biz.queryDsproductclass(page);
	}
}
