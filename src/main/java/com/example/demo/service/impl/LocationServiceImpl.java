package com.example.demo.service.impl;


import com.example.demo.dao.LocationDao;
import com.example.demo.entity.Person;
import com.example.demo.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class LocationServiceImpl implements LocationService {

    @Autowired
    private LocationDao locationDao;

    @Override
    public void updatePerson(Integer id, Person person) {
        locationDao.updateLocation(id,person);
    }
}
