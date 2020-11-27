package com.example.demo.service.impl;



import com.example.demo.dao.MedicineDao;
import com.example.demo.entity.Medicine;
import com.example.demo.service.MedicineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicineServiceImpl implements MedicineService {

    @Autowired
    private MedicineDao medicineDao;

    @Override
    public List<Medicine> getMedicineList() {
        return medicineDao.getMedicineList();
    }
}
