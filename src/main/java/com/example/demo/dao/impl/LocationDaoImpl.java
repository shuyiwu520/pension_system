package com.example.demo.dao.impl;


import com.example.demo.dao.LocationDao;
import com.example.demo.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


@Repository
public class LocationDaoImpl implements LocationDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;


    @Override
    public void updateLocation(Integer id, Person person) {
        System.out.println(person.getXlocation());
        System.out.println(person.getYlocation());
        jdbcTemplate.update("UPDATE personlocation SET xlocation = ? , ylocation = ? WHERE id=?",
                person.getXlocation(),person.getYlocation(), id);
    }
}
