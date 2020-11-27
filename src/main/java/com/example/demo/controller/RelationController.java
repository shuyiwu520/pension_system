package com.example.demo.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.example.demo.bean.JsonResult;
import com.example.demo.entity.Relation;
import com.example.demo.service.AdminService;
import com.example.demo.service.RelationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.List;

@Controller
public class RelationController {

    @Autowired
    private RelationService relationService;



    //查询用户列表
    @RequestMapping(value = "/getRelationList")
    @ResponseBody
    public String getRelationList() {
        //把数据封装成json传递到前端
        JsonResult r = new JsonResult();
        List<Relation> relationList = relationService.getRelationList();
        String s = JSON.toJSONString(relationList);
        JSONObject obj = new JSONObject();
        //前台通过key值获得对应的value值
        obj.put("code", 0);
        obj.put("msg", "");
        obj.put("count", 1000);
        obj.put("data", relationList);
        return obj.toJSONString();
    }

}
