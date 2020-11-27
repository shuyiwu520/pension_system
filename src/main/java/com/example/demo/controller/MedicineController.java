package com.example.demo.controller;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.example.demo.entity.Medicine;
import com.example.demo.service.MedicineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class MedicineController {

    @Autowired
    private MedicineService medicineService;

    @RequestMapping("/getMedicineList")
    @ResponseBody
    public String getMedicineList(){
        List<Medicine> medicineList = medicineService.getMedicineList();

        String s = JSON.toJSONString(medicineList);
        JSONObject obj = new JSONObject();
        //前台通过key值获得对应的value值
        obj.put("code", 0);
        obj.put("msg", "");
        obj.put("count", 1000);
        obj.put("data", medicineList);
        return obj.toJSONString();
    }
}
