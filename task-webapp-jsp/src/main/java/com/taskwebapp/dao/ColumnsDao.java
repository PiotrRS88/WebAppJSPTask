package com.taskwebapp.dao;

import com.taskwebapp.entity.ColumnEntity;

import java.util.List;

public interface ColumnsDao {
    List<ColumnEntity> findAll(String columnName);
}
