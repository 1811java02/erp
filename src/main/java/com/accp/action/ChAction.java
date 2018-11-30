package com.accp.action;

import com.accp.biz.ChBiz;
import com.accp.pojo.T_DEPARTMENT;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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
}
