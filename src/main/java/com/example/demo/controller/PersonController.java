package com.example.demo.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.example.demo.bean.JsonResult;
import com.example.demo.entity.Person;
import com.example.demo.entity.PersonCondition;
import com.example.demo.service.AdminService;
import com.example.demo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.List;

@Controller
public class PersonController {

    @Autowired
    private PersonService personService;


    //    获取全部老人位置信息,进行初始化
    @RequestMapping("/getPersonLocationList")
    @ResponseBody
    public List<Person> getPersonLocationList() {
        List<Person> personList = personService.getPersonDangerousList();
        return personList;
    }



    //    检测老人是否出现危险信息
    @RequestMapping("/getPersonDangerousList")
    @ResponseBody
    public List<Person> getPersonDangerousList() {
        List<Person> personList = personService.getPersonDangerousList();
        return personList;
    }


    //    检测老人是否出现危险信息
    @RequestMapping("/getDangerous")
    @ResponseBody
    public Person getPersonDangerous() {
        Person person = personService.getPersonDangerous();
        System.out.println("检测危险信号执行了。。。。");
        System.out.println(new Date());
        System.out.println(person);
        return person;
    }

    //查询用户列表
    @RequestMapping(value = "/getAllPersonList")
    @ResponseBody
    public String getAllPersonList() {
        //把数据封装成json传递到前端
        JsonResult r = new JsonResult();
        List<Person> personList = personService.getPersonList();
        String s = JSON.toJSONString(personList);
        JSONObject obj = new JSONObject();
        //前台通过key值获得对应的value值
        obj.put("code", 0);
        obj.put("msg", "");
        obj.put("count", 1000);
        obj.put("data", personList);
        return obj.toJSONString();
    }


    //查询老人健康信息列表
    @RequestMapping(value = "/getPersonCondition")
    @ResponseBody
    public String getPersonCondition() {
        List<PersonCondition> personConditionList = personService.getPersonCondition();

//        System.out.println(personConditionList);

        String s = JSON.toJSONString(personConditionList);
        JSONObject obj = new JSONObject();
        //前台通过key值获得对应的value值
        obj.put("code", 0);
        obj.put("msg", "");
        obj.put("count", 1000);
        obj.put("data", personConditionList);
        return obj.toJSONString();
    }
}
