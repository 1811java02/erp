package com.accp.action;

import com.accp.biz.ChBiz;
import com.accp.pojo.*;
import com.accp.vo.ch.PurcahseVo;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import oracle.jdbc.proxy.annotation.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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


    @PostMapping("/savePurchase")
    @ResponseBody
    public Map<String,String> savePurchase(@RequestBody PurcahseVo pm){
        Map<String,String> map=new HashMap<>();
        try {
            if (chbiz.savePurchase(pm)>0){
                for (T_PURCHASE_DETAIL d:pm.getDetaillist()) {
                    chbiz.savePurchaseDetail(d);
                }
                map.put("code","200");
                map.put("msg","OK");
            }
        }catch (Exception e){
            map.put("code","500");
            map.put("Msg",e.getMessage());
        }
        return map;
    }

    @GetMapping("/queryPurchase")
    @ResponseBody
    public PageInfo<PurcahseVo> queryPurchase(int pageNum){
        return chbiz.queryPurchase(pageNum);
    }

    @PostMapping("/deletePurchase")
    @ResponseBody
    public Map<String,String> deletePurchase(String billno){
        Map<String,String> map=new HashMap<>();
        try {
            if (chbiz.deletePurchase(billno)==-1){
                map.put("code","200");
                map.put("msg","OK");
            }
        }catch (Exception e){
            map.put("code","500");
            map.put("Msg",e.getMessage());
        }
        return map;
    }

    @PostMapping("/updatePurchase")
    @ResponseBody
    public Map<String,String>  updatePurchase(@RequestBody PurcahseVo pm){
        Map<String,String> map=new HashMap<>();
        try {
            if (chbiz.deletePurchase(pm.getBillno())==-1){
                if(chbiz.savePurchase(pm)>0){
                    for (T_PURCHASE_DETAIL d:pm.getDetaillist()) {
                        chbiz.savePurchaseDetail(d);
                    }
                    map.put("code","200");
                    map.put("msg","OK");
                }
            }
        }catch (Exception e){
            map.put("code","500");
            map.put("Msg",e.getMessage());
        }
        return map;
    }
}
