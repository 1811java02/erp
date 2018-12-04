package com.accp.dao;

import com.accp.pojo.T_BUYRETURN;
import com.accp.pojo.T_PURCHASE_PURCHASE;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ZspDao {
      //********************采购请购单***********************

      /**
       * 采购请购主详查询
       * @return 返回主表集合 + 详表集合
       */
      List<T_PURCHASE_PURCHASE> getPurchasePurchase();
    //<!-- updatePurchasePurchase  addPurchasePurchase  delPurchasePurchase-->
      /**
       * 对采购请购单主详表删除
       * @param buyreturn 参数是 采购单主表对象
       * @return 返回受影响的行数
       */
      int delPurchasePurchase(@Param("billno")String billno);
      /**
       * 对采购请购单主详表删除
       * @param buyreturn 参数是 采购单主表对象
       * @return 返回受影响的行数
       */
      int addPurchasePurchase(@Param("purchasePurchase")T_PURCHASE_PURCHASE purchasePurchase);
      /**
       * 对采购请购主详表删除
       * @param buyreturn 参数是 采购单主表对象
       * @return 返回受影响的行数
       */
      int updatePurchasePurchase(@Param("purchasePurchase")T_PURCHASE_PURCHASE purchasePurchase);
      //*********************采购退货单*********************
      /**
       * 采购退货主详查询
       * @return 返回主表集合 + 详表集合
       */
      List<T_BUYRETURN>getBuyreturn();
      //  <!-- delBuyreturn addBuyreturn updateBuyreturn -->

      /**
       * 对采购退货单主详表删除
       * @param buyreturn 参数是 采购单主表对象
       * @return 返回受影响的行数
       */
      int delBuyreturn(@Param("buyreturn")T_BUYRETURN buyreturn);
      /**
       * 对采购退货单主详表删除
       * @param buyreturn 参数是 采购单主表对象
       * @return 返回受影响的行数
       */
      int addBuyreturn(@Param("buyreturn")T_BUYRETURN buyreturn);
      /**
       * 对采购退货单主详表删除
       * @param buyreturn 参数是 采购单主表对象
       * @return 返回受影响的行数
       */
      int updateBuyreturn(@Param("buyreturn")T_BUYRETURN buyreturn);
}
