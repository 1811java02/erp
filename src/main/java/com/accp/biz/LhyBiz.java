package com.accp.biz;

import com.accp.dao.LhyDao;
import com.accp.pojo.T_BILLTYPE;
import com.accp.pojo.T_CUSTOMER_INFORMATION;
import com.accp.pojo.T_DSPRODUCTCLASS;
import com.accp.pojo.T_WAREHOUSE;
import com.accp.vo.lhy.T_DSDSSALEMAIN;
import com.accp.vo.lhy.T_DSDSSALESUB;
import com.accp.vo.lhy.T_DSPRODUCT;
import com.accp.vo.lhy.T_PERSONNEL;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service
@Transactional(propagation = Propagation.REQUIRED)
public class LhyBiz {
	@Autowired
	private LhyDao dao;

	/**
	 * 查询物料主文件集合
	 *
	 * @param page
	 * @param size
	 * @return
	 */
	public PageInfo<T_DSPRODUCT> queryDsproduct(int page, int size) {
		if (size > 0)
			PageHelper.startPage(page, size);
		return new PageInfo<T_DSPRODUCT>(dao.queryDsproduct());
	}

	/**
	 * 查询物料类别集合
	 *
	 * @param page
	 * @return
	 */
	public PageInfo<T_DSPRODUCTCLASS> queryDsproductclass(int page) {
		PageHelper.startPage(page, 1);
		return new PageInfo<T_DSPRODUCTCLASS>(dao.queryDsproductclass());
	}

	/**
	 * 查询客户机和
	 *
	 * @return
	 */
	public List<T_CUSTOMER_INFORMATION> queryCustomer() {
		return dao.queryCustomer();
	}

	/**
	 * 查询仓库集合
	 *
	 * @return
	 */
	public List<T_WAREHOUSE> queryWarehouse() {
		return dao.queryWarehouse();
	}

	/**
	 * 查询人员集合
	 *
	 * @return
	 */
	public List<T_PERSONNEL> queryPersonnel() {
		return dao.queryPersonnel();
	}

	/**
	 * 查询销售出库单编号
	 *
	 * @param date
	 * @return
	 */
	public String queryDsdssalemainId(String date) {
		String id = dao.queryDsdssalemainByDate(date);
		if (id == null) {
			return date.replace("-", "") + "001";
		} else {
			return String.valueOf(Long.valueOf(id) + 1);
		}
	}

	/**
	 * 查询出库单类型
	 *
	 * @return
	 */
	public List<T_BILLTYPE> queryBilltype() {
		return dao.queryBilltype();
	}

	/**
	 * 查询销售出库单
	 *
	 * @param page
	 * @return
	 */
	public PageInfo<T_DSDSSALEMAIN> queryDsdssalemain(int page) {
		PageHelper.startPage(page, 1);
		return new PageInfo<T_DSDSSALEMAIN>(dao.queryDsdssalemain());
	}

	/**
	 * 保存销售出库单
	 *
	 * @param dsdssalemain
	 * @return
	 */
	public boolean saveDsdssalemain(T_DSDSSALEMAIN dsdssalemain) {
		dsdssalemain.setPermittype(0);
		dao.saveDsdssalemain(dsdssalemain);
		for (T_DSDSSALESUB dsdssalesub : dsdssalemain.getDsdssalesub()) {
			dsdssalesub.setBillno(dsdssalemain.getBillno());
			dao.saveDsdssalesub(dsdssalesub);
		}
		return true;
	}

	/**
	 * 删除销售出库单
	 *
	 * @param billno
	 * @return
	 */
	public boolean deleteDsdssalemain(String billno) {
		dao.deleteDsdssalesub(billno);
		dao.deleteDsdssalemain(billno);
		return true;
	}

	/**
	 * 修改销售出库单
	 *
	 * @param dsdssalemain
	 * @return
	 */
	public boolean updateDsdssalemain(T_DSDSSALEMAIN dsdssalemain) {
		if (deleteDsdssalemain(dsdssalemain.getBillno()))
			saveDsdssalemain(dsdssalemain);
		return true;
	}
}
