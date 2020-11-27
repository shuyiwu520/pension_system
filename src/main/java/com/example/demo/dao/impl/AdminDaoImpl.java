package com.example.demo.dao.impl;


import com.example.demo.dao.AdminDao;
import com.example.demo.entity.Admin;
import com.example.demo.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AdminDaoImpl implements AdminDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public Admin getAdminById(Integer id) {
        List<Admin> list = jdbcTemplate.query("select * from admin where id = ?", new Object[]{id}, new BeanPropertyRowMapper(Admin.class));
        if(list!=null && list.size()>0){
            return list.get(0);
        }else{
            return null;
        }
    }

    @Override
    public List<Admin> getAdminList() {
        List<Admin> list = jdbcTemplate.query("select * from admin", new Object[]{}, new BeanPropertyRowMapper(Admin.class));
        if(list!=null && list.size()>0){
            return list;
        }else{
            return null;
        }
    }

    @Override
    public Admin adminLogin(String name) {
        List<Admin> list = jdbcTemplate.query("select * from admin where name = ?", new Object[]{name}, new BeanPropertyRowMapper(Admin.class));
        if(list!=null && list.size()>0){
            return list.get(0);
        }else{
            return null;
        }
    }

}
