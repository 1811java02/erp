package com.accp.action;

import com.accp.biz.LhyBiz;
import com.accp.pojo.T_BILLTYPE;
import com.accp.pojo.T_CUSTOMER_INFORMATION;
import com.accp.pojo.T_DSPRODUCTCLASS;
import com.accp.pojo.T_WAREHOUSE;
import com.accp.vo.lhy.T_DSDSSALEMAIN;
import com.accp.vo.lhy.T_DSPRODUCT;
import com.accp.vo.lhy.T_PERSONNEL;
import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/lhy")
public class LhyAction {
	@Autowired
	private LhyBiz biz;

	/**
	 * 查询物料主文件集合
	 *
	 * @param page
	 * @param size
	 * @return
	 */
	@RequestMapping("/query/dsproduct")
	public PageInfo<T_DSPRODUCT> queryDsproduct(@RequestParam(defaultValue = "1") Integer page, @RequestParam(defaultValue = "1") Integer size) {
		return biz.queryDsproduct(page, size);
	}

	/**
	 * 查询物料类别集合
	 *
	 * @param page
	 * @return
	 */
	@RequestMapping("/query/dsproductclass")
	public PageInfo<T_DSPRODUCTCLASS> queryDsproductclass(@RequestParam(defaultValue = "1") Integer page) {
		return biz.queryDsproductclass(page);
	}

	/**
	 * 查询客户集合
	 *
	 * @return
	 */
	@RequestMapping("/query/customer")
	public List<T_CUSTOMER_INFORMATION> queryCustomer() {
		return biz.queryCustomer();
	}

	/**
	 * 查询仓库集合
	 *
	 * @return
	 */
	@RequestMapping("/query/warehouse")
	public List<T_WAREHOUSE> queryWarehouse() {
		return biz.queryWarehouse();
	}

	/**
	 * 查询人员集合
	 *
	 * @return
	 */
	@RequestMapping("/query/personnel")
	public List<T_PERSONNEL> queryPersonnel() {
		return biz.queryPersonnel();
	}

	/**
	 * 查询销售出库单编号
	 *
	 * @param date
	 * @return
	 */
	@RequestMapping("/query/dsdssalemainId")
	public String queryDsdssalemainId(String date) {
		return biz.queryDsdssalemainId(date);
	}

	/**
	 * 查询出库单类型集合
	 *
	 * @return
	 */
	@RequestMapping("/query/billtype")
	public List<T_BILLTYPE> queryBilltype() {
		return biz.queryBilltype();
	}

	/**
	 * 查询销售出库单集合
	 *
	 * @param page
	 * @return
	 */
	@RequestMapping("/query/dsdssalemain")
	public PageInfo<T_DSDSSALEMAIN> queryDsdssalemain(@RequestParam(defaultValue = "1") Integer page) {
		return biz.queryDsdssalemain(page);
	}

	/**
	 * 保存销售出库单
	 *
	 * @param str
	 * @return
	 */
	@RequestMapping("/save/dsdssalemain")
	public boolean saveDsdssalemain(String str) {
		T_DSDSSALEMAIN dsdssalemain = JSON.parseObject(str, T_DSDSSALEMAIN.class);
		return biz.saveDsdssalemain(dsdssalemain);
	}

	/**
	 * 删除销售出库单
	 *
	 * @param billno
	 * @return
	 */
	@RequestMapping("/del/dsdssalemain")
	public boolean delDsdssalemain(String billno) {
		return biz.deleteDsdssalemain(billno);
	}

	/**
	 * 修改销售出库单
	 *
	 * @param str
	 * @return
	 */
	@RequestMapping("/update/dsdssalemain")
	public boolean updateDsdssalemain(String str) {
		T_DSDSSALEMAIN dsdssalemain = JSON.parseObject(str, T_DSDSSALEMAIN.class);
		return biz.updateDsdssalemain(dsdssalemain);
	}
}
