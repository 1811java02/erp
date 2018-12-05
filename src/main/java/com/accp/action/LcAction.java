package com.accp.action;
import com.accp.pojo.T_ADVANCECHARGE;
import com.accp.pojo.T_BUYXUN;
import com.accp.pojo.T_RUSHPAYABLE;
import com.github.pagehelper.*;
import com.accp.biz.LcBiz;
import com.accp.pojo.T_PERSONNEL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/query")
public class LcAction {

    @Autowired
    private LcBiz biz;

    //查询人员主文件
    @RequestMapping("/queryPersonnel")
    @ResponseBody
    public PageInfo<T_PERSONNEL> queryPersonnel(Integer  page)throws  Exception{
        return biz.queryPersonnel(page);
    }

    //查询应付冲款
    @RequestMapping("/queryyingfu")
    @ResponseBody
    private  PageInfo<T_RUSHPAYABLE> queryyingfu(Integer page) throws  Exception{
        return biz.queryyingfu(page);
    }

    //查询预付款
    @RequestMapping("/queryyufu")
    @ResponseBody
    private  PageInfo<T_ADVANCECHARGE> queryyufu(Integer page) throws  Exception{
        return biz.queryyufu(page);
    }

}
