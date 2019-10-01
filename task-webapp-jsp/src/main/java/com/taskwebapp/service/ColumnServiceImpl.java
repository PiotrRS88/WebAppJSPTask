package com.taskwebapp.service;

import com.taskwebapp.dao.ColumnsDao;
import com.taskwebapp.entity.ColumnEntity;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ColumnServiceImpl implements ColumnsService{
    @Resource
    ColumnsDao columnsDao;

    public static final String DEFAULT_COLUMN = "kolumna1";

    @Override
    public List<ColumnEntity> findAll(String columnName) {

        return columnsDao.findAll(columnName != null ? columnName : DEFAULT_COLUMN);
    }
}
