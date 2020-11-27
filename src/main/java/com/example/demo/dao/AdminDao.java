package com.example.demo.dao;




import com.example.demo.entity.Admin;
import com.example.demo.entity.Person;

import java.util.List;

public interface AdminDao {

    Admin getAdminById(Integer id);
    Admin adminLogin(String name);
    public List<Admin> getAdminList();



}
