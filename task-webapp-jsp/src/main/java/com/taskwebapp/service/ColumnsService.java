package com.taskwebapp.service;

import com.taskwebapp.entity.ColumnEntity;

import java.util.List;

public interface ColumnsService {
    List<ColumnEntity> findAll(String columnName);
}
