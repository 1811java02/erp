package com.accp.biz;

import com.accp.dao.ZspDao;
import com.accp.pojo.T_BUYRETURN;
import com.accp.pojo.T_DSPRODUCTCLASS;
import com.accp.pojo.T_PURCHASE_PURCHASE;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ZspBiz {
@Autowired
 private ZspDao dao;
    //****************************采购清购单************************************

    /**
     * 查询采购请购单主详表
     * @param page 要显示的数据页数
     * @return 返回分页对象
     */
    public PageInfo<T_PURCHASE_PURCHASE> getPurchasePurchase(Integer page){

        PageHelper.startPage(page, 1);
        return new PageInfo<T_PURCHASE_PURCHASE>(dao.getPurchasePurchase());
    }
    //<!-- updatePurchasePurchase  addPurchasePurchase  delPurchasePurchase-->

    /**
     * 删除采购请购单的主详表
     * @param purchasePurchase 参数是 请购单主表
     */
    public void delPurchasePurchase(String billno){
        dao.delPurchasePurchase(billno);
    }
    /**
     * 添加采购请购单的主详表
     * @param purchasePurchase 参数是 请购单主表对象 +详表集合
     */
    public void addPurchasePurchase(T_PURCHASE_PURCHASE purchasePurchase){
        dao.addPurchasePurchase(purchasePurchase);
    }
    /**
     * 添加采购请购单的主表
     * @param purchasePurchase 参数是 请购单主表对象 +详表集合
     */
    public void updatePurchasePurchase(T_PURCHASE_PURCHASE purchasePurchase){
        dao.updatePurchasePurchase(purchasePurchase);
    }
    //****************************采购退货单************************************
    /**
     * 查询采购退货单主详表
     * @param page 要显示的数据页数
     * @return 返回分页对象
     */
    public PageInfo<T_BUYRETURN> getBuyreturn(Integer page){
        PageHelper.startPage(page, 1);
        return new PageInfo<T_BUYRETURN>(dao.getBuyreturn());
    }
    //  <!-- delBuyreturn addBuyreturn updateBuyreturn -->
    /**
     * 删除采购请购单的主详表
     * @param buyreturn 参数是 请购单主表
     */
    public void delBuyreturn(T_BUYRETURN buyreturn){
        dao.delBuyreturn(buyreturn);
    }
    /**
     * 添加采购退货单的主详表
     * @param buyreturn 参数是 请购单主表对象 +详表集合
     */
    public void addBuyreturn(T_BUYRETURN buyreturn){
        dao.addBuyreturn(buyreturn);
    }
    /**
     * 添加采购退货单的主表
     * @param buyreturn 参数是 请购单主表对象 +详表集合
     */
    public void updateBuyreturn(T_BUYRETURN buyreturn){
        dao.updateBuyreturn(buyreturn);
    }
}
