package com.example.demo.dao;


import com.example.demo.entity.Person;

public interface LocationDao {

    ///更新老人位置信息
    public void updateLocation(Integer id, Person person);
}
