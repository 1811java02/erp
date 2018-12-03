package com.accp.action;

import com.accp.biz.ChBiz;
import com.accp.pojo.T_BILLTYPE;
import com.accp.pojo.T_DEPARTMENT;
import com.accp.pojo.T_WAREHOUSE;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/ch")
public class ChAction {
    @Autowired
    private ChBiz chbiz;

    @GetMapping("/queryDepartment")
    @ResponseBody
    public PageInfo<T_DEPARTMENT> queryDepartment(int pageNum){
        return chbiz.queryDepartment(pageNum);
    }

    @GetMapping("/queryBillType")
    @ResponseBody
    public PageInfo<T_BILLTYPE> queryBillType(int pageNum){
        return chbiz.queryBillType(pageNum);
    }

    @GetMapping("/queryWare")
    @ResponseBody
    public List<T_WAREHOUSE> queryWare(){
        return chbiz.queryWare();
    }

    @GetMapping("/queryBillTypeByRk")
    @ResponseBody
    public List<T_BILLTYPE> queryBillTypeByRk(){
        return chbiz.queryBillTypeByRk();
    }

    @GetMapping("/getBillNo")
    @ResponseBody
    public String getBillNo(String date){
       return chbiz.getBillNo(date);
    }
}
