package com.taskwebapp.service;

import com.taskwebapp.dao.ColumnDao;
import com.taskwebapp.entity.ColumnEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ColumnServiceImpl implements ColumnService {
    @Autowired
    ColumnDao columnDao;

    public static final String DEFAULT_COLUMN = "kolumna1";

    @Override
    public List<ColumnEntity> findAll(String columnName) {

        return columnDao.findAll(columnName != null ? columnName : DEFAULT_COLUMN);
    }
}
