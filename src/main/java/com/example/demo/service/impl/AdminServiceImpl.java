package com.example.demo.service.impl;



import com.example.demo.dao.AdminDao;
import com.example.demo.entity.Admin;
import com.example.demo.entity.Person;
import com.example.demo.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminDao adminDao;

    @Override
    public Admin getAdminById(Integer id) {
        return adminDao.getAdminById(id);
    }

    @Override
    public Admin adminLogin(String name) {
        return adminDao.adminLogin(name);
    }

    @Override
    public List<Admin> getAdminList() {
        return adminDao.getAdminList();
    }


}
