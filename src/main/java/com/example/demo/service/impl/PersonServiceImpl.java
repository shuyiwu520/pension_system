package com.example.demo.service.impl;


import com.example.demo.dao.PersonDao;
import com.example.demo.entity.Person;
import com.example.demo.entity.PersonCondition;
import com.example.demo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.Date;
import java.util.List;


@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonDao personDao;

    //    获取老人位置列表，在前端页面显示老人位置
    @Override
    public Double[][] getPersonLocationList() {
        List<Person> personList = personDao.getPersonLocationList();
        int a = personList.get(personList.size() - 1).getId();
        Double positions[][] = new Double[a][2];

        // 解析数据，通过id将数据封装到相应的数组下标
        //    封装到数组中
        for (int i = 0; i < personList.size(); i++) {
            //  数组地址变换的时候是从0开始的
            int m = personList.get(i).getId() - 1;
            positions[m][0] = personList.get(i).getXlocation();
            positions[m][1] = personList.get(i).getYlocation();
        }
        return positions;
    }

    //    检测所有老人是否出现危险信号，并显示
    @Override
    public List<Person> getPersonDangerousList() {

        List<Person> personList = personDao.getPersonDangerousList();
        for(int i = 0;i < personList.size();i++){
            double[] position = {personList.get(i).getXlocation(),personList.get(i).getYlocation()};
            personList.get(i).setPosition(position);
        }
        System.out.println(new Date());
        System.out.println(personList);
        return personList;
    }


    //    监测老人危险信号
    @Override
    public Person getPersonDangerous() {
        Person person = new Person();
        List<Person> personList = personDao.getPersonDangerous();
        person = personList.get(0);
        return person;
    }


    //    查看老人体检信息
    @Override
    public List<PersonCondition> getPersonCondition() {
        return personDao.getPersonCondition();
    }


    @Override
    public List<Person> getPersonList() {
        return personDao.getPersonList();
    }

    @Override
    public int addPerson(Person person) {
        return personDao.addPerson(person);
    }

    @Override
    public int updatePerson(Integer id, Person person) {
        return personDao.updatePerson(id, person);
    }

    @Override
    public int deletePerson(Integer id) {
        return personDao.deletePerson(id);
    }

    @Override
    public Person getPersonLocation(Integer id) {
        return personDao.getPersonLocation(id);
    }




}
