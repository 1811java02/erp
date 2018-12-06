package com.accp.action;

import com.accp.biz.LhyBiz;
import com.accp.pojo.T_BILLTYPE;
import com.accp.pojo.T_CUSTOMER_INFORMATION;
import com.accp.pojo.T_DSPRODUCTCLASS;
import com.accp.pojo.T_WAREHOUSE;
import com.accp.vo.lhy.T_DSPRODUCT;
import com.accp.vo.lhy.T_PERSONNEL;
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

    @RequestMapping("/query/dsproduct")
    public PageInfo<T_DSPRODUCT> queryDsproduct(@RequestParam(defaultValue = "1") Integer page, @RequestParam(defaultValue = "1") Integer size) {
        return biz.queryDsproduct(page, size);
    }

    @RequestMapping("/query/dsproductclass")
    public PageInfo<T_DSPRODUCTCLASS> queryDsproductclass(@RequestParam(defaultValue = "1") Integer page) {
        return biz.queryDsproductclass(page);
    }

    @RequestMapping("/query/customer")
    public List<T_CUSTOMER_INFORMATION> queryCustomer() {
        return biz.queryCustomer();
    }

    @RequestMapping("/query/warehouse")
    public List<T_WAREHOUSE> queryWarehouse() {
        return biz.queryWarehouse();
    }

    @RequestMapping("/query/personnel")
    public List<T_PERSONNEL> queryPersonnel() {
        return biz.queryPersonnel();
    }

    @RequestMapping("/query/dsdssalemainId")
    public String queryDsdssalemainId(String date) {
        return biz.queryDsdssalemainId(date);
    }

    @RequestMapping("/query/billtype")
    public List<T_BILLTYPE> queryBilltype() {
        return biz.queryBilltype();
    }
}
