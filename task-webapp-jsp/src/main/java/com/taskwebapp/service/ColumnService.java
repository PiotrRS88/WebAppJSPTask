package com.taskwebapp.service;

import com.taskwebapp.entity.ColumnEntity;

import java.util.List;

public interface ColumnService {
    List<ColumnEntity> findAllByParam(String columnName, boolean unique);
}
