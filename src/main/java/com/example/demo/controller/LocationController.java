package com.example.demo.controller;


import com.alibaba.fastjson.JSONObject;
import com.example.demo.entity.Person;
import com.example.demo.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class LocationController {

    @Autowired
    private LocationService locationService;

    //测试手机中的定位数据的传输
    @RequestMapping("/testGPS")
    public void testGPS(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse){

        // 获取手机中的GPS数据
        String aa = httpServletRequest.getParameter("name");
        //  对数据解析，前边的是经度
        String xx = aa.substring(0,10);
        String yy = aa.substring(11,20);
        // 将数据转化成小数
        Double xlocation = Double.parseDouble(xx);
        Double ylocation =Double.parseDouble(yy);

        //  对数据进行封装，将数据封装到实体类中
        Person person = new Person();
        person.setXlocation(xlocation);
        person.setYlocation(ylocation);
        locationService.updatePerson(2,person);

    }
}
