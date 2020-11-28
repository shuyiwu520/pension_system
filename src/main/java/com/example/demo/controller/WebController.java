package com.example.demo.controller;

import com.example.demo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebController {

    @Autowired
    private PersonService personService;

    @RequestMapping("/shoujiLocation")
    public String shoujiLocation() {
        return "location/shoujiLocation";
    }


    //    开发测试类页面集合

    @RequestMapping("/testnihao")
    public String testnihao() {
        return "test/nihao";
    }


    //    首页
    @RequestMapping("/index")
    public String index() {
        return "index";
    }

    // 管理员登录页面
    @RequestMapping("/loginadmin")
    public String loginadmin() {
        return "login/loginadmin";
    }

    //家属登录
    @RequestMapping("/loginuser")
    public String loginuser() {
        return "login/loginuser";
    }


    // list各类信息列表页面

    //老人信息列表
    @RequestMapping("/oldList")
    public String oldList() {
        return "list/oldList";
    }


    //老人健康体检列表
    @RequestMapping("/conditionlist")
    public String conditionlist() {
        return "list/conditionlist";
    }

    //    监控页面
    @RequestMapping("/adminview")
    public String adminview() {
        return "view/adminview";
    }

    //老人健康体检列表
    @RequestMapping("/medicinelist")
    public String medicineList() {
        return "list/medicinelist";
    }

    //家属信息列表
    @RequestMapping("/relationList")
    public String relationList() {
        return "list/relationList";
    }


    @RequestMapping("/register")
    public String register() {
        return "register";
    }


    @RequestMapping("/point")
    public String point() {
        return "success";
    }


}
