package com.accp.action;

import com.accp.biz.ZxBiz;
import com.accp.pojo.T_CUSTOMER_INFORMATION;
import com.accp.pojo.T_CUSTOMER_TYPE;
import com.accp.pojo.T_SALES_RETURNS;
import com.accp.vo.zx.t_returns;
import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/zx")
public class ZxAction {
  @Autowired
   private ZxBiz biz;

  public T_SALES_RETURNS queryList(Integer lim)throws Exception{
      return biz.queryList(lim);
  }

  @RequestMapping("/query")
  public List<T_SALES_RETURNS> query(){
      return biz.query();
  }

  //客户类别分页查询
    @RequestMapping("/queryCustpage")
  public PageInfo<T_CUSTOMER_TYPE>queryCustPage(@RequestParam(defaultValue = "1") Integer page){

      return biz.queryCustpage(page);
  }
    /**
     * 新增客户类别
     */
    @RequestMapping("/addcust")
    @ResponseBody
    public Map<String,String> addCusttype(String jsonStr){
        T_CUSTOMER_TYPE tcp= JSON.parseObject(jsonStr,T_CUSTOMER_TYPE.class);
        Map<String,String>message=new HashMap<String,String>();
        try {
            biz.addCustType(tcp);
            message.put("code","200");
        }catch (RuntimeException e){
            message.put("code","500");
            message.put("msg",e.getMessage());
        }
        return message;
    }
    /**
     * 查询客户主文件
     */
    @RequestMapping("/queryCustinfo")
    public PageInfo<T_CUSTOMER_INFORMATION>queryCustinfoPage(@RequestParam(defaultValue = "1") Integer page){

        return biz.queryCustinfo(page);
    }
    /**
     * 查询销售退货主详
     */
    @RequestMapping("/queryReturnsList")
    public PageInfo<t_returns>queryReturnsList(@RequestParam(defaultValue = "1") Integer page){
        return biz.queryRetrunList(page);
    }


}
