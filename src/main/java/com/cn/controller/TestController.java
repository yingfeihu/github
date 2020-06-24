package com.cn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: 应飞虎
 * @Date: 2020/6/24 11:27
 * @Desc:
 */
@Controller
@ResponseBody
public class TestController {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello() {
        //我现在也要修改这里代码
        return "hello";
    }
}
