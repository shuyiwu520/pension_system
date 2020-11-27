package com.example.demo.dao.impl;



import com.example.demo.dao.PersonDao;
import com.example.demo.entity.Person;
import com.example.demo.entity.PersonCondition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PersonDaoImpl implements PersonDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;


    //  初始化老人位置信息
    @Override
    public List<Person> getPersonLocationList() {
        List<Person> list = jdbcTemplate.query("select * from personlocation", new Object[]{}, new BeanPropertyRowMapper(Person.class));
        if (list != null && list.size() > 0) {
            return list;
        } else {
            return null;
        }
    }

    //  老人是否出现危险信号
    @Override
    public List<Person> getPersonDangerousList() {
        List<Person> list = jdbcTemplate.query("select * from personlocation", new Object[]{}, new BeanPropertyRowMapper(Person.class));
        if (list != null && list.size() > 0) {
            return list;
        } else {
            return null;
        }
    }

    //  检测所有老人老人是否出现危险信号
    @Override
    public List<Person> getPersonDangerous() {
        List<Person> list = jdbcTemplate.query("select * from personlocation where id =3", new Object[]{}, new BeanPropertyRowMapper(Person.class));
        if (list != null && list.size() > 0) {
            return list;
        } else {
            return null;
        }
    }



    //    老人健康状况
    @Override
    public List<PersonCondition> getPersonCondition() {
        List<PersonCondition> personConditionList = jdbcTemplate.query("select * from personcondition", new Object[]{}, new BeanPropertyRowMapper(PersonCondition.class));
        if (personConditionList != null && personConditionList.size() > 0) {
            return personConditionList;
        } else {
            return null;
        }
    }




    @Override
    public List<Person> getPersonList() {
        List<Person> list = jdbcTemplate.query("select * from person", new Object[]{}, new BeanPropertyRowMapper(Person.class));
        if(list!=null && list.size()>0){
            return list;
        }else{
            return null;
        }
    }

    @Override
    public Person getPersonLocation(Integer id) {
        System.out.println(id);
        List<Person> list = jdbcTemplate.query("select * from personloction where id = ?", new Object[]{id}, new BeanPropertyRowMapper(Person.class));
        System.out.println("执行打印。。。。。");
        System.out.println(list);
        if(list!=null && list.size()>0){
            return list.get(0);
        }else{
            return null;
        }
    }


    @Override
    public int addPerson(Person person) {
        return jdbcTemplate.update("insert into person(id,name, age) values(?, ?, ?)",
                person.getId(),person.getAge());
    }

    @Override
    public int updatePerson(Integer id, Person person) {
        return jdbcTemplate.update("UPDATE person SET name = ? , age = ? WHERE id=?",
                person.getName(),person.getAge(), id);
    }

    @Override
    public int deletePerson(Integer id) {
        return jdbcTemplate.update("DELETE from person where id = ? ",id);
    }





}
