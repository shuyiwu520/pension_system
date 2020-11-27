package com.example.demo.service;




import com.example.demo.entity.Admin;
import com.example.demo.entity.Person;

import java.util.List;

public interface AdminService {


    Admin getAdminById(Integer id);

    Admin adminLogin(String name);

    public List<Admin> getAdminList();


}
