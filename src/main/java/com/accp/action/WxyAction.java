package com.accp.action;


import com.accp.biz.WxyBiz;
import com.accp.pojo.*;
import com.accp.vo.ch.PurcahseVo;
import com.accp.vo.wxy.SalesVO;
import com.accp.vo.wxy.T_DSVO;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/wxy")
public class WxyAction {

    @Autowired
    private WxyBiz biz;
    //--------------销售报价表

    /**
     * 分页查询
     *
     * @param page
     * @return
     */
    @RequestMapping("/query")
    public PageInfo<SalesVO> query(@RequestParam(defaultValue = "1") Integer page) {
        return biz.BindLastQuery(page);
    }

    /**
     * 根据当前日期生成编号
     *
     * @param date
     * @return
     */
    @GetMapping("/getBillNo")
    public String getBillNo(String date) {
        return biz.getBillNo(date);
    }

    /**
     * 获得业务人员
     *
     * @return
     */
    @GetMapping("/queryPerson")
    public List<T_PERSONNEL> queryPerson() {
        return biz.queryPerson();
    }

    /**
     * 查询客户
     *
     * @return
     */
    @GetMapping("queryKh")
    public List<T_CUSTOMER_INFORMATION> queryKh() {
        return biz.queryKh();
    }

    @GetMapping("queryDept")
    public T_DEPARTMENT queryDept(String depid) {
        System.out.print(depid);
        return biz.queryDept(depid);
    }

    /**
     * 查询物料
     *
     * @return
     */
    @GetMapping("queryProduct")
    public List<T_DSPRODUCT> queryProduct() {
        return biz.queryProduct();
    }

    /**
     * 查询物料详情
     * @param prodid
     * @return
     */
    @GetMapping("/queryProdctInfo")
    public T_DSPRODUCT queryProdctInfo(String prodid) {
        return biz.queryProdctInfo(prodid);
    }


    /**
     * 新增物料信息
     * @param pm
     * @return
     */
    @PostMapping("/saveProduct")
    public Map<String, String> savePurchase(@RequestBody SalesVO pm) {
        Map<String, String> map = new HashMap<>();
        try {
            if (biz.saveProduct(pm) > 0) {
                for (T_SALEPRICE_DETAILS d : pm.getList()) {
                    biz.saveDetails(d);
                }
                map.put("code", "200");
                map.put("msg", "OK");
            }
        } catch (Exception e) {
            e.printStackTrace();
            map.put("code", "500");
            map.put("Msg", e.getMessage());
        }
        return map;
    }


    /**
     * 李航宇写的--修改
     * @param pm
     * @return
     */
    @PostMapping("/update")
    public Map<String, String> updateSalesPrice(@RequestBody SalesVO pm) {
        Map<String, String> map = new HashMap<>();
        boolean flag=biz.update(pm);
        String code=flag?"200":"500";
        map.put("code",code);
        return map;
    }

    /**
     * 删除功能
     * @param billno
     * @return
     */
    @GetMapping("/del")
    public Map<String,String> dsdssalemain(String billno){
        Map<String,String> map = new HashMap<>();
        boolean flag = biz.deleteMain(billno);
        String code=flag?"200":"500";
        map.put("code",code);
       return map;
    }
    //--------------销售报价表

    //-----------供应商action
    @RequestMapping("/queryDS")
    public PageInfo<T_DSVO> queryAll(@RequestParam(defaultValue = "1") Integer page){
     return  biz.queryDs(page);
    }
    //-----------供应商action
}
