package com.accp.action;


import com.accp.biz.ZgBiz;
import com.accp.pojo.T_CUSTOMERACCOUNTDETAILS;
import com.accp.pojo.T_CUSTOMER_INFORMATION;
import com.accp.vo.zg.AdvancereceiptVo;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/zg")
public class ZgAction {

    @Autowired
    private ZgBiz   zgBiz;

    @RequestMapping("/query/CUSTOMERACCOUNTDETAILS")
    public List<T_CUSTOMERACCOUNTDETAILS> queryCustomeraccountdetails(){
        return   zgBiz.queryCustomeraccountdetails();

    }

    @RequestMapping("/query/CUSTOMER_INFORMATION")
    public List<T_CUSTOMER_INFORMATION> queryCUSTOMER_INFORMATION(){
        return  zgBiz.queryCUSTOMER_INFORMATION();

    }

    @RequestMapping("/query/getAdvancereceipt")
    public PageInfo<AdvancereceiptVo> getAdvancereceipt(@RequestParam(defaultValue = "1") int page) {
        return zgBiz.getAdvancereceipt(page);
    }










}
