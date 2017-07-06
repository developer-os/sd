package com.chen.controller;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2017/7/6 0006.
 */
@Controller
@RequestMapping("/main")
public class MainController {
    protected Logger logger = LogManager.getLogger(MainController.class);;
   @RequestMapping("/manager")
    public String main(){
        return "main";
    }
}
