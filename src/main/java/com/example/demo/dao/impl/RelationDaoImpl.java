package com.example.demo.dao.impl;




import com.example.demo.dao.RelationDao;
import com.example.demo.entity.Relation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class RelationDaoImpl implements RelationDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public Relation getRelationById(Integer id) {
        List<Relation> list = jdbcTemplate.query("select * from relation where id = ?", new Object[]{id}, new BeanPropertyRowMapper(Relation.class));
        if(list!=null && list.size()>0){
            return list.get(0);
        }else{
            return null;
        }
    }

    @Override
    public List<Relation> getRelationList() {
        List<Relation> list = jdbcTemplate.query("select * from relation", new Object[]{}, new BeanPropertyRowMapper(Relation.class));
        if(list!=null && list.size()>0){
            return list;
        }else{
            return null;
        }
    }

    @Override
    public Relation relationLogin(String name) {
        List<Relation> list = jdbcTemplate.query("select * from relation where name = ?", new Object[]{name}, new BeanPropertyRowMapper(Relation.class));
        if(list!=null && list.size()>0){
            return list.get(0);
        }else{
            return null;
        }
    }


    @Override
    public int addRelation(Relation relation) {
        return jdbcTemplate.update("insert into person(id,name, age) values(?, ?, ?)",
                relation.getId(),relation.getAge());
    }

    @Override
    public int updateRelation(Integer id, Relation relation) {
        return jdbcTemplate.update("UPDATE person SET name = ? , age = ? WHERE id=?",
                relation.getName(),relation.getAge(), id);
    }

    @Override
    public int deleteRelation(Integer id) {
        return jdbcTemplate.update("DELETE from relation where id = ? ",id);
    }

}
