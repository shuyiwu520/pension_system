package com.example.demo.controller;




import com.alibaba.fastjson.JSONObject;
import com.example.demo.bean.JsonResult;
import com.example.demo.entity.Admin;
import com.example.demo.entity.Person;
import com.example.demo.service.AdminService;
import com.example.demo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class AdminController {

    @Autowired
    private AdminService adminService;

    private PersonService personService;

    @RequestMapping(value = "/adminlogin")
    //从前端获取数据进行数据解析
    public String loginSuccess(@Param("name") String name, String password) {
        Admin admin = adminService.adminLogin(name);
        if (admin.getPassword().equals(password))
            return "view/adminview";
        else
            return "error";
    }

    //查询用户列表
    @RequestMapping(value = "/adminList")
    @ResponseBody
    public String getAdminList() {
        //把数据封装成json传递到前端
        List<Admin> adminList = adminService.getAdminList();
        System.out.println(adminList);
        JSONObject obj = new JSONObject();
        //前台通过key值获得对应的value值
        obj.put("code", 0);
        obj.put("msg", "");
        obj.put("count", 1000);
        obj.put("data", adminList);
//		  array.add(obj);
        return obj.toString();
    }

    //查询用户列表
    @RequestMapping(value = "/personList")
    public ResponseEntity<JsonResult> getPersonList() {
        //把数据封装成json传递到前端
        JsonResult r = new JsonResult();
        try {
            List<Person> personList = personService.getPersonList();
            r.setResult(personList);        //封装数据
            r.setStatus("ok");
        } catch (Exception e) {
            r.setResult(e.getClass().getName() + ":" + e.getMessage());
            r.setStatus("error");
            e.printStackTrace();
        }
        return ResponseEntity.ok(r);
    }


    /**
     * 添加用户
     *
     * @param person
     * @return
     */
    @RequestMapping(value = "/person")
    public ResponseEntity<JsonResult> addPerson(@RequestBody Person person) {
        JsonResult r = new JsonResult();
        try {
            int orderId = personService.addPerson(person);
            if (orderId < 0) {
                r.setResult(orderId);
                r.setStatus("fail");
            } else {
                r.setResult(orderId);
                r.setStatus("ok");
            }
        } catch (Exception e) {
            r.setResult(e.getClass().getName() + ":" + e.getMessage());
            r.setStatus("error");

            e.printStackTrace();
        }
        return ResponseEntity.ok(r);
    }

    /**
     * 根据id删除用户
     *
     * @param id
     * @return
     */
//    @RequestMapping(value = "/userdelet/{id}", method = RequestMethod.DELETE)
    @RequestMapping(value = "/userdelet/{id}")
    public ResponseEntity<JsonResult> deletePerson(@PathVariable(value = "id") Integer id) {
        JsonResult r = new JsonResult();
        try {
            int ret = personService.deletePerson(id);
            if (ret < 0) {
                r.setResult(ret);
                r.setStatus("fail");
            } else {
                r.setResult(ret);
                r.setStatus("ok");
            }
        } catch (Exception e) {
            r.setResult(e.getClass().getName() + ":" + e.getMessage());
            r.setStatus("error");

            e.printStackTrace();
        }
        return ResponseEntity.ok(r);
    }

    /**
     * 根据id修改用户信息
     *
     * @param person
     * @return
     */
//    @RequestMapping(value = "/userupdate/{id}", method = RequestMethod.PUT)
    @RequestMapping(value = "/userupdate/{id}")
    public ResponseEntity<JsonResult> updatePerson(@PathVariable("id") Integer id, @RequestBody Person person) {
        JsonResult r = new JsonResult();
        try {
            int ret = personService.updatePerson(id, person);
            if (ret < 0) {
                r.setResult(ret);
                r.setStatus("fail");
            } else {
                r.setResult(ret);
                r.setStatus("ok");
            }
        } catch (Exception e) {
            r.setResult(e.getClass().getName() + ":" + e.getMessage());
            r.setStatus("error");

            e.printStackTrace();
        }
        return ResponseEntity.ok(r);
    }

    //查询老人位置信息
    @RequestMapping(value = "/personLoction/{id}")
    public ResponseEntity<JsonResult> getPersonLoction(@PathVariable(value = "id") Integer id) {
        //把数据封装成json传递到前端
        JsonResult r = new JsonResult();
        try {
            Person person = personService.getPersonLocation(id);
            r.setResult(person);        //封装数据
            r.setStatus("ok");
        } catch (Exception e) {
            r.setResult(e.getClass().getName() + ":" + e.getMessage());
            r.setStatus("error");
            e.printStackTrace();
        }
        return ResponseEntity.ok(r);
    }
}

