package com.accp.action;

import com.accp.biz.ZspBiz;
import com.accp.dao.ZspDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/zsp/query")
public class ZspAction {
    @Autowired
     private ZspBiz biz;
    @RequestMapping("/get")
    @ResponseBody
    public String get(){
        System.out.print("*************************************************");
       return  biz.get();
    }
}
