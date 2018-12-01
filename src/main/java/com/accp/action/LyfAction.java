package com.accp.action;

import com.accp.biz.LyfBiz;
import com.accp.pojo.T_SALESORDER;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("")
public class LyfAction {

    @Autowired
    private LyfBiz biz;

    @RequestMapping("/lyf/query/salesorder")
    public List<T_SALESORDER> queryAllSalesorder()throws Exception{
        System.out.print(biz.queryAllSalesorder());
        return biz.queryAllSalesorder();
    }
}
