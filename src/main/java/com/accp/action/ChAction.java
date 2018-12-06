package com.accp.action;

import com.accp.biz.ChBiz;
import com.accp.pojo.*;
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

    @GetMapping("/queryPerson")
    @ResponseBody
    public List<T_PERSONNEL> queryPerson(){
        return chbiz.queryPerson();
    }

    @GetMapping("/queryShort")
    @ResponseBody
    public List<T_DSDATASET1> queryShort(){
        return chbiz.queryShort();
    }

    @GetMapping("/querySubordinateDept")
    @ResponseBody
    public String querySubordinateDept(String personname){
        return chbiz.querySubordinateDept(personname);
    }

    @GetMapping("/queryProdct")
    @ResponseBody
    public List<T_DSPRODUCT> queryProdct() {
        return chbiz.queryProdct();
    }

    @GetMapping("/queryProdctInfo")
    @ResponseBody
    public T_DSPRODUCT queryProdctInfo(String prodid){
        return chbiz.queryProdctInfo(prodid);
    }
}
