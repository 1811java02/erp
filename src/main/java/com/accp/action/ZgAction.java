package com.accp.action;


import com.accp.biz.ZgBiz;
import com.accp.pojo.*;
import com.accp.vo.zg.AdvancereceiptVo;
import com.accp.vo.zg.ReceivablechargeVo;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Controller
@RequestMapping("/zg")
public class ZgAction {

    @Autowired
    private ZgBiz   zgBiz;


    @GetMapping("/queryCUSTOMERACCOUNTDETAILS")
    @ResponseBody
    public List<T_CUSTOMERACCOUNTDETAILS> queryCustomeraccountdetails(){
        return   zgBiz.queryCustomeraccountdetails();

    }

    @GetMapping("/queryCUSTOMER_INFORMATION")
    @ResponseBody
    public List<T_CUSTOMER_INFORMATION> queryCUSTOMER_INFORMATION(){
        return  zgBiz.queryCUSTOMER_INFORMATION();

    }

    @GetMapping("/queryDepartment")
    @ResponseBody
    public List<T_DEPARTMENT> queryDepartment( ){
        return zgBiz.queryDepartment();
    }

    @GetMapping("/getBillNo")
    @ResponseBody
    public String getBillNo(String date){
        return zgBiz.getBillNo(date);
    }



    @GetMapping("/getAdvancereceipt")
    @ResponseBody
    public PageInfo<AdvancereceiptVo> getAdvancereceipt(@RequestParam(defaultValue = "1") int page) {
        return zgBiz.getAdvancereceipt(page);
    }

    @GetMapping("/getReceivablecharge")
    @ResponseBody
    public PageInfo<ReceivablechargeVo> getReceivablecharge(@RequestParam(defaultValue = "1") int page) {
        return zgBiz.getReceivablecharge(page);
    }


    /**
     * 删除预收款单的主详表
     * @param
     */
    @PostMapping("/deleteAdvancereceipt")
    @ResponseBody
    public Map<String,String> delAdvancereceipt(String  fundbillid){
        Map<String,String>map=new HashMap<String, String>();
        zgBiz.deleteAdvancereceipt(fundbillid);
        map.put("code","200");
        return map;
    }

    @PostMapping("/saveAdvancereceipt")
    @ResponseBody
    public Map<String,String> saveAdvancereceipt(@RequestBody AdvancereceiptVo pm){
        Map<String,String> map=new HashMap<>();
        try {
            if (zgBiz.addAdvancereceipt(pm)>0){
                for (T_ADVANCERECEIPTDETAILS d:pm.getDetails()) {
                    zgBiz.addAdvancereceiptdateils(d);
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

    @PostMapping("/updateAdvancereceipt")
    @ResponseBody
    public Map<String,String> updatesaveAdvancereceipt(@RequestBody AdvancereceiptVo pm){
        Map<String,String> map=new HashMap<>();
        try {
            if (zgBiz.deleteAdvancereceipt(pm.getFundbillid())==-1){
                if (zgBiz.addAdvancereceipt(pm)>0){
                    for (T_ADVANCERECEIPTDETAILS d:pm.getDetails()) {
                        zgBiz.addAdvancereceiptdateils(d);
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


    /**
     * 删除应收冲款单的主详表
     * @param
     */
    @PostMapping("/deleteReceivablecharge")
    @ResponseBody
    public Map<String,String> deleteReceivablecharge(String  fundbillid){
        Map<String,String>map=new HashMap<String, String>();
        zgBiz.deleteReceivablecharge(fundbillid);
        map.put("code","200");
        return map;
    }

    @PostMapping("/addReceivablecharge")
    @ResponseBody
    public Map<String,String> addReceivablecharge(@RequestBody ReceivablechargeVo pm){
        Map<String,String> map=new HashMap<>();
        try {
            if (zgBiz.addReceivablecharge(pm)>0){
                for (T_RECEIVABLECHARGEDETAILS d:pm.getReceivablechargedetails()) {
                    zgBiz.addReceivablechargedetails(d);
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

    @PostMapping("/updateReceivablecharge")
    @ResponseBody
    public Map<String,String> updateReceivablecharge(@RequestBody ReceivablechargeVo pm){
        Map<String,String> map=new HashMap<>();
        try {
            if (zgBiz.deleteReceivablecharge(pm.getFundbillid())==-1){
                if (zgBiz.addReceivablecharge(pm)>0){
                    for (T_RECEIVABLECHARGEDETAILS d:pm.getReceivablechargedetails()) {
                        zgBiz.addReceivablechargedetails(d);
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
