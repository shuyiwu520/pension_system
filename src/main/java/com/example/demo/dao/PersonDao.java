package com.example.demo.dao;




import com.example.demo.entity.Person;
import com.example.demo.entity.PersonCondition;

import java.util.List;

public interface PersonDao {

    //    获取所有老人的定位数据
    public List<Person> getPersonLocationList();

    //    检测老人是否出现危险信号
    public List<Person> getPersonDangerous();

    //  检测全部老人是否出现危险信号
    List<Person> getPersonDangerousList();

    //    获取老人的健康体检列表
    public List<PersonCondition> getPersonCondition();

    //获取全部老人信息
    public List<Person> getPersonList();

    //获取全部老人信息位置
    public Person getPersonLocation(Integer id);


    //添加老人信息
    public int addPerson(Person person);

    //更新老人信息
    public int updatePerson(Integer id, Person person);

    //删除老人信息
    public int deletePerson(Integer id);


}
