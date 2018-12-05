package com.accp.action;

import com.accp.biz.ZspBiz;
import com.accp.pojo.T_BUYRETURN;
import com.accp.pojo.T_PURCHASE_PURCHASE;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/zsp/query")
public class ZspAction {
    @Autowired
     private ZspBiz biz;
    //****************************采购清购单************************************
    /**
     * 查询采购请购单主详表
     * @param Page 要显示的数据页数
     * @return 返回分页对象
     */
    @RequestMapping("/getPurchasePurchase")
    @ResponseBody
    public PageInfo<T_PURCHASE_PURCHASE> getPurchasePurchase(Integer Page){
       return  biz.getPurchasePurchase(Page);
    }

    //<!-- updatePurchasePurchase  addPurchasePurchase  delPurchasePurchase-->

    /**
     * 删除采购请购单的主详表
     * @param purchasePurchase 参数是 请购单主表
     */
    @RequestMapping("/delPurchasePurchase")
    @ResponseBody
    public Map<String,String > delPurchasePurchase(String billno){
        System.out.print("*******************************************************************");
        Map<String,String>map=new HashMap<String, String>();
        biz.delPurchasePurchase(billno);
        map.put("code","200");
        return map;

    }
    /**
     * 添加采购请购单的主详表
     * @param purchasePurchase 参数是 请购单主表对象 +详表集合
     */
    public Map<String,String >  addPurchasePurchase(T_PURCHASE_PURCHASE purchasePurchase){
        System.out.println("***************************************************");
        Map<String,String>map=new HashMap<String, String>();
        biz.addPurchasePurchase(purchasePurchase);
        map.put("code","200");
        return map;
    }
    /**
     * 添加采购请购单的主表
     * @param purchasePurchase 参数是 请购单主表对象 +详表集合
     */
    public Map<String,String > updatePurchasePurchase(T_PURCHASE_PURCHASE purchasePurchase){
        Map<String,String>map=new HashMap<String, String>();
        biz.updatePurchasePurchase(purchasePurchase);
        map.put("code","200");
        return map;
    }
    //<!-- updatePurchasePurchase  addPurchasePurchase  delPurchasePurchase-->
    //****************************采购退货单************************************
    /**
     * 查询采购退货单主详表
     * @param page 要显示的数据页数
     * @return 返回分页对象
     */
    @RequestMapping("/getBuyreturn")
    @ResponseBody
    public PageInfo<T_BUYRETURN> getBuyreturn(Integer page){
        return  biz.getBuyreturn(page);
    }

    /**
     * 删除采购请购单的主详表
     * @param buyreturn 参数是 请购单主表
     */
    @RequestMapping("/delBuyreturn")
    @ResponseBody
    public Map<String,String> delBuyreturn(T_BUYRETURN buyreturn){
        Map<String,String>map=new HashMap<String, String>();
        biz.delBuyreturn(buyreturn);
        map.put("code","200");
        return map;
    }
    /**
     * 添加采购退货单的主详表
     * @param buyreturn 参数是 请购单主表对象 +详表集合
     */
    public Map<String,String> addBuyreturn(T_BUYRETURN buyreturn){
        Map<String,String>map=new HashMap<String, String>();
        biz.addBuyreturn(buyreturn);
        map.put("code","200");
        return map;
    }
    /**
     * 添加采购退货单的主表
     * @param buyreturn 参数是 请购单主表对象 +详表集合
     */
    public Map<String,String> updateBuyreturn(T_BUYRETURN buyreturn){
        Map<String,String>map=new HashMap<String, String>();
        biz.updateBuyreturn(buyreturn);
        map.put("code","200");
        return map;
    }
}
