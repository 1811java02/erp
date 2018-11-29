package com.accp.action;

import com.accp.biz.LhyBiz;
import com.accp.pojo.TDsproduct;
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
	public PageInfo<TDsproduct> queryDsproduct(@RequestParam(defaultValue = "1") Integer page) {
		return biz.queryDsproduct(page);
	}
}
