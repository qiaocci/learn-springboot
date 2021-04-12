package com.example.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@Controller
//@ResponseBody // 类返回的东西是写给浏览器的，而不是跳转页面
@RestController // 简单化，包含了上面两个controller
public class HelloController {
    @RequestMapping("/hello")
    public String handle01() {
        return "hello qiaocc";
    }
}
