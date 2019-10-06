package com.taskwebapp.service;

import com.taskwebapp.dao.ColumnDao;
import com.taskwebapp.entity.ColumnEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class ColumnServiceImpl implements ColumnService {
    @Autowired
    ColumnDao columnDao;

    @Override
    public List<ColumnEntity> findAllByParam(String columnName, boolean unique) {

        switch (columnName) {
            case "kolumna1":
                return columnDao.findByKolumna1(unique);
            case "kolumna2":
                return columnDao.findByKolumna2(unique);
            case "kolumna3":
                return columnDao.findByKolumna3(unique);
            case "kolumna4":
                return columnDao.findByKolumna4(unique);
            default:
                return new ArrayList<>();
        }
    }
}
