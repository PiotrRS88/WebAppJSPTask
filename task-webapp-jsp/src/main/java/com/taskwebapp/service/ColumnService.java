package com.taskwebapp.service;

import com.taskwebapp.entity.ColumnEntity;

import java.util.List;

public interface ColumnService {
    List<ColumnEntity> findAll(String columnName);
}
