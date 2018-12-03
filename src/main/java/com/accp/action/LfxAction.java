package com.accp.action;

import com.accp.biz.LfxBiz;
import com.accp.pojo.T_UNIT;
import com.accp.pojo.T_WAREHOUSE;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/query")
public class LfxAction {
    @Autowired
    private LfxBiz biz;
    @RequestMapping("/unit")
    @ResponseBody
    private T_UNIT queryunit(Integer page) throws  Exception{
       return  biz.queryunit(page);
    }

    @RequestMapping("/warehouse")
    @ResponseBody
    private T_WAREHOUSE querywarehouse(Integer page) throws  Exception{
                                                                                     ;
        return biz.querywarehouse(page);
    }



}
