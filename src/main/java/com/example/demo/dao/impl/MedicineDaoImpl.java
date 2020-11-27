package com.example.demo.dao.impl;


import com.example.demo.dao.MedicineDao;
import com.example.demo.entity.Medicine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MedicineDaoImpl implements MedicineDao {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public List<Medicine> getMedicineList() {
        List<Medicine> medicineList = jdbcTemplate.query("select * from medicine", new Object[]{}, new BeanPropertyRowMapper(Medicine.class));
        if (medicineList != null && medicineList.size() > 0) {
            return medicineList;
        } else {
            return null;
        }
    }
}
