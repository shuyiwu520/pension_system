package com.example.demo.service.impl;



import com.example.demo.dao.AdminDao;
import com.example.demo.dao.RelationDao;
import com.example.demo.entity.Admin;
import com.example.demo.entity.Person;
import com.example.demo.entity.Relation;
import com.example.demo.service.RelationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RelationServiceImpl implements RelationService {

    @Autowired
    private RelationDao relationDao;



    @Override
    public Relation getRelationById(Integer id) {
        return relationDao.getRelationById(id);
    }

    @Override
    public Relation relationLogin(String name) {
        return relationDao.relationLogin(name);
    }

    @Override
    public List<Relation> getRelationList() {
        return relationDao.getRelationList();
    }

    @Override
    public int addRelation(Relation relation) {
        return relationDao.addRelation(relation);
    }

    @Override
    public int updateRelation(Integer id, Relation relation) {
        return relationDao.updateRelation(id,relation);
    }

    @Override
    public int deleteRelation(Integer id) {
        return relationDao.deleteRelation(id);
    }
}
