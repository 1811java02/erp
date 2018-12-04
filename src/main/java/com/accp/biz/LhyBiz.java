package com.accp.biz;

import com.accp.dao.LhyDao;
import com.accp.pojo.T_BILLTYPE;
import com.accp.pojo.T_CUSTOMER_INFORMATION;
import com.accp.pojo.T_DSPRODUCTCLASS;
import com.accp.pojo.T_WAREHOUSE;
import com.accp.vo.lhy.T_DSDSSALEMAIN;
import com.accp.vo.lhy.T_DSPRODUCT;
import com.accp.vo.lhy.T_PERSONNEL;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LhyBiz {
	@Autowired
	private LhyDao dao;

	public PageInfo<T_DSPRODUCT> queryDsproduct(int page, int size) {
		if (size > 0)
			PageHelper.startPage(page, size);
		return new PageInfo<T_DSPRODUCT>(dao.queryDsproduct());
	}

	public PageInfo<T_DSPRODUCTCLASS> queryDsproductclass(int page) {
		PageHelper.startPage(page, 1);
		return new PageInfo<T_DSPRODUCTCLASS>(dao.queryDsproductclass());
	}

	public List<T_CUSTOMER_INFORMATION> queryCustomer() {
		return dao.queryCustomer();
	}

	public List<T_WAREHOUSE> queryWarehouse() {
		return dao.queryWarehouse();
	}

	public List<T_PERSONNEL> queryPersonnel() {
		return dao.queryPersonnel();
	}

	public String queryDsdssalemainId(String date) {
		T_DSDSSALEMAIN dsdssalemain = dao.queryDsdssalemainByDate(date);
		if (dsdssalemain == null) {
			return date.replace("-", "") + "001";
		} else {
			return String.valueOf(Integer.valueOf(dsdssalemain.getBillno()) + 1);
		}
	}

	public List<T_BILLTYPE> queryBilltype() {
		return dao.queryBilltype();
	}
}
