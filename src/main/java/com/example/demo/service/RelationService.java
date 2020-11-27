package com.example.demo.service;




import com.example.demo.entity.Relation;

import java.util.List;

public interface RelationService {


    //获取家属信息，通过id
    Relation getRelationById(Integer id);

    //获取家属信息，通过姓名
    Relation relationLogin(String name);

    //获取所有家属信息
    public List<Relation> getRelationList();



    //添加家属信息
    public int addRelation(Relation relation);

    //更新家属信息
    public int updateRelation(Integer id, Relation relation);

    //删除家属信息
    public int deleteRelation(Integer id);
}
