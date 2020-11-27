package com.example.demo.service;




import com.example.demo.entity.Person;
import com.example.demo.entity.PersonCondition;

import java.util.List;

public interface PersonService {


    //    获取老人的定位数据列表
    public Double[][] getPersonLocationList();

    //    获取老人的定位数据
    public List<Person> getPersonDangerousList();

    //    检测危险信号
    public Person getPersonDangerous();

    //    健康查体信息
    public List<PersonCondition> getPersonCondition();

    //获取全部老人信息
    public List<Person> getPersonList();

    //添加老人信息
    public int addPerson(Person person);

    //更新老人信息
    public int updatePerson(Integer id, Person person);

    //删除老人信息
    public int deletePerson(Integer id);

    //获取老人位置信息
    public Person getPersonLocation(Integer id);

}
